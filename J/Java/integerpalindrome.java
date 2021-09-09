public class integerpalindrome {
    public static void main(String[] args) {
        int x = 123456;
        int no_of_digits = count(x);
        // int mx = x;
        // double y=0;

        boolean flag = false;
        int sx = x;
        int nx = x;
        for (int i = 1; i <= no_of_digits; i++) {

            double a = nx / Math.pow(10,no_of_digits);
            a = a*Math.pow(10,i);
            a = a%Math.pow(10,1);


            int b = sx%10;
            sx = sx/10;
            if(a==b){
                flag = true;
            }else{
                flag = false;
            }


        }
        if(flag){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    static int count(int x){
        int count1=0;
        while(x>0){
            x=x/10;
            count1++;
        }
        return count1;
    }
}
