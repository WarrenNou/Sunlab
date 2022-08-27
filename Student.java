/***
 * Class to model the entity Student
 * @author Warren Noubi
 * @version 0.1
 * Date of creation: 08/27/2022
 * Last Date Modified: 08/27/2022
 */
public class Student extends Person {
    // Data members
    private int id;
    private String major;
    /***
     * Default constructor
     * No parameters
     * Initializes id and major
     */
    public Student(){
        super();
        id=0;
        major="none";
    }
    /***
     * Constructor with six parameters
     * @param	name for the name of a person
     * @param	address for the address of a person
     * @param	phone for the phone number of a person
     * @param	email for the email address of a person
     * @param	major for the major of the person
     * @param  id for the id of the person
     */
    public  Student(String name, int id, String major, String address, String phone, String email) {
        super(name, address,phone,email);
        this.id=id;
        this.major=major;
        
    }

    /***
     * creating getters and setter for the variables
     */
    public int getId() { return id; }
    public  String getMajor() { return major; }
    public void  setId(int id) { this.id = id; }
    public void setMajor(String major) { this.major = major; }
    /***
     * Method to get the Student  information
     * no parameters
     * @return formatted string containing the value of the data members
     */
    @Override
    public String toString() {
        String out= super.toString();
        out+= String.format("iD: Major",id,major);
        return out;}
}