
public class heap{

    public static class minheap {
        
        int arr[];
        int capacity;
        int size;
        
        minheap(int c){
            capacity = c ;
            arr =new int[capacity];
            size=0;
        }
        static int parent(int i){
            return i-1/2;
        }
        static int left(int i){
            return 2*i+1;
        }
        static int right(int i){
            return 2*i+2;
        }
         void swap(int i,int j,int []arr){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] =temp;
        }
         void insert(int key ){
            // heap h = new heap(12);
            if(size == capacity){
                return;
            }
            size++;
            arr[size-1] = key;
            for(int i = size-1;i!=0 && arr[parent(i)]>arr[i];){
                swap(arr[i], arr[parent(i)], arr);
                i=parent(i);
            }
        }

        void minheapify(int a){

            int lt = left(a);
            int rt = right(a);
            int smallest = a;
            if(lt<size && arr[lt]<arr[smallest]){
                smallest = lt;
            }
            if(rt<size && arr[rt]<arr[smallest]){
                smallest=rt;
            }
            if(smallest!=a){
                swap(arr[a], arr[smallest], arr);
                minheapify(smallest);
            }

        }
        int extractmin(){
            if(size == 0){
                return Integer.MAX_VALUE;
            }
            if(size == 1){
                size--;
                return arr[0];
            }

            swap(0, size-1, arr);
            
            size--;
            minheapify(0);
            return arr[size];
        }
    }
        public static void main(String[] args) {
            minheap m = new minheap(6);
            m.insert(2);
            m.insert(12);
            m.insert(42);
            m.insert(36);
            m.insert(9);
            m.minheapify(45);
            int res = m.extractmin();
            System.out.println(res);
        }   
}
    