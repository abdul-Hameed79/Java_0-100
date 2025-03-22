import java.util.ArrayList;

public class PerfectSquareFilter {
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static void main(String[] args) {
        int[] numbers = {16, 23, 36, 45, 50};
        ArrayList<Integer> perfectSquares = new ArrayList<>();

        // Filtering perfect squares
        for (int num : numbers) {
            if (isPerfectSquare(num)) {
                perfectSquares.add(num);
            }
        }

        // Printing the perfect squares
        System.out.println("Perfect square numbers: " + perfectSquares);
    }
}