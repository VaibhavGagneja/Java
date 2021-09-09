
// package mypack;
public class linkedlist {

    public static void main(String[] args) {
        node list = new node();
         node head = new node(10);
         node temp1 = new node(20);
         node temp2 = new node(30);
        head.next=temp1;
        temp1.next=temp2;

        //  list.RprintAll(head);
         // System.out.println(list.Rfind(head, 20));
         // System.out.println(list.Rfind(head, 30));
        head =  list.insertbegin(head, 90);
        node tail = list.insertlast(head, 60);
        //  list.RprintAll(head);
         //  head = list.deletebegin(head);
         //  list.RprintAll(head);
         //  head = list.deletelast(head);
         //  list.printAll(head);
        //  head= list.insertat(head, 6, 25);
         list.RprintAll(head);
        // head= list.sortinsert(head, 25);
        // list.middleatE(head);
        // list.twonthnode(head, 5);
        System.out.println();
        // head = list.reverse(head);
        //  list.printAll(head);
        // head= list.Rreverse(head);
         list.printAll(head);

    }

    public static class node{
        int data;
        node next;

        node(int x){
            this.data=x;
            this.next=null;
        }
        node(){
            this.data=0;
            this.next=null;
        }

        void printAll(node head){

            node temp = head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }

        }
        void RprintAll(node head){
            if(head == null){
                return;
            }
            // node temp=head;
            System.out.println(head.data+" ");
            RprintAll(head.next);
        }

        int find(node head,int x){
            node temp = head;
            int idx=0;
            while(temp.data != x){
                temp=temp.next;
                idx++;
            }
            return idx;
        }
        int Rfind(node head,int x){
            
        
            if(head == null){
                System.out.println("value not found");
                return -1;
            }if(head.data == x){
                return 1;
            }else{

                int y = Rfind(head.next, x);
                if(y==-1){return -1;}
                else return y+1;
            }
        }
        node insertbegin(node head,int x){
            node temp = new node(x);
            temp.next=head;
            head = temp;
            return head;
        }
        node insertlast(node head,int x){
            
            node ins = new node(x);
            if(head == null){
                return ins;
            }

            node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = ins;
            return head;
        }
        node deletebegin(node head){
            if(head == null){
                return null;
            }else{
                return head.next;
            }
        }

        node deletelast(node head){
            if(head == null){
                return null;
            }if(head.next == null){
                return null;
            }
            else{
                node curr = head;
                while(curr.next.next!=null){
                    curr=curr.next;
                }
                curr.next=null;
                return head;
            }
        }

        int size(node head){
            int pos=0;
            while(head!=null){
                head=head.next;
                pos++;
            }
            return pos;
        }
        node insertat(node head,int pos,int data){

            node n = new node(data);
            if(pos==1){
                n.next=head;
                return head;
            }
            if(size(head)+1==pos){
               return insertlast(head, pos);
            }
            
            node curr = head;
            for (int i = 0; i < pos-1 && curr!=null; i++) {
                curr=curr.next;
            }
            if(curr==null){
                return head;
            }
            n.next=curr.next;
            curr.next=n;
            return head;
        }

        node sortinsert(node head,int val){
            node port = new node(val);
            node temp=head;
            while(temp.next.data<val && temp.next!=null){
                temp=temp.next;
            }
            port.next=temp.next;
            temp.next=port;
            
            return head;
        }

        void middleat(node head){
            int x = size(head);
            // System.out.println(x);
            int y=x/2;
           
            node curr = head;
            for(int i=0;i<y && curr.next!=null;i++){
                curr=curr.next;
            }
            System.out.println(curr.data);
        }
       
        
        void middleatE(node head){
            node fast =head;
            node slow = head;

            while(fast!=null&&fast.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                    // System.out.println(fast.data+" "+slow.data);
            }

            System.out.println(slow.data);
        }

        void nthnode(node head,int pos){
            if(pos>size(head)){
                return;
            }

            int len=size(head)-(pos+1);

            node curr = head;
            for(int i=0;curr!=null && i<=len;i++){
                curr=curr.next;
            }
            System.out.println(curr.data);
        }
        void twonthnode(node head,int pos){
            if(pos>size(head)){
                return;
            }
            node first = head;
            node second = head;

            for (int i = 0; i < pos && second.next!=null; i++) {
                second=second.next;
            }
            while(second!=null){
                second=second.next;
                first=first.next;
            }
           System.out.println(first.data);
        }

        node reverse(node head){
            node curr=null;
            node prev=null;
            node next=head;

            while(next!=null){
                prev=curr;
                curr=next;
                next=next.next;
                curr.next=prev;
            }
            // System.out.println(prev.data);
            return  curr;
        }

        
    }
}


