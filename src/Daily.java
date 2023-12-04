public class Daily {

    int days;
    int dailyRate;

    public Daily (int days, int dailyRate) {
        this.days = days;
        this.dailyRate = dailyRate;
    }
    public int getSalaryD() {
        return days * dailyRate;
    }
}
