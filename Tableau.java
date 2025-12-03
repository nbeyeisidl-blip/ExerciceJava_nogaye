package l3isidl;
import java.util.*;
public class Tableau {

		// TODO Auto-generated method stub

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);   // Permet de  lire ce que l'utilisateur tape

		        // 1) CREER LE TABLEAU ET SAISIR 
		        System.out.print("Taille du tableau : ");
		        int n = sc.nextInt();                 // On lit la taille 

		        int[] tab = new int[n];               // On crée un tableau de taille n

		        System.out.println("Entrez " + n + " nombres :");
		        for (int i = 0; i < n; i++) {         //le boucle for permet de remplit le tableau
		            tab[i] = sc.nextInt();            // Saisie d’un nombre
		        }

		        //2) TROUVER LA VALEUR LA PLUS PROCHE DE K 
		        System.out.print("Entrez k : ");       //saisir la valeur k
		        int k = sc.nextInt();                 // L'utilisateur donne k

		        int proche = tab[0];                  // On suppose d'abord que le premier est le plus proche

		        for (int i = 1; i < n; i++) {         // On parcourt le reste du tableau
		        	
		            // Si la distance entre tab[i] et k est plus petite que celle de proche
		            if (Math.abs(tab[i] - k) < Math.abs(proche - k)) {
		                proche = tab[i];              // Alors tab[i] devient le plus proche
		            }
		        }

		        System.out.println("La valeur la plus proche de " + k + " est : " + proche);

		        // 4) MIN ET MAX 
		        System.out.println("Min = " + tab[0]);          // Le minimum est en première position
		        System.out.println("Max = " + tab[n - 1]);      // Le maximum est en dernière position

		        // 3) Trier le tableau par ordre croissant (tri à bulle) 
		                for (int i = 0; i < n - 1; i++) {
		                    if (tab[i] > tab[i + 1]) {
		                        int tmp = tab[i];
		                        tab[i] = tab[i + 1];
		                        tab[i + 1] = tmp;
		                    }
		                }
		             
		        // 5) INSERER UNE VALEUR DANS LE TABLEAU TRIE
		        System.out.print("Valeur à insérer : ");
		        int val = sc.nextInt();               // La valeur à insérer

		        int[] nvtab = new int[n + 1];    // Nouveau tableau avec une case de plus
		        int i = 0;

		        // Afficher les valeurs plus petites que val
		        while (i < n && tab[i] < val) {
		            nvtab[i] = tab[i];
		            i++;
		        }

		        // Insérer la valeur val à la bonne position
		        nvtab[i] = val;

		        // Copier le reste du tableau 
		        while (i < n) {
		            nvtab[i + 1] = tab[i];
		            i++;
		        }

		        System.out.println("Nouveau tableau : " + Arrays.toString(nvtab));
		    }
		}

