package practice_exams.mid.past_exam_2020_07_05;

import java.util.Scanner;

public class N01SoftUniReception {
    private static final int employeesCount = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacityPerHour = 0;
        for (int i = 0; i < employeesCount; i++) {
            capacityPerHour += Integer.parseInt(scanner.nextLine());
        }
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int hoursCounter = 0;

        while (studentsCount > 0) {
            hoursCounter++;
            if (hoursCounter % 4 != 0) {
                studentsCount -= capacityPerHour;
            }
        }
        System.out.printf("Time needed: %dh.", hoursCounter);
    }
}
