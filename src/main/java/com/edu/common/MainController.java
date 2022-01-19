package com.edu.common;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainController implements Controller{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	String welcome = "¹Ý°©½À´Ï´Ù"	;
	
	req.setAttribute("msg",welcome);
	req.getRequestDispatcher("member/memberList.tiles").forward(req, resp);
	

}	
	}

	 
	


