enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String name;

    DaysOfWeek(String name) {
        this.name = name;
    }

    public String getName() {
        // Write your code here to return the name of the day
        return name;
    }

    public boolean isWeekday() {
        // Write your code here to check if this day is a weekday
        
        switch (this) {
            case MONDAY:
                return true; 
            case TUESDAY:
                return true; 
            case WEDNESDAY:
                return true;
            case THURSDAY:
                return true; 
            case FRIDAY:
                return true; 
            case SATURDAY:
                return false; 
            case SUNDAY:
                return false; 
        }
    return false;
    }

    public boolean isHoliday() {
        // Write your code here to check if this day is a holiday
        switch (this) {
            case MONDAY:
                return false; 
            case TUESDAY:
                return false; 
            case WEDNESDAY:
                return false;
            case THURSDAY:
                return false; 
            case FRIDAY:
                return false; 
            case SATURDAY:
                return true; 
            case SUNDAY:
                return true; 
        }
        return false;
    }
}