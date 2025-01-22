import java.util.Scanner;
public class Reelstab{
    public static void main(String[] args) {
        float les_reels[]=new float[10];
        float somme=0,produit=1,moyenne;
        Scanner lecteur = new Scanner(System.in);
        System.out.println("préparer vous à remplir le tableau");
        for (int i = 0; i < les_reels.length; i++) {
            System.out.println("entre le reel numero"+(i+1));
            les_reels[i]=lecteur.nextFloat();
            somme=somme+les_reels[i];
            produit=produit*les_reels[i];
            
        }
        moyenne=somme/les_reels.length;

        System.err.println("la somme des réels est : "+somme);
        System.err.println("le produit des réels est : "+produit);
        System.err.println("la moyenne des réels est : "+moyenne);
    }

    
}
