
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 수열 A (N1개의 원소로 이루어짐)
        // 수열 B (N2개의 원소로 이루어짐)
        // A의 원소들을 연속하게 뽑았을 때 수열 B가 나오면 연속부분수열
        Scanner sc = new Scanner(System.in);
        int aSize = sc.nextInt();
        int bSize = sc.nextInt();
        int[] sequenceA = new int[aSize + 1];
        int[] sequenceB = new int[bSize + 1];

        for (int i = 1; i <= aSize; i++) {
            sequenceA[i] = sc.nextInt();
        }

        for (int i = 1; i <= bSize; i++) {
            sequenceB[i] = sc.nextInt();
        }

        // 1. A 수열 중에 B 첫번째랑 같은 곳 위치 찾기
        // 2. A 포인터 증가시켜가면서 B 전체가 순서대로 포함되는지 찾기
        // 3. 일치하지 않으면 A의 다음 위치부터 다시 탐색하기
        boolean isContinue = false;

        for (int aIndex = 1; aIndex <= aSize - bSize + 1; aIndex++) {
            if (sequenceA[aIndex] != sequenceB[1]) {
                continue;
            }

            // B의 첫 번째 원소와 일치하는 위치부터 비교
            int aPointer = aIndex;
            boolean isMatch = true;

            for (int bIndex = 1; bIndex <= bSize; bIndex++) {
                if (sequenceA[aPointer] != sequenceB[bIndex]) {
                    isMatch = false;
                    break;
                }

                aPointer++;
            }

            // B의 모든 원소가 연속으로 일치하면 탐색 종료
            if (isMatch) {
                isContinue = true;
                break;
            }
        }

        if (!isContinue) {
            System.out.print("No");
        } else {
            System.out.print("Yes");
        }
    }
}
