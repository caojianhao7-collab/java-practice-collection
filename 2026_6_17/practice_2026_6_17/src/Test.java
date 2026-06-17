/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-17
 * Time: 23:48
 */
public class Test {

    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6}};
        int[][] arr2 = new int[2][3];
        int[][] arr3 = new int[][]{{1,2,3},{4,5,6}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }

            System.out.println();
        }
    }
}
