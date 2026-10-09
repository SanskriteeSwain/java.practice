import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===STUDENT GRADE CALCULATOR===");
        System.out.println("Enter marks for Introduction to Computer Programming: ");
        int m1 = sc.nextInt();
        System.out.println("Enter marks for Introductary Problem Solving: ");
        int m2 = sc.nextInt();
        System.out.println("Enter marks for Digital Fabrication Techniques: ");
        int m3 = sc.nextInt();
        System.out.println("Enter marks for Calculus A: ");
        int m4 = sc.nextInt();
        System.out.println("Enter marks for University Physics Mechanics: ");
        int m5 = sc.nextInt();
        System.out.println("Enter marks for Discrete Mathematics: ");
        int m6 = sc.nextInt();
        System.out.println("Enter marks for Univarsal Human Values: ");
        int m7 = sc.nextInt();
        if (m1 < 0 || m1 > 100 ||
            m2 < 0 || m2 > 100 ||
            m3 < 0 || m3 > 100 ||
            m4 < 0 || m4 > 100 ||
            m5 < 0 || m5 > 100 ||
            m6 < 0 || m6 > 100 ||
            m7 < 0 || m7 > 100) {
             System.out.println("Invalid Marks!!");
     } else {
           int total = m1 + m2 + m3 + m4 + m5 + m6 + m7;
           double percentage = (total / 700.0)*100;
           System.out.println("Total marks: " + total + "/700");
           System.out.println("Percentage: " + percentage + "%");
           if (m1 < 33 || m2 < 33 || m3 < 33 || m4 < 33 || m5 < 33 || m6 < 33 || m7 < 33) {
            System.out.println(" RESULT: FAIL");
     }else {
        System.out.println("RESULT: PASS");
        if (percentage >= 90) {
            System.out.println("GRADE: A+");
     } else if (percentage >= 80){
        System.out.println("GRADE: A");
        } else if (percentage >= 70){
        System.out.println("GRADE: B");
        } else if (percentage >= 60){
        System.out.println("GRADE: C");
        } else if (percentage >= 50){
        System.out.println("GRADE: D");
        } else if (percentage >= 40){
        System.out.println("GRADE: E");
        } else {
            System.out.println("GRADE: F");
        }
             }

     }
       sc.close();

    }
    
}
