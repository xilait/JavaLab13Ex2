package exercise.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate");
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Experience: " + experienceInYears + " years");
        System.out.println("English Level: " + englishLevel);
        System.out.println("Salary: $" + salary);
    }

    public void printInfo(boolean includeSalary) {
        printInfo();
        if (includeSalary) {
            System.out.println("Salary: $" + salary);
        }
    }

    public void printInfo(String additionalInfo) {
        printInfo();
        System.out.println("Additional Info: " + additionalInfo);
    }

    public static void staticMethodExample() {
        System.out.println("This is a static method example");
    }
}