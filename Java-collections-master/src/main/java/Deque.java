import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class Deque {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        java.util.Deque<Integer> queue = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int maxValue = MIN_VALUE;

        System.out.println ("Enter the number of integers in your array: ");
        int num = input.nextInt();
        System.out.println ("Enter the size of your sub array: ");
        int subArraySize = input.nextInt();
        System.out.println ("Please enter your " +num + " numbers: ");


        for (int i = 0; i < num; i++) {
            int queueInt = input.nextInt ( );
            queue.add(queueInt);
            set.add(queueInt);


            if (queue.size() == subArraySize) {
                if (set.size ( ) > maxValue) {
                    maxValue= set.size();
                }
                int first = queue.remove();

                if (!queue.contains(first)) set.remove(first);
            }
        }
       System.out.println("Your highest number of unique values is: "+maxValue);


    }
}
