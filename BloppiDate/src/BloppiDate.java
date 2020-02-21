
public class BloppiDate {

    private final int daysSinceEpoch;

    public BloppiDate(int year, int month, int day) {
        if (month > 11 || month < 0) { throw new IllegalArgumentException("Month out of bounds"); }
        if (day > 29 || day < 0) { throw new IllegalArgumentException("Day out of bounds"); }

        daysSinceEpoch = TotalDays(year, month, day);
    }

    public BloppiDate(int days) {
        daysSinceEpoch = days;
    }

    private static int TotalDays(int year, int month, int day) {
        int multiplier = year >= 0? 1 : -1;
        return (Math.abs(year)*360 + (month) * 30 + (day)) * multiplier;
    }

    public String toString() {
        return Math.abs(daysSinceEpoch % 30) + "/" + Math.abs((daysSinceEpoch / 30) % 12) + "/" + (daysSinceEpoch / 30 / 12);
    }

    public BloppiDate AddDays(int days) {
        return new BloppiDate(this.daysSinceEpoch + days);
    }

    public int DiffDays(BloppiDate other) {
        return (other.daysSinceEpoch - this.daysSinceEpoch);
    }
}
