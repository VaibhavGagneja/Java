package gfg_qs;
import java.util.*;

public class rotatearray {
    public static void main (String[] args) {
		//code
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		while(t-->0){
		    
		    
		    int size = scn.nextInt();
		    int k = scn.nextInt();
		    int arr[] = new int[size];
		    for(int i=0;i<size;i++){
		        arr[i]= scn.nextInt();
		   }
		    rotate(arr,k);
		    print(arr);
		    
		}
	}
		 public  static void rotate(int arr[],int k){
		     
		  //   k=k%arr.length;
		  //   if(k<0) k=k+arr.length;
		     
		     reverse(arr,0,k-1);
		    print(arr);
            System.out.println();
            reverse(arr,k,arr.length-1);
		    print(arr);
            System.out.println();
		     reverse(arr,0,arr.length-1);
              print(arr);
            System.out.println();
		     
		 }   
		 
		 public static void reverse(int arr[],int s,int k){
		     int i=s;
		     int j=k;
		     while(i<j){
		         int temp = arr[i];
		         arr[i] = arr[j];
		         arr[j] =temp;
		         i++;
		         j--;
		     }
		 }
		 public static void print(int arr[]){
		     for(int i:arr){
		         System.out.print(i+" ");
		     }
		         System.out.println();
		     
		 }
}
