package timus;

import java.util.Scanner;

class Task1025 {
    static void main () {
        Scanner userInput = new Scanner(System.in);

        int nOfGroups = userInput.nextInt();
        int[] groupSizes = new int[nOfGroups];
        for (int i = 0; i < nOfGroups; i++) {
            groupSizes[i] = userInput.nextInt();
        }

        while (true) {
            int i = 0;
            int j = 0;

            while (i < groupSizes.length - 1) {
                if (groupSizes[j] > groupSizes[j + 1]) {
                    int tmp = groupSizes[j];
                    groupSizes[j] = groupSizes[j + 1];
                    groupSizes[j + 1] = tmp;
                }
                else j++;
                i++;
            }

            if (i == j) break;
        }

        int result = 0;
        for (int i = 0, firstGroups = (groupSizes.length / 2) + 1; i < firstGroups; i++) {
            result += ((groupSizes[i] / 2) + 1);
        }
        System.out.println(result);

        userInput.close();
    }
}