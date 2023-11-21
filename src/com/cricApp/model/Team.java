package com.cricApp.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cricApp.model.comporators.PlayerEconomyComparator;
import com.cricApp.model.comporators.PlayerStrikeRateComparator;
import com.cricApp.model.exceptions.PlayerDoesNotExistException;

public class Team {
	
	private String name;
	private int size;
	private List<Player> players = new ArrayList<>();

	public Team(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public Team() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Player> getPlayers() {
		return players;
	}

	// ====================== Start of C ========================

	public void addPlayers(List<Player> players) {
		// To-Do
	}

	// to add 1 player
	public void addPlayer(Player player) {
		// To-Do
	}

	// ====================== End of C ===========================
	// ====================== Start of R =========================

	// get player by name
	public Player getPlayerByName(String name) {
		// To-Do
		return null ; 
	}// end of getPlayerByName

	// to get all batsmen
	public List<Batsman> getBatsmen() {
		// To-Do
		return null ;
	}// end of getBatsmen

	// to get all bowlers
	public List<Bowler> getBowlers() {
		// To-Do
		return null;
	}// end of getBowlers

	// to check wicketkeeper is available or not
	public boolean hasWicketKeeper() {
		// To-Do
		return false;
	}

	// to get a wicket keeper
	public Player getWicketKeeper() {
		// To-Do
		return null;
	}

	// to return top 3 economic bowler
	public Bowler[] getTopThreeEconomicalBowler() {
		// To-Do
		return null;
	}

	// to return top three batsmen based on Strikerate
	public Batsman[] getTopThreeEfficientBatsmen() {
		// To-Do
		return null;
	}

	public int getPlayerPos(Player oldPlayer) {
		// To-Do
		return  -1;
	}

	// ======================= End Of R ======================================

	// ======================= Start of U ====================================
	// to replace a bowler
	public boolean replaceBowler(Bowler oldBowler, Bowler newBowler) {
		// To-Do
		return false;
	}

	// to replace a batsman
	public boolean replaceBatsman(Batsman oldBatsman, Batsman newBatsman) {
		// To-Do
		return false;
	}
	
	// to replace wicketKeeper 
	public boolean replaceWicketKeeper(Player oldKeeper , Player newKeeper) {
		// To-Do
		return false  ; 
	}
	//============================ end of U ==========================
	//============================ start of D ========================
	// to remove a player 
	public boolean removePlayer(Player p ) {
		// To-Do
		return false ; 
	}

} // end of class