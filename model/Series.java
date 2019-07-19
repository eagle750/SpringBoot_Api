package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "series_info")
public class Series {

	@Id
	@Column(name = "series_id")
	private int id;
	
	@Column(name = "team1_name")
	private String team1_name;
	
	@Column(name = "team2_name")
	private String team2_name;
	
	@Column(name = "total_matches")
	private int total_matches;
	
	@Column(name = "team1_won")
	private int team1_won;
	
	@Column(name = "team2_won")
	private int team2_won;
	
	@Column(name = "team_won")
	private String team_won;

	public int getId() {
		return id;
	}

	public String getTeam1_name() {
		return team1_name;
	}

	public String getTeam2_name() {
		return team2_name;
	}

	public int getTotal_matches() {
		return total_matches;
	}

	public int getTeam1_wozn() {
		return team1_won;
	}

	public int getTeam2_won() {
		return team2_won;
	}
	
	public String getTeam_won() {
		return team_won;
	}
}
