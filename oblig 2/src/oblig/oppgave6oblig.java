package oblig;
import javax.swing.JOptionPane;


public class oppgave6oblig {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn ett heltall"));
		int svar = 1;
		if (n>0) {
			for (int i=1; i<=n; i++) {
				svar *= i;
				System.out.println("Du får:" + svar);
			}
				
			}
		else {
			System.out.println("Du må skrive ett gyldig tall");
	}
	}
}
