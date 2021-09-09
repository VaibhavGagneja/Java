import java.util.*;

public class fingerunary1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        String str = count(n);
        System.out.println(str);
        scn.close();
    }

    static String count(int n) {
        int arr[] = new int[10];
        Arrays.fill(arr, 0);
        // Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int k = arr.length;
        int x = n % 10;
        int y = n / 10 * 10;
        if (x < 100 && x > 0) {

            if (x > 5) {
                x = x - 5;
                arr[5] = 1;
            }
            for (int i = k - 1; i > k - 1 - 5; i--) {
                arr[i] = 1;
                x = x - 1;
                if (x == 0)
                    break;
            }

            if (y > 50) {
                y = y - 50;
                arr[4] = 1;
            }
            for (int i = 0; i < k - 1 - 4; i++) {
                arr[i] = 1;
                y = y - 10;
                if (y == 0)
                    break;

            }
        }else {
            System.out.println("input invalid pls type number between 100 and 0 upper limit excluded");
            return null;
        }
        // Collections.reverse(Arrays.asList(arr));
        // System.out.println(x + " " + y);
        String srt = Arrays.toString(arr);
        // System.out.println(srt);
        return srt;
    }

}
