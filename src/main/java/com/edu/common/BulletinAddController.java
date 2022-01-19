package com.edu.common;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.service.BulletinService;
import com.edu.serviceimpl.BulletinDAO;
import com.edu.vo.BulletinVO;

public class BulletinAddController implements Controller {

   @Override
   public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // 사용자 입력값을 저장 처리결과: 게시판리스트
      String path = "bulletinList.do";
      
      BulletinVO vo = new BulletinVO();
      vo.setBbsWriter(req.getParameter("writer"));
      vo.setBbsContent(req.getParameter("content"));
      vo.setBbsTitle(req.getParameter("title"));
      if (req.getParameter("image") != null) {
         vo.setBbsImage(req.getParameter("image"));                  
      } else {
         vo.setBbsImage(null);         
      }
      
      BulletinService service = new BulletinDAO();
      service.insert(vo);
      
      HttpUtil.forward(req, resp, path);
   }

}
