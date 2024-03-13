package com.driver;
import java.util.*;
public class OnlineVotingSystem {
    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate(1, "John Doe"),
            new Candidate(2, "Jane Smith"),
            new Candidate(3, "Michael Johnson")
        };

        Voter[] voters = {
            new Voter(1001, "Alice"),
            new Voter(1002, "Bob"),
            new Voter(1003, "Carol")
        };

        Election election = new Election(candidates, voters);

        Scanner scanner = new Scanner(System.in);
        int voterId, candidateId;

        while (true) {
            System.out.println("\n1. Cast Vote");
            System.out.println("2. Get Winner");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your voter ID: ");
                    voterId = scanner.nextInt();
                    System.out.print("Enter the candidate ID you want to vote for: ");
                    candidateId = scanner.nextInt();
                    election.castVote(voterId, candidateId);
                    break;
                case 2:
                    Candidate winner = election.getWinner();
                    System.out.println("The winner is: " + winner.getCandidateName());
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
