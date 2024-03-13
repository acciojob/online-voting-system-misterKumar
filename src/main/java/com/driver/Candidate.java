package com.driver;
public class Candidate {
    private int candidateId;
    private String candidateName;
    private int votesReceived;

    public Candidate(int candidateId, String candidateName) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.votesReceived = 0;
    }

    public int getCandidateId() {
        //your code goes here
    	return candidateId;
    }

    public String getCandidateName() {
    	//your code goes here
    	return candidateName;
    }

    public int getVotesReceived() {
    	//your code goes here
    	return votesReceived;
    }

    public void addVote() {
        //your code goes here
    }
}