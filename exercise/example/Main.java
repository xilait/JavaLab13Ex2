package exercise.example;

public class Main {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Ivan", "Yakubovich", 5);
        Tester tester2 = new Tester("Mika", "Maeda", 3, "Advanced");
        Tester tester3 = new Tester("Johny", "Silverhand", 8, "Expert", 50000);

        tester1.printInfo();
        System.out.println();
        tester2.printInfo(false);
        System.out.println();
        tester3.printInfo("Employee of the month");

        Tester.staticMethodExample();
    }
}