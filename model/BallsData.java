package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name =  "balls_data")
public class BallsData 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ball_id")
	private int id;
	
	@Column(name = "ballno")
	private int ballno;
	
	@Column(name = "prev_team_score")
	private int prev_team_score;
	
	@Column(name = "team_name")
	private String team_name; 
	
	@Column(name = "team_total_runs")
	private int total_runs;
	
	@Column(name = "team_total_wickets")
	private int total_wickets;
	
	@Column(name = "player1")
	private String player1;
	
	@Column(name = "player1_score")
	private int player1_score;
	
	@Column(name = "player2")
	private String player2;
	
	@Column(name = "player2_score")
	private int player2_score;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "series_no")
	private int series_no;
	
	@Column(name = "match_no")
	private int match_no;

	public BallsData() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrevTeamScore() {
		return prev_team_score;
	}

	public String getTeamName() {
		return team_name;
	}

	public int getTotalRuns() {
		return total_runs;
	}

	public int getTotalWickets() {
		return total_wickets;
	}

	public String getPlayer1() {
		return player1;
	}

	public int getPlayer1Score() {
		return player1_score;
	}

	public String getPlayer2() {
		return player2;
	}

	public int getPlayer2Score() {
		return player2_score;
	}

	public String getstatus() {
		return status;
	}
	
	public int getballno() {
		return ballno;
	}
	
	public int getseries_no() {
		return series_no;
	}
	
	public int getmatch_no() {
		return match_no;
	}
}
