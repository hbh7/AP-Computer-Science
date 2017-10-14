import java.util.*;
import java.util.stream.Stream;

public class proj3_5 {
    static class Job {
        double wage;
        List<WorkDay> workDays;

        Job(double wage) {
            this.wage = wage;
            this.workDays = new ArrayList<>();
        }

        void addWorkDay(WorkDay workDay) {
            this.workDays.add(workDay);
        }

        double getPaycheck() {
            return this.workDays.stream()
                    .mapToDouble(d -> (d.getRegularHours() * this.wage) + (d.getOvertimeHours() * this.wage * 1.5))
                    .sum();
        }
    }

    static class WorkDay {
        Day day;
        double regularHours;
        double overtimeHours;

        WorkDay(Day day, double regularHours, double overtimeHours) {
            this.day = day;
            this.regularHours = regularHours;
            this.overtimeHours = overtimeHours;
        }

        double getRegularHours() {
            return regularHours;
        }

        void setRegularHours(double regularHours) {
            this.regularHours = regularHours;
        }

        double getOvertimeHours() {
            return overtimeHours;
        }

        void setOvertimeHours(double overtimeHours) {
            this.overtimeHours = overtimeHours;
        }
    }

    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY
    }

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your hourly wage? ");
        Job job = new Job(scanner.nextDouble());

        Stream.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY)
                .map(d -> {
                    System.out.print("How many regular hours did you work on " + d.name() + "? ");
                    double r = scanner.nextDouble();
                    System.out.print("How many overtime hours did you work on " + d.name() + "? ");
                    double o = scanner.nextDouble();
                    return new WorkDay(d, r, o);
                })
                .forEach(job::addWorkDay);

        System.out.println("Your total paycheck is " + job.getPaycheck() + ". Good job!");
    }
}
