package oblig;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Oppgave7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i<=10; i++) {
		int karakter = parseInt(showInputDialog("Hvor mange poeng fikk du?"));
		
		if (karakter >= 90 && karakter <= 100) {
			showMessageDialog (null, "Du fikk karakteren A!");
			System.out.println("A");
			}
			
		
			else if (karakter >= 80 && karakter <= 89) {
				showMessageDialog (null, "Du fikk karakteren B!");
				System.out.println("B");

			}
				else if (karakter >= 60 && karakter <= 79) {
					showMessageDialog (null, "Du fikk karakteren C!");
					System.out.println("C");

				}
				else if (karakter >= 50 && karakter <= 59) {
					showMessageDialog (null, "Du fikk karakteren D!");
					System.out.println("D");

				}
				else if (karakter >= 40 && karakter <= 49) {
					showMessageDialog (null, "Du fikk karakteren E!");
					System.out.println("E");

				}
				else if (karakter >=0 && karakter <= 39) {
					showMessageDialog (null, "Du strøk :(");
					System.out.println("Stryk");

					}
		
				else {
					showMessageDialog (null, "Du skrev visst ett ugyldig svar!");
					System.out.println("Ugyldig svar, skriv inn på nytt");
					i--;

					
				}
		
		

	}
	}

}

