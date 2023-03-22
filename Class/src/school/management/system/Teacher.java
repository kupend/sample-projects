package school.management.system;

/**
 * created by kupendra
 * this class is responsible for keeping the track of teachers name,id,salary.
 */
public class Teacher {
    private int Id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * creates a new teacher object
     * @param Id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */


    public Teacher(int Id,String name,int salary) {
        this.Id=Id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return the id of the teacher
     */
    public int getId(){
        return Id;
    }

    /**
     *
     * @return name of the teacher
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return the salary of the teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     * update the salary.
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary=salary;
    }

    /**
     * adds to salaryEarned.
     * remove from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary (int salary) {

        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }
}
