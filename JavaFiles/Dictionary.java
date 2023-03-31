package JavaFiles;

import java.util.Scanner;

public class Dictionary {
    class DicData {
        String[] koreanW = {"컴퓨터", "냉장고", "노트북", "에어컨", "구매"};
        String[] englishW = {"computer", "refrigerator", "laptop", "airConditioner", "purchase"};

        public String search(String input) {
            for (int i = 0; i < koreanW.length; i++) {
                if (koreanW[i].equals(input)) {
                    return englishW[i];
                }
            }
            return "Not found";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        String input;

        System.out.println("한글 단어를 입력하세요.");
        input = scanner.nextLine();

        System.out.println(dictionary.new DicData().search(input));
    }
}
