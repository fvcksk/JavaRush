package com.javarush.task.pro.task13.task1319;

/*
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public Month[] getWinterMonths() {
        return new Month[]{JANUARY, FEBRUARY, DECEMBER};
    }

    public Month[] getSpringMonths() {
        return new Month[]{MARCH, APRIL, MAY};
    }

    public Month[] getSummerMonths() {
        return new Month[]{JUNE, JULY, AUGUST};
    }

    public Month[] getAutumnMonths() {
        return new Month[] {SEPTEMBER, OCTOBER, NOVEMBER};
    }

}
