package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"lizzy",500);
        Teacher mellisa = new Teacher(2,"Mellisa",700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1,"Tamasha",4);
        Student kupendra = new Student(2,"Kupendra",12);
        Student reddy = new Student(3,"Reddy",10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(kupendra);
        studentList.add(reddy);

        School ghs = new School (teacherList,studentList);

        tamasha.payFees(5000);


        kupendra.payFees(6000);
        System.out.println("Ghs has earned $"+ghs.getTotalMoneyEarned());
        System.out.println("----making School pay salary---");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("ghs has spent for salary to" + lizzy.getName()
        +" and now has $"+ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("ghs has spent for salary to" + vanderhorn.getName()
                +" and now has $"+ghs.getTotalMoneyEarned());

        System.out.println(reddy);

    }
}
