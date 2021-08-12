package com.newlecture.web.controller.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.mvc.Controller;

import com.newlecture.web.service.NoticeService;

@Controller
public class ListController {
//public class ListController implements Controller {

	/*
	//@Autowired
	private NoticeService noticeService;
	
	@Autowired
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}

	@RequestMapping("/notice/list")
	public String list(){

		System.out.println("/notice/list");
		
		return "notice.list";
	}
	*/
	/*
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.print("controller");
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("notice.list");
		//mv.addObject("data", "Hello MVC ~");
		//mv.setViewName("/WEB-INF/view/notice/list.jsp");
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		mv.addObject("list", list);
		
		return mv;
	}
	 */
}
