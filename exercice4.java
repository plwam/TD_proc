import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {
         int nombre ;
         Scanner lect = new Scanner(System.in);
          System.out.println("entrer le nombre de depart");
         nombre = lect.nextInt();
         System.out.println("les 10 nombres precedents sont:");
         for(int i = 1; i <=10; i++) {
            System.out.print(nombre-(+i));
   
           if (i<10) {
           System.out.print(", ");}
        }
    }
}
   