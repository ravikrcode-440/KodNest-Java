package assignment;

public class CheckStudentGrade {
    public static void main(String[] args) {
        int marks = 89;
        String res = (marks >= 90) ? "Grade A" : ((marks >= 80) ? "Grade B" : ((marks >= 70) ? "Grade C" : ((marks >= 60) ? "Grade D" : "Grade F")));
        System.out.println(res);
    }
}
