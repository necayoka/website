package com.neca.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neca.web.dao.FeedbackDao;
import com.neca.web.model.FeedBackModel;

@Controller
public class IndexController {
	
	FeedBackModel fModel;
	
	@Autowired
	FeedbackDao fDao;
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/feedback.htm")
	public String feedback() {
		return "feedback2.jsp";
	}
	
	@RequestMapping("addFeedback")
	public String addFeedback(@ModelAttribute FeedBackModel fModel) {
		fDao.addFeedback(fModel);
		return "welcom.jsp";
	}
	
}
