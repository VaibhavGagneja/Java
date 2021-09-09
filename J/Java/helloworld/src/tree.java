public class tree {

    public class node {
        node left;
        node right;
        int data;
        node(int data){
            this.data = data;
        }
    }

    node root;
    tree(){
        root=null;
    }
    void insert1(int key){
        root = insert(root, key);
    }
    node insert(node root,int key){
        if (root == null){
            root = new node(key);
            return root;
        }

        if(key<root.data){
            root.left=insert(root.left,key);
        }else if(key>root.data) {
             root.right = insert(root.right, key);
        }

        return root;
    }

    void inorder(node r){
        if(r!=null){
            inorder(r.left);
            System.out.println(r.data);
            inorder(r.right);
        }
    }
    void preorder(node r){
        if(r!=null){
            System.out.println(r.data);
            preorder(r.left);
            preorder(r.right);
        }
    }
    void postorder(node r){
        if(r!=null){
            postorder(r.left);
            postorder(r.right);
            System.out.println(r.data);
        }
    }

    int height(node r){
        if(r==null){
            return 0;
        }else{
            int lheight = r.left.data;
            int rheight = r.right.data;
            if(lheight>rheight){
                return height(r.left)+1;
            }else{
                return height(r.right)+1;
            }
        }
    }

    int height1(node r){
        if(r==null){
            return 0;
        }
        return height1(r.left)+1+height1(r.right);
    }

    int findMax(int a, int b){
        if(a >= b)
            return a;
        else
            return b;
    }

    int findHeight(node root){
        // Base case:
        if(root == null)
            return 0;

        return findMax(findHeight(root.left), findHeight(root.right)) + 1;
    }

    public static void main(String[] args) {
        tree t = new tree();
        t.insert1(5);
        t.insert1(3);
        t.insert1(9);
        t.insert1(4);
        t.insert1(6);
        // t.insert(t.root,10);

//         System.out.println(t.root.right.right.data);
        // t.inorder(t.root);
        // t.preorder(t.root);
//        t.postorder(t.root);
//        System.out.println(t.findHeight(t.root));
        System.out.println(t.root.left.data);

    }
}
