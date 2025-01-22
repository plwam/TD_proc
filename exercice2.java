import java.util.Scanner;
public class exercice2 {
    public static void main(String[] args)  {
        
        int variable3; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer la valeur du nombre 1 : ");
        int variable1 = scanner.nextInt();
        System.out.println("entrer la valeur du nombre 2 : ");
        int variable2= scanner.nextInt();

        if (variable1 <0 ||variable1 <0) {
            variable3 = variable1;
            variable1 = variable2;
            variable2 = variable3;
            System.out.println("la nouvelle valeur de a est : "+variable1+"et la valeur de b est : "+variable2);
        }else {
            int produit = variable1*variable2;
            int somme = variable1+variable2;
            variable2= somme;
            variable1 = produit;
            System.out.println("la nouvelle valeur de a est le produit de a et b  :  "+variable1+"et la valeur de b est leur somme  : "+variable2);  
        }
    }
}
