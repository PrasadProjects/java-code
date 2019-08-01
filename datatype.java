import java.util.Scanner;

public class datatype {

    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
      
    }
}//date 30-7-2019 :hakerrank;