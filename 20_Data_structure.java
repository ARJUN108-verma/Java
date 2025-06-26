import java.util.*;

public class DataStructuresDemo {
    public static void main(String[] args) {
        // 1. Array
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // 2. LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println("LinkedList Elements:");
        for (String fruit : linkedList) {
            System.out.print(fruit + " ");
        }
        System.out.println("\n");

        // 3. Stack (LIFO)
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println("Stack Elements:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() +
