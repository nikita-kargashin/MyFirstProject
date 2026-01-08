package lr3;

class Task9 {
    void main () {
        int[] numbers  = new int[50];
        int smallestN = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
            if (numbers[i] < smallestN) smallestN = numbers[i];
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] == smallestN) System.out.printf("\nnumbers[%d] = %d", i, smallestN);
        System.out.println();
    }
}