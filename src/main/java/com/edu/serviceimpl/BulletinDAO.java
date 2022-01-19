package com.edu.serviceimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edu.common.DAO;
import com.edu.service.BulletinService;
import com.edu.vo.BulletinVO;

public class BulletinDAO extends DAO implements BulletinService {

	public BulletinVO selectOne(int bbsId) {
		BulletinVO bulletin = new BulletinVO();
		connect();
		String sql = "select * from bbs where bbs_id=?";
	
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bbsId);
			rs = psmt.executeQuery();
			while (rs.next()) {
			
				bulletin.setBbsId(rs.getInt("bbs_id"));
				bulletin.setBbsTitle(rs.getString("bbs_title"));
				bulletin.setBbsContent(rs.getString("bbs_content"));
				bulletin.setBbsWriter(rs.getString("bbs_writer"));
				bulletin.setBbsImage(rs.getString("bbs_image"));
				bulletin.setBbsCreateDate(rs.getDate("bbs_create_date"));
				bulletin.setBbsHit(rs.getInt("bbs_hit"));

			

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return bulletin;
	}
		
		
	

	@Override
	public BulletinVO insert(BulletinVO vo) {
		BulletinVO bulletin = new BulletinVO();

		connect();
		String sql1 = "select bbs_id_seq.nextval from dual";
		String sql2 = "insert into bbs(bbs_id,bbs_title,bbs_image,bbs_content,bbs_writer,bbs_create_date,bbs_hit"
				+ " values(?,?,?,?,?,?,?)";

		try {
			psmt = conn.prepareStatement(sql1);
			psmt.executeQuery();
			psmt = conn.prepareStatement(sql2);

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			disconnect();

		}

		return bulletin;
	}

	

	
	// 조회수증가
	public void updateCount(int id) {
		connect();
		String sql = "update bbs set bbs_hit = bbs_hit+1 where bbs_id =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();

		}

	}

	@Override
	public BulletinVO update(BulletinVO vo) {

		connect();
		String sql = "update bbs set bbs_title=?, bbs_content=? bbs_image=nvl(?,bbs_image where bbs_id=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBbsTitle());
			psmt.setString(2, vo.getBbsContent());
			psmt.setString(3, vo.getBbsImage());
			psmt.setInt(4, vo.getBbsId());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 변경 ");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}

	public int delete(int bbsId) {

		connect();

		String sql = "delete from bbs where id = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bbsId);

			int r = psmt.executeUpdate();
			System.out.println(r + "삭제됨 ");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return bbsId;
	}



	@Override
	public List<BulletinVO> selectList() {
		String sql = "select * from bbs order by 1";
		connect();
		List<BulletinVO> list = new ArrayList<>();

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				BulletinVO vo = new BulletinVO();
				vo.setBbsId(rs.getInt("bbs_id"));
				vo.setBbsTitle(rs.getString("bbs_title"));
				vo.setBbsContent(rs.getString("bbs_content"));
				vo.setBbsWriter(rs.getString("bbs_writer"));
				vo.setBbsImage(rs.getString("bbs_image"));
				vo.setBbsCreateDate(rs.getDate("bbs_create_date"));
				vo.setBbsHit(rs.getInt("bbs_hit"));
               list.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
		
	
	}




}
