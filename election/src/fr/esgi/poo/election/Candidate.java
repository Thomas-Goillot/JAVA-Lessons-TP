 zpackage election.src.fr.esgi.poo.election;

public class Candidate {
    private String _name;
    private int _votes;

    /**
     * Create a candidate with a name
     * @param name
     */
    public Candidate(String name) {
        _name = name;
    }

    /**
     * Get the name of the candidate
     * @return the name of the candidate
     */
    public String getName() {
        return _name;
    }

    /**
     * Add a vote to the candidate
     */
    public void addVote() {
        _votes++;
    }

    /**
     * Get the number of votes of the candidate
     * @return the number of votes of the candidate
     */
    public int getVotes() {
        return _votes;
    }

    /**
     * Get the name of the candidate and the number of votes
     * @return the name of the candidate and the number of votes in a string
     */
    public String toString() {
        return _name + " (" + _votes + ")";
    }

}
