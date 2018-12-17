package lab4;

public class ex1 {

    public static void B (int a, int b){
        System.out.println("Hello B.");

    }//B


    public static void main(String[] args) {
      System.out.println("Hollo Main.");
      //call method
//        for (int i = 0; i < 10; i++){
//            A();
//        }
        B(5,5);
        //int sum = c(10,10);
        System.out.println(c(10,10));


    }//main


    public static void A(){
        //Statements
        System.out.println("Hello A.");
    }//A


    public static int c (int a, int b) {
        System.out.println ("Hello c.");
        int c = a+b;
        return c;
    }//C




}//class
