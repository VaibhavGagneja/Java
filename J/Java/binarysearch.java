

class binarysearch{
    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,4,5,6,7,8};
        
        int srch = 5;
        int m = Rbinary(array,0,array.length-1,srch);
        System.out.println(m);
    }
    public static int binary(int array[] ,int srch){

       int low = 0;
       int high = array.length-1;
       
       while(low<=high){
           
           int mid = (low+high)/2;
           if(srch>array[mid]){
               low=mid+1;
            
            }else if(srch<array[mid]){
                high=mid-1;
            }else{
                return mid;
            }
            
            
        }

        return -1;
    }

    public static int Rbinary(int arr[],int low,int high,int srch){
        
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]==srch){
            return mid;
        }

        else if(srch>arr[mid]){
            return Rbinary(arr, mid +1, high, srch);
        }else{
            return Rbinary(arr, low, mid-1, srch);
        }
        
        
    }
}