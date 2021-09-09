public class intersectlist {
     node head;
    //  static node head0;
    static class node{
        int data;
        node next;

        node(int d){
            data=d;
            next=null;
        }node(int d,node t){
            data=d;
            next=t;
        }
    }

    void push(int d){
        node temp =new node(d);

        temp.next=head;
        head=temp;

    } 

    void push(node n, node temp){
        // node temp = new node(d,n);
        while(temp.next!=null){
            temp=temp.next;
        }
        if(temp.next==null){
            temp.next=n;
        }
    }
    void display(node temp){
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    // int selectnode(int x,int y){
        //     int d =0;    
        
        //     if(x>y){
            //             d=x-y;
            //             return d;
            //         }
            //         else{
                //             d=y-x;
    //             return d;
    //         }
    
    
    // }
    static int intersect(node head1,node head2){
        int d=0;
        int x=head1.size(head1);
        int y = head2.size(head2);
        if(x>y){
            d=x-y;
            for(int i=0;i<d;i++){
                if(head1==null)
                return -1;
            }
        }else{
            d=y-x;
        }
    }
        
        static int size(node temp){
            int count=0;
            while(temp!=null){
                // System.out.println(temp.data);
                temp=temp.next;
                count++;
            }
            return count;
        }
    

    public static void main(String[] args) {
        intersectlist one = new intersectlist();
        
        one.push(12);
        
        one.push(23);
        one.push(38);
        one.push(50);
        one.push(65);
        
        node head1=one.head;
        intersectlist two = new intersectlist();

        // two.push(7);
        two.push(9);
        node head2= two.head;
        two.push(one.head.next.next,two.head);

        // one.display(one.head);
        // two.display(two.head);
        int x =one.size(head1);
        int y =one.size(head2);
        // System.out.println(x+" "+y);
        int d = intersect(head1,head2);

    }

}
