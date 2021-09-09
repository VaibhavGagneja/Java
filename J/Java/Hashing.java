import java.util.*;

class Hashing{
    public static void main(String[] args) {
       hash sh=new hash(10);
       sh.insert(12);
        sh.insert(1);
        sh.insert(23);
        sh.insert(34);
        sh.insert(12);
        sh.insert(54);
        sh.insert(67);
        boolean x =sh.search(54);
        System.out.println(x);
    }

    public static class hash{
        int bucket;
        ArrayList<LinkedList<Integer>> table;
        hash(int b){
            bucket=b;
            table=new ArrayList<LinkedList<Integer>>();
            for (int i = 0; i < b; i++) {
                table.add(new LinkedList<Integer>());
            }
        }

        void insert(int key){
            int i = key % bucket;
            table.get(i).add(key);
            
        }
        boolean search(int key){
            int i = key%bucket;
            return table.get(i).contains(key);
        }
        void remove(int key){
            int i = key % bucket;
            table.get(i).remove((Integer)i);
        }
    }
    public static myhash{

        
    }
}