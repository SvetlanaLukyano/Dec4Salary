public class Hourly {
    int hours;
    int hourlyRate;

    public Hourly(int hours, int hourlyRate) {
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }
    public int getSalaryH() {
        return hours * hourlyRate;
    }
}
