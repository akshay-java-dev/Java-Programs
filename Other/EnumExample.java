
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {

        Day today = Day.SATURDAY;

        System.out.println("Today: " + today);

        System.out.println("All days:");

        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
