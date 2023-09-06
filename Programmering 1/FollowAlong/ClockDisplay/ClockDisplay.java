
/**
 * Write a description of class ClockDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClockDisplay
{

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;

    /*
     * Creates an instance of the ClockDsiplay class.
     * the start time will be "00:00"
     */
    public ClockDisplay()
    {
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        this.seconds = new NumberDisplay(60);
    }   
    /*
     * Creates an instance of the ClockDsiplay class.
     * the start time will be "initialHours:initialMinutes" (not plaint text)
     */
    public ClockDisplay(int initialHours, int initialMinutes, int initialSeconds)
    {
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        this.seconds = new NumberDisplay(60);

        // sets starting values
        this.hours.setValue(initialHours);
        this.minutes.setValue(initialMinutes);
        this.seconds.setValue(initialMinutes);
    }   

    /*
     * Returns the time as a string on the format "02:23"
     * 
     * @return the time as a string
     */
    public String getTimeAsString()
    {
        String timeAsString = hours.getDisplayValue()
                              + ";"
                              + minutes.getDisplayValue()
                              + ";"
                              + seconds.getDisplayValue();
        return timeAsString;
    }

    /*
     * Increments the clock by one time tick
     */

    public void incrementTime()
    {
        this.seconds.incrementValue();
        if (this.seconds.getValue() == 0)
        {
            // The minutes have rolled over
            // Increment minutes
            this.minutes.incrementValue();
        }
        
        if (this.minutes.getValue() == 0)
        {
            // The minutes have rolled over
            // Increment hours
            this.hours.incrementValue();
        }
    }

}
