package election.src.fr.esgi.poo.election;

public class Elector {
    private int _id;
    private Candidate _vote;

    /**
     * Create an elector with an id
     * @param id
     */
    public Elector(int id) {
        _id = id;
    }

    /**
     * Vote for a candidate
     * @param candidate
     */
    public void voteFor(Candidate candidate) {
        candidate.addVote();
        _vote = candidate;
    }

    /**
     * Get the name of the candidate voted by the elector
     * @return the name of the candidate voted by the elector in a String
     */
    public String toString() {
        return "Elector " + _id + " voted for " + _vote.getName();
    }
}
