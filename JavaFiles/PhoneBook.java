package JavaFiles;

import java.util.Scanner;

class Phone {
    private String name;
    private String phoneNumber;

    public Phone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}

public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] phoneBook = new Phone[100];
        int count = 0;
        boolean Running = true;

        while (Running) {
            System.out.println("1 >> 전화번호 입력");
            System.out.println("2 >> 전화번호 검색");
            System.out.println("3 >> 종료");
            System.out.print("번호를 선택해주세요 >> ");
            int listNum = sc.nextInt();
            sc.nextLine();

            switch (listNum) {
                case 1:
                    System.out.println("이름과 전화번호를 입력해주세요. (예 >> 김철수 010-1234-5678)");
                    String input = sc.nextLine();
                    String[] sInput = input.split(" ");
                    String name = sInput[0];
                    String phoneNumber = sInput[1];
                    phoneBook[count] = new Phone(name, phoneNumber);
                    count++;
                    break;
                case 2:
                    System.out.println("검색할 이름을 입력해주세요.");
                    String searchName = sc.nextLine();
                    boolean Found = false;
                    for (int i = 0; i < count; i++) {
                        if (phoneBook[i].getName().equals(searchName)) {
                            System.out.println(phoneBook[i].getName() + "님의 전화번호는 " + phoneBook[i].getPhoneNumber() + "입니다.");
                            Found = true;
                            break;
                        }
                    }
                    if (!Found) {
                        System.out.println(searchName + "님의 전화번호를 찾을 수 없습니다.");
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    Running = false;
                    break;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}