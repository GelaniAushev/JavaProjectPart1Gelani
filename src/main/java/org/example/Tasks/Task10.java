package org.example.Tasks;

public class Task10 {
    public static void main(String[] args) {

        //Martin Schwarz

        String[] elements = {"Car", "Bread", "Phone", "Car", "Dishwasher", "Bread"};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i].equals(elements[j])) {
                    System.out.println(elements[i]);
                    break;
                }
            }
        }

    }
}
