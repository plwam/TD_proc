
import java.util.Scanner;
public class exercice3 {
    public static void main(String[] args) {
        
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer la valeur du nombre 1 : ");
        int nombre1 = scanner.nextInt();
        System.out.println("entrer la valeur du nombre 2 : ");
        int nombre2= scanner.nextInt();
        System.out.println("Choississez une operation: +,-,*,/");
        String signe = scanner.next();

        if (signe.equals("+")) {
            int add = nombre1+nombre2;
            System.out.println("le double de la somme de vos nombres est : "+add*2);

        }
        if (signe.equals("-")) {
            int soust = nombre1-nombre2;
            System.out.println("le double difference entre vos nombres est : "+soust*2);
        }
        if (signe.equals("/")) {
            int div = nombre1/nombre2;
            System.out.println("le double division de vos nombres est : "+div*2);

        }
        if (signe.equals("*")) {
            int div = nombre1*nombre2;
            System.out.println("le double division de vos nombres est : "+div*2);

        }
    }
    
}
