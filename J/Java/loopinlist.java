import java.util.*;

// import jdk.internal.org.jline.terminal.Size;

class linkedlist {
    static class node {
        int data;
        node next;

        node(int d) {
            data = d;
            next = null;
        }
        node(node temp,int d) {
            data=d;
            next = temp;
        }
    }

     node head;

     public void push(int newd) {
        node n = new node(newd);

        n.next = head;
        head = n;
    }public void push(int newd,node temp) {
        node n = new node(temp,newd);
        node temp1=head;
        while(temp1)
    }

    public boolean detectloop(node h){
        HashSet<node> hs = new HashSet<>();

        while(h!=null){
            if(hs.contains(h))
            return true;

            hs.add(h);
            h=h.next;
        }
        return false;
    }

    public boolean detect(node h){
        node slow=head;
        node fast=head;

        while(fast!=null){
            
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                System.out.println( " slow :"+slow.data+" fast :"+fast.data);
                return true;
            }
        }

        return false;
    }

    public void display(node temp){
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

public class loopinlist {

    public static void main(String[] args) {

        linkedlist one = new linkedlist();

        one.push(12);
        one.push(23);
        one.push(38);
        one.push(50);
        one.push(65);

        // one.head.next.next.next.next.next = one.head.next.next;
        // boolean t =  one.detect(one.head);
        // System.out.println(t);

        linkedlist two = new linkedlist();

        two.push(7);
        two.push(9);
        two.push(one.head.next.data,one.head.next);
        one.display(one.head);
        System.out.println();
        two.display(two.head);

    }

}
