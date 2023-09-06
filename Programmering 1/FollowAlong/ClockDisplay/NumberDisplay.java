/**
 * Represents a display showing a value with 2 digits.
 * The value displayed has a upper limit.
 * The value should always be positive. (0 or larger)
 *
 * @author Adrian
 * @version 2023-09-04
 */

public class NumberDisplay
{
    private int value;
    private int upperLimit;

    /*
     * Creates an instance of NumberDisplay with a specific upper limit.
     * 
     * @param upperLimit the upper limit of the value. The value will then be between 0 and upperLimit - 1.
     */

    public NumberDisplay(int upperLimit)
    {
        if (upperLimit >= 0)
        {
            this.upperLimit = upperLimit;
        }
    }

    /*
     * Increments the value by 1, if the upper limit is reached value is set to 0
     */
    public void incrementValue()
    {
        this.value = (this.value + 1) % this.upperLimit;
    }

    /*
     * Sets the value to the parameter, if the parameter is valid.
     * 
     * @param value is the value which will replace the value in the NumberDisplay object
     */
    public void setValue(int value)
    {
        if ( (value < 0) || (value >= this.upperLimit) )
        {
            return;
        }
        this.value = value;
    }

    // Returns the value variable
    public int getValue()
    {
        return this.value;
    }

    /*
     * Returns the value as a 2 digit string. If value is less than 10
     * the value is padded with a "0"
     * Returns the value to display as a string.
     */
    public String getDisplayValue()
    {
        String valueToDisplay;
        if (this.value < 10)
        {
            valueToDisplay = "0" + this.value;
        }
        else 
        {
            valueToDisplay = "" + this.value;
        }



        return valueToDisplay;
    }

}




