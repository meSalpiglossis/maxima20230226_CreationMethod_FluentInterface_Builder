package creationmethod;

public class Case {

    public final String firstName;
    public final String middleName;
    public final String lastName;
    public final String sex;
    public final int age;
    public final boolean infant;
    public final String job;
    public final String sport;
    public final String driver;
    public final String health;
    public final String surgicalInterventions;
    public final int averageMonthIncome;

    public Case(String firstName,
                String middleName,
                String lastName,
                String sex,
                int age,
                boolean infant,
                String job,
                String sport,
                String driver,
                String health,
                String surgicalInterventions,
                int averageMonthIncome) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.infant = infant;
        this.job = job;
        this.sport = sport;
        this.driver = driver;
        this.health = health;
        this.surgicalInterventions = surgicalInterventions;
        this.averageMonthIncome = averageMonthIncome;
    }

    public static Case createCaseForHealthyBaby(String firstName,
                                                String middleName,
                                                String lastName,
                                                String sex,
                                                int age,
                                                String health,
                                                String surgicalInterventions) {
        return new Case(firstName,
                        middleName,
                        lastName,
                        sex,
                        age,
                        true,
                        null,
                        null,
                        null,
                        health,
                        surgicalInterventions,
                        0);
    }

    public static Case CreateCaseForRecruit(String firstName,
                                            String middleName,
                                            String lastName,
                                            String sex,
                                            int age,
                                            String job,
                                            String sport,
                                            String driver,
                                            String health,
                                            String surgicalInterventions,
                                            int averageMonthIncome) {

        return new Case(firstName,
                        middleName,
                        lastName,
                        sex,
                        age,
                        false,
                        job,
                        sport,
                        driver,
                        health,
                        surgicalInterventions,
                        averageMonthIncome);
    }

    @Override
    public String toString() {
        return
            "First name: " + firstName + '\n' +
            "Middle name: " + middleName + '\n' +
            "Last name: " + lastName + '\n' +
            "Sex: " + sex + '\n' +
            "Age: " + age + '\n' +
            "Infant: " + infant + '\n' +
            "Job: " + job + '\n' +
            "Sport: " + sport + '\n' +
            "Driver: " + driver + '\n' +
            "Health status: " + health + '\n' +
            "Surgical interventions: " + surgicalInterventions + '\n' +
            "Average month income: " + averageMonthIncome;
    }
}
