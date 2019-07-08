package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.BallsData;
import com.example.repo.BallsDataRepo;

@RestController
public class WebController {
	
	@Autowired
	BallsDataRepo repo;
	
	@RequestMapping("/cricket_api")
	public BallsData returnScoreBoard() {
		BallsData ballsData = repo.findFirstByOrderByIdDesc();
		return  ballsData;
	}
	
	@RequestMapping("/match_details")
	public List<BallsData>  returnmatchDetails()
	{
		List<BallsData> matchDetails = repo.findMatchDetails();
		return matchDetails;
	}


}
