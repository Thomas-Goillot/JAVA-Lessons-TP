package election.src.fr.esgi.poo.election;

public class Main {

    public static final int MAX_CANDIDATES = 3;
    public static final int MAX_ELECTORS = 10;

    public static void main(String[] args) {

        // Create a vote place with 3 candidates and 10 electors
        VotePlace votePlace = new VotePlace(MAX_CANDIDATES, MAX_ELECTORS);
        
        // Make the electors vote for a candidate randomly
        votePlace.voteRandom();

        // Display the vote by electors
        votePlace.displayVoteByElectors();
        
        // Display the results of the vote
        votePlace.displayResults();

        // Open the vote
        votePlace.openVote();

        // Make the electors vote for a candidate randomly
        votePlace.voteRandom();

        // Display the vote by electors
        votePlace.displayVoteByElectors();
        
        // Display the results of the vote
        votePlace.displayResults();

        // Close the vote
        votePlace.closeVote();

        // Make the electors vote for a candidate randomly
        votePlace.voteRandom();        
    }
}
