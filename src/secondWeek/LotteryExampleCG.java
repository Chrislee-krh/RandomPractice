package secondWeek;

import java.util.Random;

public class LotteryExampleCG {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] selectedNumbers = new int[6]; // 선택한 숫자를 저장할 배열
        int index = 0; // 배열의 인덱스

        while (index < 6) {
            int num = rand.nextInt(45) + 1;
            boolean isDuplicate = false;

            // 중복 검사
            for (int i = 0; i < index; i++) {
                if (selectedNumbers[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                selectedNumbers[index] = num;
                index++;
            }
        }

        // 선택한 숫자 출력
        for (int num : selectedNumbers) {
            System.out.print(num + "\t");
        }
    }
}
