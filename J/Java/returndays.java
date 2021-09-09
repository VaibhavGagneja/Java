import java.util.Scanner;

public class returndays {
    public static void main(String[] args) {
        
        Scanner scn =new Scanner(System.in);
        int day = scn.nextInt();
        int result = days(day);
        System.out.println(result);
        
    }
    public  static int days(int i){
        int arr[] = {31,28,31,30,31,30,31,31,30,31,30,31};


        return arr[i-1];
    }

}
