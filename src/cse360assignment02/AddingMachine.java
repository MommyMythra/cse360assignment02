package cse360assignment02;

/**
 * This class is a simple bit that adds, subtracts, and tracks the history of a total value
 */
public class AddingMachine {
    private int total;

    /**
     * Constructor that instantiates any AddingMachine object
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    /**
     * This method returns the total of the program
     * @return the total of the program
     */
    public int getTotal () {
        return 0;
    }

    /**
     * Adds the passed value to the total.
     * @param value added to the total
     */
    public void add (int value) {
    }

    /**
     * Subtracts the passed value from the total.
     * @param value being subtracted from the total
     */
    public void subtract (int value) {
    }

    /**
     * This tracks and then returns every transaction committed by the program
     * These transactions are the "memory" of the program.
     * @return a string that represents the history of the transactions
     */
    public String toString () {
        return "";
    }

    /**
     * This empties out the "memory" of the program
     */
    public void clear() {
    }
}