package com.edu.service;

import java.util.List;

import com.edu.vo.BulletinVO;

public interface BulletinService {
	
	public List<BulletinVO> selectList();

    public BulletinVO selectOne(int bbsId);

    public BulletinVO insert(BulletinVO vo);

    public BulletinVO update(BulletinVO vo);

    public int delete(int bbsId);
    
    
	
}
