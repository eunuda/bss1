package com.edu.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.service.BulletinService;
import com.edu.serviceimpl.BulletinDAO;

public class BulletinDeleteController implements Controller {


	public void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
//�Է°� ->����->����Ʈ
		String id = req.getParameter("id");
		
		BulletinService service =  new BulletinDAO();
		service.delete(Integer.parseInt(id));
		resp.sendRedirect("bulletinList.do");
		
		
	}

}