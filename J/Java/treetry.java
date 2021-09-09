public class treetry {

    static class node{
        int data;
        node left;
        node right;
        node(int k){
            data = k;
            left=right=null;
        }
    }
    node root;

    treetry(){
        root =null;
    }
    void insert(int k,node r){
        node n = new node(k);
        if(r==null)
        r = n;
        if(k<)
        while(r.left!=null){
            r = r.left;
        } 

    }

    public static void main(String[] args) {

    }

}
