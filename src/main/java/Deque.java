import java.util.ArrayDeque;
import java.util.LinkedList;

public class Deque {
    public static void main(String [] args)
    {
        LinkedList<Integer> queue= new LinkedList<>();

        int   maxUnique=0;
        int intNumber=10;
        int subArraySize=3;

        queue.add(7);
        queue.add(5);
        queue.add(5);
        queue.add(7);
        queue.add(5);
        queue.add(5);
        queue.add(7);
        queue.add(5);
        queue.add(5);
        queue.add(6);


        System.out.println("queue : " + queue + "\n");

        ArrayDeque<Object> deque = new ArrayDeque<>();

        for (int i = 0; i < intNumber; i++) {
          Object num =queue;
            if(i == 0){
                num.equals(deque);
                maxUnique++;
            }else{
                if(deque.hashCode()== subArraySize){
                    deque.removeFirst();
                }
                if(!deque.contains(num) && maxUnique<subArraySize){
                    maxUnique++;
                }
                deque.addLast(num);
            }
        }
        System.out.println("max unique values: "+maxUnique);
    }


}
