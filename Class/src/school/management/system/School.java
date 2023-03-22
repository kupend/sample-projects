package school.management.system;

import java.util.List;

/**
 * many teachers,many students
 * implements teachers and students using an Arraylist
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teacherList, List<Student> studentList) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }


    /**
     * new school object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */

    public void setTeacher(List<Teacher> teachers,List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     *
     * @return the list of teachers int the school
     */

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);

    }

    /**
     *
     * @return the list of students in school
     */

    public List<Student> getStudents() {
        return students;
    }

    /**
     * adds a student to the school
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        students.add(student);

    }

    /**
     *
     * @return the total money earned by the school
     */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * adds total money earned by school
     * @param MoneyEarned money that is supposed to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which is the money salary
     * given by the school to ts teachers
     * @param MoneySpent the money spent by school
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }



}
