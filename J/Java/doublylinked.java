public class doublylinked {
    node head;
    node tail;
    public static class node{
        int data;
        node next;
        node prev;
        node(int a){
            data = a;
            prev=next=null;
        }
    }
    // void gettail(){
    //     if(this.head == null)
    //     this.tail =this.head;
    //     node tmp = this.head;
    //     while (tmp.next!=null) {
    //         tmp = tmp.next;
    //     }
    //     this.tail =tmp;
    //     // return tmp;
    // }

    void addLast(int data){
        node tmp = new node(data);
        if(this.head==null){
            this.head=tmp;
            tmp.next = null;
            tmp.prev = null;
            this.tail = this.head;
        }
        
        this.tail.next = tmp;
        tmp.prev = this.tail;
        tmp.next = null;
        this.tail =tmp;
        // return this.head;

        // gettail();

    }
    void addFirst(int data){
        node tmp =new node(data);

        if(this.head == null){
            this.head = tmp;
            tmp.next = null;
            tmp.prev = null;
            this.tail = tmp;
        }

        this.head.prev= tmp;
        tmp.prev = null;
        tmp.next = this.head;
        this.head = tmp;
        // gettail();
    }
    void reverse(){
        node n = this.head;
        node tmp =null;
        
        while(n!=null){

            tmp = n.prev;
            n.prev = n.next;
            n.next = tmp;
            n=n.prev;
        }
        this.head = tmp.prev;
    }

    void deletehead(){
        if (this.head==null || this.head.next==null) {
            this.head=null;
            return;
        }

        this.head = this.head.next;
        this.head.prev = null;

    }
    void deletetail(){
        if (this.head==null || this.head.next==null) {
            this.head=null;
            return;
        }

        this.tail = this.tail.prev;
        this.tail.next = null;

    }
    void print(){
        node tmp = this.head;
        while(tmp!=null)
        {
            System.out.println(tmp.data);
            tmp=tmp.next;
        }
    }

    public static void main(String[] args) {
        doublylinked dl = new doublylinked();
        dl.head = null;
        dl.tail = null;
        // dl.tail = dl.gettail(dl.head);
        dl.addLast(12);
        dl.addFirst(32);
        dl.addLast(89);
        dl.addLast(10);
        dl.addFirst(2);
        dl.print();
        System.out.println();
        // dl.reverse();
        // dl.print();
        dl.deletehead();
        dl.deletetail();
        dl.print();
    }

}
/*in above addlast function we can either use this keyword and void together or we can return the head pointer reference to the caller object  
otherwise it gives a null pointer exception in this case this keyword means that for particular object say dl of the class doublylinked
the functions other than main function acts as the  blueprint for the object or a layout so this keyword says that hey doublylinked class object dl change this.head for my 
blueprint  */