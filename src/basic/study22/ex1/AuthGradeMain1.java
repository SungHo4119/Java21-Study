package basic.study22.ex1;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();

        for (AuthGrade authGrade : authGrades) {
            System.out.println("Grade = " + authGrade.name() + ", Level = " + authGrade.getLevel()
                + ", Description = " + authGrade.getDescription());
        }
    }
}
