package ru.netology.stats;

public class StatsService {
    public int sum(int[] array) {
        int result = 0;
        for (int i : array) {
            result += i;

        }
        return result;
    }

    public int average(int[] array) {
        return sum(array) / array.length;
    }

    public int FindMonthMaxSale(int[] array) {
        int max = 0;

        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        int month = 0;
        int result = 0;
        for (int i : array) {
            month++;
            if (i == max) {
                result = month;
            }
        }
        return result;
    }

    public int FindMonthMinSale(int[] array) {
        int min = array[0];

        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        int month = 0;
        int result = 0;
        for (int i : array) {
            month++;
            if (i == min) {
                result = month;
            }
        }
        return result;

    }

    public int MonthCountLessThenAverage(int[] array) {
        int monthCount = 0;
        int average = average(array);
        for (int i : array) {
            if (i < average)
                monthCount++;
        }
        return monthCount;
    }

    public int MonthCountMoreThenAverage(int[] array) {
        int monthCount = 0;
        int average = average(array);
        for (int i : array) {
            if (i > average)
                monthCount++;
        }
        return monthCount;
    }


}
