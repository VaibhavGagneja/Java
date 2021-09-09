
public class circularlist {
    node head;
    static class node {
        int data;
        node next;
        
        node(int d) {
            data = d;
            next = null;
        }
    }

    public static circularlist insertEnd(circularlist l, int data) {
        node tmp = new node(data);
        if(l.head == null){
            l.head = tmp;
            l.head.next = l.head;
        }else {
            node last = l.head;
            while(last.next!=l.head){
                last=last.next;
            }
            tmp.next=l.head;
            last.next = tmp;
        }

        return l;
    }
    public static circularlist insertEnd01(circularlist l, int data) {
        node tmp = new node(data);
        if(l.head == null){
            l.head = tmp;
            l.head.next = l.head;
        }else {
            tmp.next = l.head.next;
            l.head.next = tmp;
            int x = l.head.data;
            l.head.data = l.head.next.data;
            l.head.next.data = x;
            l.head = l.head.next;
        }

        return l;
    }

    public static circularlist insertStart(circularlist l,int data){
        node tmp = new node(data);
        if(l.head == null){
            l.head = tmp;
            l.head.next = l.head;
        }else{
            node last = l.head;
            while(last.next!=l.head){
                last=last.next;
            }
            tmp.next = l.head;
            last.next = tmp;
            l.head = tmp;

        }
        
        return l;
    }
    public static circularlist insertStart01(circularlist l,int data){
        node tmp = new node(data);
        if(l.head == null){
            l.head = tmp;
            l.head.next = l.head;
        }else{
            // node last = l.head;
            
            tmp.next = l.head.next;
            l.head.next = tmp;
            int x = l.head.data;
            l.head.data = l.head.next.data;
            l.head.next.data = x;
            // l.head = tmp;
        }
        
        return l;
    }

    public static circularlist delete(circularlist l){
        if(l.head==null)
        return null;
         if(l.head.next == l.head){
            return null;
        }
            node n = l.head;
            do{
                n=n.next;
            }while(n.next!=l.head);
            l.head= l.head.next;
            n.next = l.head;
        
        return l;
    }
    
    public static circularlist delete01(circularlist l){
        if(l.head==null)
        return null;
         if(l.head.next == l.head){
            return null;
        }
        l.head.data = l.head.next.data;
        l.head.next = l.head.next.next;    
        return l;
    }
    public static circularlist deletekth(circularlist l,int k){

        if(l.head==null ){
            return null;
        }
        node tmp = l.head;
        int m =k-1;
        while(m-->1){
            tmp=tmp.next;

        }
        tmp.next = tmp.next.next;// but this tmp doesnt have acces to list aor return modified list 
                                //  yes this works by using a tmp node to change the original lists references try and brainstorm

        return l;
    }


    public static void printList(circularlist list){
        if(list.head==null) return;
        node tmp = list.head;
        do{
            System.out.println(tmp.data);
            tmp=tmp.next;
        }while(tmp!=list.head);
    } // if you use only while loop then while looop will be infinite; 

    public static void main(String[] args) {
        
        circularlist list1 = new circularlist();
        list1 = insertEnd(list1, 12);
        list1 = insertEnd(list1, 15);
        list1 = insertEnd(list1, 19);
        list1 = insertEnd(list1, 22);
        list1 = insertEnd(list1, 21);
        // list1 = insertEnd01(list1, 99);
        // list1 = insertStart(list1, 9);
        // list1 = insertStart01(list1, 78);
        // list1 = delete(list1);
        // list1 = delete01(list1);
        list1 = deletekth(list1, 4);
        printList(list1);
    }
}
