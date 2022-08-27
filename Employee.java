/***
 * Class to model the entity Employee
 * @author Warren Noubi
 * @version 0.1
 * Date of creation: 08/27/2022
 * Last Date Modified: 08/27/2022
 */
public class Employee extends Person  {
    // Data members
        private int id;
        private  String position;
        private double salary;
    /***
     * Default constructor
     * No parameters
     * Initializes id, position and salary
     */
        public Employee() {
            super();
            id = 0;
            position ="none";
            salary=0.0;
        }
    /***
     * Constructor with seven parameters
     * @param	name for the name of an employee
     * @param	address for the address of an employee
     * @param	phone for the phone number of an employee
     * @param	email for the email address of an employee
     * @param	position for the position of the an employee
     * @param   salary for the salary of the   an employee
     * @param  id for the id of the an employee
     */
    public Employee(String name, String address, String phone, String email, int id ,String position, double salary){
        super(name, address, phone, email);
        this.id = id;
        this.position = position;
        this.salary = salary;
    }
    /***
     * creating getters and setter for the variables
     */
    public int getId() {
       return id;
    }
public String getPosition() {
return position;
}

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    /***
     * Method to get the Employee  information
     * no parameters
     * @return formatted string containing the value of the data members
     */
    @Override
    public String toString() {
        String out= super.toString();
        out += String.format("ID: Position, \n" +
                " Salary",id,position,salary);

        return out;
    }
}