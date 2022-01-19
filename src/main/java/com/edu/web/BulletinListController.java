package com.edu.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.common.Controller;
import com.edu.common.HttpUtil;
import com.edu.service.BulletinService;
import com.edu.serviceimpl.BulletinDAO;
import com.edu.vo.BulletinVO;

public class BulletinListController implements Controller

{

	public void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	
		String path = "bulletin/bulletinList.tiles";
		
		BulletinService service= new BulletinDAO();
		List<BulletinVO>list = service.selectList();
		for(BulletinVO vo : list) {
			System.out.println(vo);
		}
		
		
	    req.setAttribute("bulletinList", list);	
	   HttpUtil.forward(req, resp, path);
	    
	}

		
		
		
}

		
		

