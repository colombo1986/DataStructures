import java.sql.PreparedStatement;

public class RecursionTest {
    public static void main(String[] args) {

        recursionTest(new int[]{20, 35, -15, 7, 55, 1, -22}, 7, 3);
    }

    public static void recursionTest(int[] input , int start, int end) {
        System.out.println(start-end);

        if (start - end < 2) {
            return ;
        }

        int mid = (start + end)/2 ;
        recursionTest(input , start , mid);
      }
}
