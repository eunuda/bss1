package com.edu.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.service.BulletinService;
import com.edu.serviceimpl.BulletinDAO;
import com.edu.vo.BulletinVO;

public class BulletinUpdateController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
//입력값을 읽어오고 업뎃 메소드호출결과 : 리스트페이지.
	
	String id = req.getParameter("id");
	String title = req.getParameter("title");
	String content = req.getParameter("content");
			
	BulletinVO vo = new BulletinVO();
	vo.setBbsId(Integer.parseInt(id));
	vo.setBbsTitle(title);
	vo.setBbsContent(content);
	
	System.out.println(vo);
	BulletinService service = new BulletinDAO();
	service.update(vo);
	
	resp.sendRedirect(content);

	}

}