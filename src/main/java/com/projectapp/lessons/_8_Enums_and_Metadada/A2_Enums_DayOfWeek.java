package com.projectapp.lessons._8_Enums_and_Metadada;

/**
 *
 */
public enum A2_Enums_DayOfWeek {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THUESDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),;

    private int days;

    A2_Enums_DayOfWeek(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }


}
