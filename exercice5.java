import java.util.Scanner;
public class exercice5 {
    public static void main(String[] args) {
        Scanner cool = new Scanner(System.in);
        System.out.println("Entrer un nombre entier positif ");
        int nombre =cool.nextInt();
        while (0<nombre) {
            int somme = 0;
            for(int i = 1; i <=nombre; i++) {
                somme = somme+(nombre-(+i));
                if (somme >=nombre) {
                    i=nombre+1;
                    System.out.println("la somme des nombres precedents superieur ou egal à "+nombre+"  est"+somme);
                
                }
          
           }
        break;
        }
    }
}
