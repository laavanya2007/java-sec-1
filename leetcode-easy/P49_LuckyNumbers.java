import java.util.*;

public class P49_LuckyNumbers {
    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minCol = 0;
            for (int j = 1; j < matrix[i].length; j++)
                if (matrix[i][j] < matrix[i][minCol]) minCol = j;
            int val = matrix[i][minCol];
            boolean isMax = true;
            for (int[] row : matrix)
                if (row[minCol] > val) isMax = false;
            if (isMax) ans.add(val);
        }
        return ans;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Lucky Numbers in a Matrix (LeetCode 1380)");
        check(luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}).toString(), "[15]");
        check(luckyNumbers(new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}}).toString(), "[12]");
        if (failed > 0) System.exit(1);
    }
}
