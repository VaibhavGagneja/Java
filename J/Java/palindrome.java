import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        palindrome1(str);
        scn.close();
    }

    static void palindrome1(String str){
        StringBuilder sbr = new StringBuilder();
        sbr.append(str);
        System.out.println(sbr);
        int i = 0;
        int j = sbr.length()-1;
        while(i<j){
            
            if(sbr.charAt(i) == sbr.charAt(j)){
                
            }
            i++;
            j--;
        }
    }
}
