import java.util.*;

public class fingerunary {

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

        int x = n % 10;
        int y = n / 10 * 10;

        if (x > 5) {
            x = x - 5;
            arr[arr.length-1-4]=1;
        }
        for(int i =0;i<x;i++){
            arr[arr.length-1-i]=1;
        }

        if(y>50){
            y=y-50;
            arr[9] = 1;
        }
        for(int i=5;i<y;i++){
            arr[arr.length-1-i] = 1;
            y=y-10;
        }
        Collections.reverse(Arrays.asList(arr));
        // System.out.println(x + " " + y);
        return Arrays.toString(arr);
    }

}
