// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Daily dailySalary = new Daily(6, 2000);
        System.out.println("The salary for 6 days is " + dailySalary.getSalaryD());

        Hourly hourlySalary = new Hourly(8, 500);
        System.out.println("The salary for 8 hours is " + hourlySalary.getSalaryH());


    }
}