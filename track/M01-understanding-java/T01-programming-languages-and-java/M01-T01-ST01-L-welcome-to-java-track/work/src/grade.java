public class grade {
    public static void main(String[] args) {
        int marks = 68;
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade B");
        } else if (marks >= 61 && marks <= 80) {
            System.out.println("Grade C");
        } else if (marks >= 35 && marks <= 60) {
            System.out.println("Grade E");
        } else {
            System.out.println("you are great ....leave India");
        }
    }
}
