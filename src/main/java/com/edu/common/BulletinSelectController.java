package com.edu.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.service.BulletinService;
import com.edu.serviceimpl.BulletinDAO;
import com.edu.vo.BulletinVO;

public class BulletinSelectController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		String path = "bulletin/bulletin.tiles";
		String id = req.getParameter("id");

		BulletinService service = new BulletinDAO();
		BulletinVO vo = service.selectOne(Integer.parseInt(id));
		req.setAttribute("bulletin", vo);
		HttpUtil.forward(req, resp, path); 
		
	}

}
