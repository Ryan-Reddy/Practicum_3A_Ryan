package Practicum_3B;

public class Main {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

//        testing throwing an exception without try-catcher
//        c1 = new Cirkel(10, 0, 0);
//        c2 = new Cirkel(0, 10, 10);

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}