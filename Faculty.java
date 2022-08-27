/***
 * Class to model the entity Faculty
 * @author Warren Noubi
 * @version 0.1
 * Date of creation: 08/27/2022
 * Last Date Modified: 08/27/2022
 */
public class Faculty extends Employee {
    private String rank ;
    /***
     * Default constructor
     * No parameters
     * Initializes rank
     */
    public Faculty(){
        super();
        this.rank = "none";
    }
    /***
     * Constructor with six parameters
     * @param	name for the name of faculty
     * @param	address for the address of faculty
     * @param	phone for the phone number of faculty
     * @param	email for the email address of faculty
     * @param	position for the position of the faculty
     * @param   salary for the salary of the faculty
     * @param  id for the id of the faculty
     * @param salary for the salary of the faculty
     * @param  rank for the rank of the faculty
     */
    public Faculty(String name, String address, String phone, String email, int id , String position , double salary, String rank){
        super(name, address, phone, email, id, position, salary) ;
        this.rank = rank;
    } 

    public String getRank(String rank){
        return rank;
    }
    /***
     * Method to get the Faculty  information
     * no parameters
     * @return formatted string containing the value of the data members
     */
    @Override
    public String toString() {
        String out=super.toString();
        out += "Rank:"+ rank + "\n";
        return out;

    }


    public void setRank(String rank) {
        this.rank = rank;
    }
}
