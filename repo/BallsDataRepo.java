package com.example.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.BallsData;

@Repository
public interface BallsDataRepo extends JpaRepository<BallsData, Integer>{

	public BallsData findFirstByOrderByIdDesc();
	
	public static final String FIND_SPECIFIC_OVER_DETAILS = "SELECT * FROM balls_data WHERE series_no = (SELECT series_no FROM balls_data  ORDER BY ball_id DESC LIMIT 1)";

	@Query(value = FIND_SPECIFIC_OVER_DETAILS, nativeQuery = true)
	public List<BallsData> findMatchDetails();
}
