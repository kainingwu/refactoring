package theater;

/**
 * The class representing a play.
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Returns the name of the play.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the type of the play.
     * @return the type
     */
    public String getType() {
        return type;
    }
}
