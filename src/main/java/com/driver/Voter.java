package com.driver;
public class Voter {
    private int voterId;
    private String voterName;
    private boolean hasVoted;

    public Voter(int voterId, String voterName) {
        this.voterId = voterId;
        this.voterName = voterName;
        this.hasVoted = false;
    }

    public int getVoterId() {
    	//your code goes here
    	return voterId;
    	
    }

    public String getVoterName() {
    	//your code goes here
    	return voterName;
    }

    public boolean hasVoted() {
    	//your code goes here
    	return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
    	//your code goes here
    	this.hasVoted = hasVoted;
    }
}