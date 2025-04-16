package md.enums;

public enum DayOfWeek {
    LUNI("Lu", false),
    MARTI("Ma", false),
    MIERCURI("Mi", false),
    JOI("Jo", false),
    VINERI("Vi", false),
    SAMBATA("Sa", true),
    DUMINICA("Du", true);

    private final String shortName;
    private final boolean isWeekend;

    DayOfWeek(String shortName, boolean isWeekend) {
        this.shortName = shortName;
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public String getShortName() {
        return shortName;
    }
}
