/**
 * This class is for the problem 3 and includes 3 methods 
 * with a constructor.
 */
public class Reader
{
    private String name;
    private String TCID;
    private String answer;
    
    /**
     * Is constructor for the class Reader, and 
     * sets the private variables to their values.
     */
    public Reader(String name, String TCID, String answer)
    {
        this.name=name;
        this.TCID=TCID;
        this.answer= answer;
    }
    /**
     * Returns the name of the reader.
     */
    public String getname()
    {
        return this.name;
    }
    /**
     * Returns the TC ID of the reader.
     */
    public String getTCID()
    {
        return this.TCID;
    }
    /**
     * Returns the answer of the reader.
     */
    public String getanswer()
    {
        return this.answer;
    }
}