package com.example.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.BallsData;
import com.example.model.Series;
import com.example.repo.BallsDataRepo;
import com.example.repo.SeriesRepo;

@RestController
public class WebController {
	
	@Autowired
	BallsDataRepo repo;
	@Autowired
	SeriesRepo seriesRepo;
	
	@RequestMapping("/cricket_api")
	public List<Object> returnScoreBoard() {
		BallsData ballsData = repo.findFirstByOrderByIdDesc();
		Series series = seriesRepo.findFirstByOrderByIdDesc();
		List<Object> match_details =  new ArrayList<Object>();
		match_details.add(ballsData);
		match_details.add(series);
		return  match_details;
	}
	
	@RequestMapping("/match_details/{id}")
	public List<BallsData>  returnmatchDetails(@PathVariable int id)
	{
		List<BallsData> matchDetails = repo.findSpecificMatchDetails(id);
		return matchDetails;
	}

	@RequestMapping("/match_details/all")
	public List<BallsData>  returnmatchDetails()
	{
		List<BallsData> matchDetails = repo.findMatchDetails();
		return matchDetails;
	}
}
