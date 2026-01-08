package lr3;

class Task10 {
    void main() {
        int[] numbers  = new int[50];
        for (int i = 0; i < numbers.length; i++) numbers[i] = (int) (Math.random() * 100);

        for (int i = 0, j, tmp; i < numbers.length; i++) {
            j = i;
            for (int k = i + 1; k < numbers.length; k++) if (numbers[j] < numbers[k]) j = k;
            if (i != j)
            {
                tmp = numbers[j];
                numbers[j] = numbers[i];
                numbers[i] = tmp;
            }
            System.out.printf("%d ", numbers[i]);
        }
    }
}