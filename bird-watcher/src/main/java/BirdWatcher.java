import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay.length > 0 ? birdsPerDay[6] : 0;
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        long emptyDays = Arrays.stream(birdsPerDay)
                    .filter(b -> b == 0)
                    .count();
        return emptyDays != 0;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > 7) {
            numberOfDays = 7;
        }
        return Arrays.stream(birdsPerDay)
                .limit(numberOfDays)
                .sum();
    }

    public int getBusyDays() {
        return (int)Arrays.stream(birdsPerDay)
                .filter(b -> b > 4)
                .count();
    }
}
