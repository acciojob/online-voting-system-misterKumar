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
        boolean voterFound = false;
        for (Voter voter : voters) {
            if (voter.getVoterId() == voterId) {
                voterFound = true;
                if (!voter.hasVoted()) {
                    for (Candidate candidate : candidates) {
                        if (candidate.getCandidateId() == candidateId) {
                            candidate.addVote();
                            voter.setHasVoted(true);
                            System.out.println("Vote casted successfully for " + candidate.getCandidateName());
                            return;
                        }
                    }
                    System.out.println("Invalid candidate ID. Please try again.");
                } else {
                    System.out.println("Voter with ID " + voterId + " has already voted.");
                }
                break;
            }
        }
        if (!voterFound)
            System.out.println("Voter with ID " + voterId + " not found.");
    }

    public Candidate getWinner() {
    	Candidate winner = candidates[0];
    	//your code goes here
        for (Candidate candidate : candidates) {
            if (candidate.getVotesReceived() > winner.getVotesReceived()) {
                winner = candidate;
            }
        }
    	return winner;
    }
}