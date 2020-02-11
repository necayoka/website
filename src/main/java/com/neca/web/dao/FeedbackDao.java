package com.neca.web.dao;

import org.springframework.stereotype.Component;

import com.neca.web.model.FeedBackModel;

@Component
public class FeedbackDao {

	public void addFeedback(FeedBackModel fModel) {
		System.out.println("added in feedback " + fModel);
	}
	
}
