
public class linkedqueue {

    public static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            next = null;
        }
    }
    node front ,rear;
    int size;
    linkedqueue(){
        front=rear=null;
        size=0;
    }
    void enqueue(int data){
        node temp =new node(data);
        size++;
        if(front == null){
            front=rear=temp;
        }
        rear.next=temp;
        rear =temp;
    }

    void dequeue(){
        size--;
        if(front==null){
            return;
        }
        front=front.next;
        if(front.next==null){
            front=rear=null;
        }
    }
    void display(node temp){
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        linkedqueue q = new linkedqueue();
        q.enqueue(12);
        q.enqueue(24);
        q.enqueue(36);
        q.enqueue(48);
        q.enqueue(60);
        q.display(q.front);
        q.dequeue();
        q.display(q.front);
    }
}
