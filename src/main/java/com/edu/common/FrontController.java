package com.edu.common;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.web.BulletinAddController;
import com.edu.web.BulletinListController;


public class FrontController extends HttpServlet{
	Map<String, Controller> map = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		map = new HashMap<String, Controller>();
		
		map.put("/main.do", new MainController());
		map.put("/bulletinList.do", new BulletinListController());
		map.put("/bulletinForm.do", new BulletinFormController());
		map.put("/bulletinAdd.do", new BulletinAddController());
		map.put("/bulletinSelect.do", new BulletinSelectController());
		map.put("/bulletinUpdate.do", new BulletinUpdateController());
		map.put("/bulletinDelete.do", new BulletinDeleteController());
		
		
	
	}
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		

		String uri = req.getRequestURI(); // /edu2/commentAdd.do, /edu2/memberList.do
		String context = req.getContextPath(); // /edu2
		String path = uri.substring(context.length()); ///memberList.do  
		System.out.println(path);
		Controller control = map.get(path); //new CommentAddController()
		
		
		try {
			control.execute(req, resp);
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}

}
