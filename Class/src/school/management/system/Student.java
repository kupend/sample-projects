package school.management.system;

/**
 * created by kupendra
 * this class is responsible for keep the track of students fees, name,grade
 * fees paid
 */

public class Student {

    private int Id;
    private String Name;
    private int Grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * to create a new student obj by intializing.
     * fees for every student is $30,000.
     * fees paid initially is 0.
     * @param Id id for the student: unique,
     * @param Name name of the student.
     * @param Grade grade of the student.
     */

    public Student(int Id,String Name,int Grade) {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.Id = Id;
        this.Name=Name;
        this.Grade=Grade;

    }
    //not going to alter student names.

    /**
     * used to update the students grade.
     * @param grade new grade of the student.
     */
    public void setGrade(int grade) {
        this.Grade=Grade;
    }

    /**
     * keep adding the fees to feespaid field.
     * add the fees to the fees paid.
     * the school is going receive the funds.
     * @param fees the fees that the student pays
     */
    public void payFees(int fees) {
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return Id;
    }

    /**
     *
     * @returnname of the student
     */

    public String getName() {
        return Name;
    }

    /**
     *
     * @return the grade of the student
     */

    public int getGrade() {
        return Grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student
     */

    public int getFeesTotal() {
        return feesTotal;

    }
    public int getRemainingFees() {
        return feesTotal-feesPaid;    }

    @Override
    public String toString() {
        return "Students name:"+Name+
                "total fees paid so far "+feesPaid;
    }
}
