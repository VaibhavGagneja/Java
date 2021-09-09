public class palindromeinteger {
    public static void main(String[] args) {
        int x = 123456;
        int no_of_digits = count(x);
        int mx = x;
        double y=0;
//        for(int i=1;mx/i>0;i*=10){
//            int a =no_of_digits;
//            y = (mx/i)%Math.pow(10,a--);
//            System.out.println(y);
//
//        }
//        for(int i=1;i<=no_of_digits;i++){
//            double m = (int)(mx%Math.pow(10,i));
//            m=m/Math.pow(10,i);
//            m=m*Math.pow(10,i);
//            m=m%Math.pow(10,i);
//            System.out.println(m);
//        }
        boolean flag = false;
        int sx = x;
        int nx = x;
        for (int i = 1; i <= no_of_digits; i++) {

            double a = nx / Math.pow(10,no_of_digits);
            a = a*Math.pow(10,i);
            a = a%Math.pow(10,1);


            int b = sx%10;
            sx = sx/10;
//            System.out.println(b);
//            System.out.println((int)a);
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
