package com.xworkz.olympicapp.dto;

public class GameDTO {

	
	public GameDTO(){
		System.out.println(this.getClass().getSimpleName()+"object created");
		}

	private int gameId;
	private String gameName;
	private int players;
	
	
	public boolean isAdded;

	public void setGameId(int gameId){
	this.gameId=gameId;
	}

	public int getGameId(){
	return gameId;
	}

	public void setGameName(String gameName){
	this.gameName=gameName;
	}

	public String getGameName1(){
	return gameName;
	}

	public void setPlayers(int players){
	this.players=players;
	}

	public int getPlayers(){
	return players;
	}

	
	@Override
	public String toString() {
		return "GamesDTO [GameId=" +this.gameId + ", GameName=" +this.gameName + ", Players=" + this.players+ "}";
	}

	public Object getGameName() {
		// TODO Auto-generated method stub
		return null;
	}

	}
