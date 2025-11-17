package theater;

/**
 * Class representing a performance of a play..
 */
public class Performance {

    private String playID;
    private int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Returns the playID of the performance.
     * @return the playID
     */
    public String getPlayID() {
        return playID;
    }

    /**
     * Returns the audience of the performance.
     * @return the audience
     */
    public int getAudience() {
        return audience;
    }
}
