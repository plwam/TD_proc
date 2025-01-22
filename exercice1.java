import java.util.Scanner;

public class exercice1{
    public static void main(String[] args) {
        int temps,minute,seconde,heure;
        Scanner lect = new Scanner(System.in);
        System.out.println("entrer un temps en seconde ");
        temps = lect.nextInt();
        heure = temps/3600;
        minute = (temps%3600)/60;
        seconde = (temps%3600)%60;
        System.out.println("votre temps est egal a "+heure+" heure(s) "  +minute+" minute(s) " +seconde+" seconde(s)");

    }
    
}
