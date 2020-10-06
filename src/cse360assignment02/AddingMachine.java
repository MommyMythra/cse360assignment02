package cse360assignment02;

/**
 * This class is a simple bit that adds, subtracts, and tracks the history of a total value
 */
public class AddingMachine {
    private int total;
    private String history;

    /**
     * Constructor that instantiates any AddingMachine object
     * Sets total to base 0 and history to output "0"
     */
    public AddingMachine() {
        total = 0;  // not needed - included for clarity
        history = "0";
    }

    /**
     * This method returns the total of the program
     *
     * @return the total of the program
     */
    public int getTotal() {
        return total;
    }

    /**
     * Adds the passed value to the total.
     * Also updates the history string to keep the memory up to date
     *
     * @param value added to the total
     */
    public void add(int value) {
        total = total + value;
        history = history + " + " + value;
    }

    /**
     * Subtracts the passed value from the total.
     * Also updates the history string to keep the memory up to date
     *
     * @param value being subtracted from the total
     */
    public void subtract(int value) {
        total = total - value;
        history = history + " - " + value;
    }

    /**
     * This tracks and then returns every transaction committed by the program
     * These transactions are the "memory" of the program.
     *
     * @return a string that represents the history of the transactions
     */
    public String toString() {
        return history;
    }

    /**
     * This empties out the "memory" of the program by setting total back to 0 and setting history back to "0"
     */
    public void clear() {
        total = 0;
        history = "0";
    }
}