package urokijava;

public class Loops {
    public static void main(String[] args) {
        int myInt = 0;

        while (10 >= myInt) {
            System.out.println(myInt);
            myInt++; // 0, 1, 2, 3, 4,..., 10
        }

        int myInt_1 = 10;

        do {
            System.out.println("do-while: " + myInt_1);
            myInt_1++;
        } while(myInt_1 <= 0);


        for (int i = 1; i <= 10; i++) {
            System.out.println("body of FOR: " + i);
        }

    }
}
