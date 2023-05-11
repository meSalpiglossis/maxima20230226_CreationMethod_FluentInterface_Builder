package creationmethod;

public class CMUseDemo {
    public static void main(String[] args) {
        Case specialCase = Case.createCaseForHealthyBaby(
                            "John",
                            "K",
                            "Connor",
                            "M",
                            1,
                            "healthy",
                            "none");

        System.out.println(specialCase);
    }
}
