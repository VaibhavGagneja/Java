class linkedstack {

public static class node{
    int data;
    node next;
    public node(int val){
        data=val;
        next=null;
    }
}

public static class mystack{
    node head;
    int size;

    mystack(){
        head=null;
        size = 0;
    }
    boolean isEmpty(){
        if(head == null) {return true;}
        else return false;
    }

    void push(int val){
        node temp = new node(val);
        temp.next = head;
        head=temp;
        size++;
    }

    int pop(){

        if(isEmpty()){
            return -1;
        }
        int ses = head.data;
        head=head.next;
        size--;
        return ses;
    }
    int peek(){
        if(isEmpty()){
            return -1;
        }else
        return head.data;
    }

    int size(){
        return size;
    }
}
public static void main(String[] args) {
    
    mystack stack = new mystack();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    System.out.println(stack.peek());
    stack.pop();
    stack.pop();
    System.out.println(stack.peek());
    System.err.println(    stack.size()    );    


}


}