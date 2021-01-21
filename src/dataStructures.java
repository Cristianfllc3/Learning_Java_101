package src;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class dataStructures {
    //Create a Linked List
    public void linkedList(){
        LinkedList<String> students = new LinkedList<>();
        students.add("Ted");
        students.add("Bob");
        students.add("Mike");
        students.addFirst("Sara");
        students.addLast("Arthur");

        String firstStd = students.getFirst();
        String lastStd = students.getLast();
        int countListStd = students.size();
        String indexStudent = students.get(1); //To search the name with the index
        int indexStud = students.indexOf("Ted"); // To search the index with the name
        boolean flag = students.contains("Sara");
        /* If you want to remove
        students.removeFirst();
        students.removeLast();
         */
    }

    public void queueList(){
        Queue<String> queue = new LinkedList<>();
        queue.add("Bob");
        queue.add("Ted");
        queue.add("Sara");
        queue.add("Sam");

        String nextOnTheList = queue.peek();
        //String recentlyremove = queue.remove();
    }

    public void stackList(){
        //to insert push()
        //to delete pop()
        Stack<Integer> stack = new Stack();
        int n = 2;
        int num = 3;
        int nu = num+1;
        int nume = n+3;
        //the stack [2,3,4,5]
        stack.push(n);
        stack.push(num);
        stack.push(nu);
        stack.push(nume);

        //to see what is in the top of the stack peek()
        int result = stack.peek();
        String resulStg = stack.peek().toString();
        stack.size();
        //stack.trimToSize();
        String lastDeleted = stack.pop().toString();
    }

    public void hashMap(){

        HashMap<String, Integer> hashMap = new HashMap();
        // keys and values
        hashMap.put("ONE",1);
        hashMap.put("TWO",2);
        hashMap.put("THREE",3);

        String hashValues = hashMap.values().toString();
        String hashKeys = hashMap.keySet().toString();
        hashMap.remove("ONE");


    }

}
