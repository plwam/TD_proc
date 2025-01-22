import java.util.Scanner;

public class exercice6 {
    public static void main(String[] args) {
         double a,b,c,delta,x1,x2;
         Scanner lect = new Scanner(System.in);
         System.out.println("Entrer les differents coefficients: ");
         System.out.println("coefficient en x^2: ");
         a = lect.nextDouble();
         System.out.print("coefficient en x : ");
         b = lect.nextDouble();
         System.out.print("terme independant: ");
         c = lect.nextDouble();
         System.out.println("votre equation est :" +a+"X^2+"+b+"X+"+c);
         // CALCUL DE DELTA
         delta=  Calculdelta(a,b,c);
         
        if (delta>0) {
           x1 =(-b+Math.sqrt(delta))/(2*a);
           x2 =(-b-Math.sqrt(delta))/(2*a);
           System.out.println("le discriminant de votre equation est : ");
           affichageResultat(x1,x2);
        }
        else if(delta==0) {
           x1 =-b/(2*a);
           x2 = x1;
           affichageResultat(x1,x2);
        }
        else {
            
            delta = -(delta);
            double z1 =(-b)/(2*a);
            double z22 =(-Math.sqrt(delta))/(2*a);
            double z12  = (Math.sqrt(delta))/(2*a);
            System.out.println("le discriminant de votre equation est : -"+delta);
            affichageResultatComplex(z1,z22,z12);
      
        }
    }
    public static double Calculdelta(double aa,double bb,double cc) {
        return (bb*bb)-(4*aa*cc);
    }
    public static void affichageResultat(double xx1,double xx2 ){
        System.out.println("les solutions de votre equation est x1="+xx1+"et x2="+xx2);

    }
    public static void affichageResultatComplex(double re1,double im1,double im2 ){
        System.out.println("les solutions de votre equation sont complexes et valent z1="+re1+im1+"i  et z2="+re1+"+"+im2+"i");

    }
}