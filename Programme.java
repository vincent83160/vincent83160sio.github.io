package testDivers.Programme;

import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 9;
			int b = 8;
			int c = 0;

			int note = saisirNote();
			System.out.println("Note saisie = " + note);

//		System.out.println(b/c)
			if (a > b) {
				System.out.println(a - b);
			} else {
				throw new Exception("a doit être strictement supérieur à b");
			}
		} catch (ArithmeticException ex) {
			System.out.println("Je gère une exception de type arithmétique");
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Je gère une exception");
			System.out.println(ex.getMessage());
		}
		System.out.println("Fin de programme");

	}
/* cette méthode va permettre à l'utilisateur de saisir une note entre 0 et 20
 * si au bout de 3 tentatives la saisie n'est pas correcte alors on déclenche une exception
 *qui mettra fin au programme
 */
public static int saisirNote() throws Exception {
	Scanner sc=new Scanner(System.in);	
	int note=-1;
	int nbTentatives=0;
	while(nbTentatives <3 &&(note<0||note>20)) {
System.out.println("Entrez une note entre 0 et 20");
note = sc.nextInt();
nbTentatives++;
}
if (note>=0 && note<=20) {
return note;
}else{
throw new Exception("La note n'est pas correcte apres 3 tentatives");
}
}
}
