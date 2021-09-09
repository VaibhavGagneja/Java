// { Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
// class isogram
//  {
// 	public static void main (String[] args) throws Exception
// 	 {
// 	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int testCase = Integer.parseInt(br.readLine());
//         while(testCase-- > 0)
//         {
//             String data = br.readLine();
//             Solution obj = new Solution();
//             System.out.println(obj.isIsogram(data)?"1":"0");
            
//         }
// 	 }
// }// } Driver Code Ends





class isogram
{
    //Function to check if a string is Isogram or not.
    public static void main(String[] args) {

        String data = "vaibhav";
        HashSet<Character> h = new HashSet<Character>();
        
        char[] ch = new char[data.length()];
        for(int i=0;i<data.length();i++){
            h.add(data.charAt(i));
            ch[i]=data.charAt(i);
        }
        int x = h.size();

        int y = ch.length;
        StringBuilder str = new StringBuilder();

        for (Character c : h) {
            str.append(c);
        }   
        str.append(h);
        
        System.out.println(x+""+y);
        
        
    }
    // static boolean isIsogram(String data){
    //     //Your code here
        
    //     HashSet<Character> h = new HashSet<Character>();
        
        
    //     for(int i=0;i<data.length();i++){
    //         h.add(data.charAt(i));
    //     }

    //     StringBuilder str = new StringBuilder();
    //        str.append(h);
        
    //     System.out.println(str.toString());
        
    //     return true;
    // }
}