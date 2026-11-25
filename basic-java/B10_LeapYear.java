public class B10_LeapYear {
    public static void main(String[] args) {
        int[] years = {1900, 2000, 2024, 2026};
        for (int year : years) {
            boolean leap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
            System.out.println(year + (leap ? " is a leap year" : " is not a leap year"));
        }
    }
}
