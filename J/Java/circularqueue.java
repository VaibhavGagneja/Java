// import jdk.vm.ci.aarch64.AArch64.CPUFeature;

public class circularqueue {
    
    int rear,front=-1;
    int size,capacity=0;
    int arr[];
    
    circularqueue(int capacity){
        this.capacity = capacity;
        front=0;
        rear = capacity-1;
        arr = new int[capacity];
    }
    void enqueue(int data){

        // if(isEmpty()){
        //     front=rear=0;
        //     arr[front]=data;
        //     size++;
         if(isFull()){
            return;
        }else {
            
            rear =(rear+1)%capacity;
            arr[rear]=data;
            size++;
        }
      }  
      int dequeue(){
          int data=0;
          if(isEmpty()){
              return -1;
          }else {
              data = arr[front];

                for(int i=0;i<(size)%capacity;i++){
                    arr[i]=arr[i+1];
                }
            front =(front+1)%capacity;
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
       return size==capacity;
    }

    
    public static void main(String[] args) {
        circularqueue cq = new circularqueue(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        cq.printAll();
        cq.dequeue();
        cq.enqueue(6);
        cq.printAll();
    }
}
