public class MissingNumbersInSeries {
    public static void main(String[] args) {
        int[] series = {1, 5, 11, 19};
        findMissingNumbers(series);
    }
    private static void findMissingNumbers(int[] series) {
        System.out.print("Missing numbers in the series are: ");

        for (int i = 0; i < series.length - 1; i++) {
            int diff = series[i + 1] - series[i];

            if (diff > 1) {
                for (int j = 1; j < diff; j++) {
                    int missingNumber = series[i] + j;
                    System.out.print(missingNumber + " ");
                }
            }
        }

        System.out.println();
    }
}