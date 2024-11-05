package org.example.Tasks;

public class Task5 {
    public static void main(String[] args) {

        int a=5;
        int b=10;

        System.out.println("Number A before swap is:"+a);
        System.out.println("Number B before swap is:"+b);

        System.out.println();

        a=a+b; //15
        b=a-b; //5
        a=a-b; //10

        System.out.println("Number A after swap now is:"+a);
        System.out.println("Number B after swap now is:"+b);

    }
}
