package stack;

import java.util.Scanner;
import java.util.Stack;

public class balanceparan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean x = checkparenthesis(str);
        System.out.println(x);
    }

    static boolean checkparenthesis(String str){
            
        Stack<Character> st = new Stack<>();
        for(int i =0;i<str.length();i++){
                char ch = str.charAt(i);

                if(ch=='}'){
                    if(st.peek()=='{')
                    st.pop();
                    else return false;
                }else if(ch==']'){
                    if(st.peek()=='[')
                    st.pop();
                    else return false;
                }else if(ch==')'){
                    if(st.peek()=='(')
                    st.pop();
                    else return false;
                }else {
                    st.push(ch);
                }
            }
            if(st.size()==0){
                return true;
            }else {
                return false;
            }
    }
}
