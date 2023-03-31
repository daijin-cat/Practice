package JavaFiles;

import java.util.Scanner;

class Day {
    private String schedule;

    public Day() {
        schedule = null;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}

public class MonthSchedule {
    Scanner input = new Scanner(System.in);
    Day[] days;
    int choice = 0;

    public MonthSchedule() {
        days = new Day[31];
        for (int i = 0; i < days.length; i++) {
            days[i] = new Day();
        }
    }

    public void run() {
        while (true) {
            System.out.println("1 >> 스케줄 입력");
            System.out.println("2 >> 저장된 스케줄 열람");
            System.out.println("3 >> 종료");
            System.out.print("번호를 선택해주세요 >>  ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("날짜를 입력해주세요(1 ~ 31) >> ");
                    int date = input.nextInt();
                    input.nextLine();
                    System.out.print("스케줄을 입력해주세요 >> ");
                    String event = input.nextLine();
                    days[date-1].setSchedule(event);
                    System.out.println("스케줄이 저장되었습니다.");
                    break;
                case 2:
                    System.out.print("날짜를 입력해주세요(1 ~ 31) >> ");
                    int date2 = input.nextInt();
                    if (date2 < 1 || date2 > 31) {
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                        break;
                    }
                    System.out.println(date2 + "일 스케줄을 열람합니다");
                    if (days[date2-1].getSchedule() != null) {
                        System.out.println(days[date2-1].getSchedule());
                    } else {
                        System.out.println("해당 날짜에 저장된 스케줄이 없습니다.");
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    public static void main(String[] args) {
        MonthSchedule ms = new MonthSchedule();
        ms.run();
    }
}
