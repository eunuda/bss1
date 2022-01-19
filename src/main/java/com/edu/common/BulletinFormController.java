package com.edu.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BulletinFormController implements Controller{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String path ="bulletin/bulletinForm.tiles";
		HttpUtil.forward(req, resp, path);
	}

}


