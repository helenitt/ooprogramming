/** checked exception class, for int values entered outside a given range */
public class AgeInputException extends Exception {

    /** Default prompt message */
    private static final String DEFAULT_MESSAGE = "Input out of bounds";

    /** Lower bound of age input */
    private int lowerBound;

    /** Upper bound of age input */
    private int upperBound;

    /** Entered value */
    private int value;

    /**
     * Default constructor
     *
     @param low   the lower bound of age input
     @param high  the upper bound of age input
     @param input the input value
     */
    public AgeInputException(int low, int high, int input) {
        this(DEFAULT_MESSAGE, low, high, input);
    }

    /**
     * Constructor
     *
     @apram msg   the error message
     @param low   the lower bound of age input
     @param high  the upper bound of age input
     @param input the input value
     */
    public AgeInputException(String msg,
                             int low, int high, int input) {
        super(msg);
		// the throwing method has specified an impossible range
        if (low > high) {
            throw new IllegalArgumentException();
        }
		// copy the range and value into the attributes
        lowerBound = low;
        upperBound = high;
        value      = input;
    }

    /**
     @return the lower bound of the age input
     */
    public int lowerBound() {

        return lowerBound;
    }

    /**
     @return the upper bound of the age input
     */
    public int upperBound() {

        return  upperBound;
    }

    /**
     * Returns the entered value
     *
     @return the entered value
     */
    public int value() {
        return value;
    }

}