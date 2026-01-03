package timus;

import java.util.Scanner;

class Task1005 {
    static void main() {
        Scanner userInput = new Scanner(System.in);
        int[] weights = new int[userInput.nextInt()];
        int totalWeight = 0;

        for (int i = 0; i < weights.length; i++) {
            weights[i] = userInput.nextInt();
            totalWeight += weights[i];
        }

        System.out.println(solve(weights, 0, totalWeight, 0));

        userInput.close();
    }

    private static int solve(int[] weights, int index, int totalWeight, int currentWeight) {
        if (index == weights.length) return Math.abs((currentWeight - (totalWeight - currentWeight)));

        return Math.min(solve(weights, index + 1, totalWeight, currentWeight + weights[index]),
                solve(weights, index + 1, totalWeight, currentWeight));
    }
}