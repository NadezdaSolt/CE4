package CodeAbbey;
//https://www.codeabbey.com/index/task_view/min-of-two
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strNum = scanner.nextInt();
        scanner.nextLine();
        int sum;
        int[][] arrayA = new int[strNum][2];
                for (int i = 0; i < strNum; i++) {
            for (int j = 0; j < 2; j++) {
                arrayA[i][j] = scanner.nextInt();
            }

            if (arrayA[i][0] > arrayA[i][1])
            sum = arrayA[i][1];
            else
            sum = arrayA[i][0];
            System.out.println(sum + " ");
        }
    }
}