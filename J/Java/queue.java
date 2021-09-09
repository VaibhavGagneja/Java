// import javax.xml.crypto.Data;

public class queue {

    int rear, front = -1;
    

    int size,cap=0;
    int arr[]; 

    queue(int capacity){
            cap=capacity;
            size=0;
            arr =new int[cap];
        }

      void enqueue(int data){

        if(isEmpty()){
            front=rear=0;
            arr[front]=data;
            size++;
        }else if(isFull()){
            return;
        }else if(!isEmpty()){
            
            
            arr[++this.rear]=data;
            size++;
        }
      }  
      int dequeue(){
          int data=0;
          if(isEmpty()){
              return -1;
          }else {
              data = arr[front];

                for(int i=0;i<size;i++){
                    arr[i]=arr[i+1];
                }
            front++;
            size--;

            return data;
          }
      }
      void printAll(){
          for(int i:arr){
              System.out.println(i);
          }
      }
      void peek(){
          System.out.println(arr[front]);
      }

    boolean isEmpty(){
        return (size==0);
    }
    boolean isFull(){
       return size==cap;
    }

    public static void main(String[] args) {
        queue q = new queue(10);
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.enqueue(15);
        q.enqueue(88);
        q.enqueue(99);
        // q.printAll();
        q.dequeue();
        q.printAll();
        
    }
}
