package com.driver;
public class Election {
    private Candidate[] candidates;
    private Voter[] voters;

    public Election(Candidate[] candidates, Voter[] voters) {
        this.candidates = candidates;
        this.voters = voters;
    }

    public void castVote(int voterId, int candidateId) {
    	//your code goes here
    }

    public Candidate getWinner() {
    	Candidate winner = candidates[0];
    	//your code goes here
    
    	return winner;
    }
}