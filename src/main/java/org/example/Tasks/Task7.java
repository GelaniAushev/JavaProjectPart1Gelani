package org.example.Tasks;

public class Task7 {
    public static void main(String[] args) {

        // Natalya Pan

        int n = 10;
        int first = 0;
        int second = 1;

        System.out.println("First " + n + " numbers of the Fibonacci series:");

        System.out.print(first + " " + second);

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }

    }
}
