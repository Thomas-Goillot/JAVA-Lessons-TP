package election.src.fr.esgi.poo.election;

public class VotePlace {

    private Candidate[] _candidates;
    private Elector[] _electors;
    private boolean _isVoteOpen = false;

    /**
     * Create a vote place with a number of candidates and electors
     * @param candidateNumber
     * @param electorNumber
     */
    public VotePlace(int candidateNumber, int electorNumber) {
        _candidates = new Candidate[candidateNumber];
        _electors = new Elector[electorNumber];

        for (int i = 0; i < candidateNumber; i++) {
            _candidates[i] = new Candidate("Candidate " + i);
        }

        for (int i = 0; i < electorNumber; i++) {
            _electors[i] = new Elector(i);
        }
    }

    /**
     * Vote randomly for a candidate
     */
    public void voteRandom() {
        if (!_isVoteOpen) {
            System.out.println("Vote is not open yet.");
            return;
        }
        for (Elector elector : _electors) {
            elector.voteFor(_candidates[(int) (Math.random() * _candidates.length)]);
        }
    }

    /**
     * Display the results of the vote
     */
    public void displayResults() {
        if(checkIfThereIsSomeVotes()) {
            System.out.println("----- Results: -----");
            for (Candidate candidate : _candidates) {
                System.out.println(candidate.toString());
            }
        }
    }

    /**
     * Display the vote by electors
     */
    public void displayVoteByElectors() {
        if (checkIfThereIsSomeVotes()) {
            System.out.println("----- Vote by electors: -----");
            for (Elector elector : _electors) {
                System.out.println(elector.toString());
            }
        }
    }

    /**
     * Open the vote
     */
    public void openVote() {
        _isVoteOpen = true;
        System.out.println("Vote is open.");

    }

    /**
     * Close the vote
     */
    public void closeVote() {
        _isVoteOpen = false;
        System.out.println("Vote is closed.");
    }

    /**
     * Check if there is some votes
     * @return true if there is some votes, false otherwise
     */
    private boolean checkIfThereIsSomeVotes() {
        for (Candidate candidate : _candidates) {
            if (candidate.getVotes() > 0) {
                return true;
            }
        }
        System.out.println("No votes yet.");
        return false;
    }    

}
