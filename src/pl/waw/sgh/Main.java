package pl.waw.sgh;

public class Main {

    public static void main(String[] args) {
        byte bl = 56;
        System.out.println("bl=" + bl);


        float fl = 1353434343;
        double d1 = 5.5675*10e-9;
        boolean p = true && false;
        boolean q = true || false;
        char c = 't';
        String abc = "my text";


        System.out.println("bl=" + bl);
        System.out.println("fl=" + fl);
        System.out.println("dl=" + d1);
        System.out.println("p=" + p);

        System.out.println("Hello!");

        int a2 = 4242;
       Integer a3 = 4242;

       a3 = a2+a3;
       a2 = a3+a2;
        System.out.println("a3=" +a3);



    }

}