package assignment;

public class CheckVoteEligibity {
    public static void main(String[] args) {
        int age = 66;
        String res = (age >= 18) ? "eligible for vote " : "not eligible for vote ";
        System.out.println(res);
    }
}
