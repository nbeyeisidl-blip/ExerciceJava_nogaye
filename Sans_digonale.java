package l3isidl;
import java.util.*;
public class Sans_digonale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);                        // Permet de  lire ce que l'utilisateur tape
        
        System.out.print("Entrez la taille de la matrice carree (n) : ");
        int n = sc.nextInt();                                  // On lit la taille 
        
        int[][] matrice = new int[n][n];                      //On crée un matrice carre de taille n
        
        System.out.println("Entrez les elements de la matrice (" + n*n + " elements) :");
        for (int i = 0; i < n; i++) {                        // la boucle i c est pour les lignes
            for (int j = 0; j < n; j++) {                    // la boucle j c est pour les colones
            	 matrice[i][j] = sc.nextInt();                
            }
           
        }  
        
        if (n == 2) {                                       // Vérifier si toute la matrice sera masquée (cas n=2)
            System.out.println("pour n=2, toute la matrice est sur les diagonales donc la matrice sera vide.");
        }
       
        System.out.println("Matrice affichee sans diagonale principale ni secondaire:");
        for (int i = 0; i < n; i++) {                      //la boucle i c est pour les lignes 
            
            for (int j = 0; j < n; j++) {                  // la boucle j c est pour les colones
            	
                if (i == j || i + j == n - 1) {           // condition pour identifier les diagonales
                	
                    System.out.print("   ");              //Si l element est sur une diagonale, on affiche juste des espaces
                } else {
                    System.out.printf("%3d", matrice[i][j]);  // %3d pour l alignement
                }
            }
            
            System.out.println();  							// permet de aligne en ligne   
        }
       
        
        sc.close();                      // On ferme le Scanner
    }
}

