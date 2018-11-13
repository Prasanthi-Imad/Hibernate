package com.training.entity;

public class Player {
	int playerId;
	String playerName;
	int numOfmatches;
	int totalRunsScored;
	int numOfWickets;
	boolean captain;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getNumOfmatches() {
		return numOfmatches;
	}
	public void setNumOfmatches(int numOfmatches) {
		this.numOfmatches = numOfmatches;
	}
	public int getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(int totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	public int getNumOfWickets() {
		return numOfWickets;
	}
	public void setNumOfWickets(int numOfWickets) {
		this.numOfWickets = numOfWickets;
	}
	public boolean isCaptain() {
		return captain;
	}
	public void setCaptain(boolean captain) {
		this.captain = captain;
	}
	public Player(int playerId, String playerName, int numOfmatches,
			int totalRunsScored, int numOfWickets, boolean captain) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.numOfmatches = numOfmatches;
		this.totalRunsScored = totalRunsScored;
		this.numOfWickets = numOfWickets;
		this.captain = captain;
	}
	public Player() {
		super();
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName
				+ ", numOfmatches=" + numOfmatches + ", totalRunsScored="
				+ totalRunsScored + ", numOfWickets=" + numOfWickets
				+ ", captain=" + captain + "]";
	}
	public String getBattingRating(){
		double average = this.totalRunsScored/this.numOfmatches;
		if(average>20){
			return "Best";
		}
		else if(average>=15){
			return "Good";
		}
		else if(average>=10){
			return "Average";
		}
		else {
			return "Poor";
		}
	}
		public String getBowlingRating(){
			double average = this.numOfWickets/this.numOfmatches;
			if(average>=4){
				return "Best";
			}
			else if(average>=3){
				return "Good";
			}
			else if(average>=2){
				return "Average";
			}
			else {
				return "Poor";
			}
		
		
		
		
		
	}
}
