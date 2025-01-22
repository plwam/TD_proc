import java.util.Arrays;
import java.util.Scanner;

public class filternumber {
    public static void main(String[] args) {
        float matrixa[][]=new float[4][5];
        Scanner lecteur = new Scanner(System.in);
        System.out.println("préparer vous à remplir le tableau");
        for (int i = 0; i < 4; i++) {
            for (int p = 0; p < 5; p++) {
                System.out.println("entre le reel de la case "+(i+1)+ "," +(p+1));
                matrixa[i][p]=lecteur.nextFloat();
            }
        }
        System.out.println(Arrays.deepToString(matrixa));
        System.err.println("veux tu verifier l'existance d'un entier quelconque dans ce tableau ?");
        int the_réel=lecteur.nextInt();
        //creation de outil de recherche 
        boolean try_to_find=false;
        for (int i = 0; i < 4; i++) {
            for (int p = 0; p < 5; p++) {
               if ( matrixa[i][p]==the_réel) {
                try_to_find=true;
                break;
               }
            }
            if (try_to_find)break;
        }
        if (try_to_find) {
            System.out.println("l'entier "+the_réel+"existe dans le tableau");
            
        }
        else {
            System.out.println("l'entier "+the_réel+" n'existe pas dans le tableau");

        }
    }


    
}
