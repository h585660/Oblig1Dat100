package oblig;


import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class oppgave6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//
		double l�nn = parseDouble(showInputDialog(("Hvor mye tjener du?")));
		double Trinn0 = (l�nn);
		double Trinn1 = (l�nn - 180800)*0.019;
		double Trinn2 = (254500-180800)*0.019 + (l�nn -254500)*0.042;
		double Trinn3 = ((254500-180800)*0.019) + ((639750 - 254500) * 0.042) + ((l�nn - 639750) * 0.132);
		double Trinn4 = (254500-180800)*0.019 + ((639750 - 254500) * 0.042 + (999550 - 639750) * 0.132) + ((l�nn - 999550))
				*0.162;
		
	
		
		if (l�nn <= 180800) {
		showMessageDialog (null, "Du betaler ingenting i trinnskatt");
		}
		else if (l�nn >= 180800 && l�nn <= 254500) {
			showMessageDialog (null, "Din trinnskatt trinnskatt blir: " +Trinn1 + "kr");
			
		}
		
		else if (l�nn>254500 & l�nn <= 639750) {
		showMessageDialog (null, "Din trinnskatt totalt blir: " + Trinn2 + "kr");
	}
		else if (l�nn>639750 && l�nn <= 999550) {
			showMessageDialog (null, "Din trinnskatt totalt blir: " + Trinn3 + "kr");
		}
		
		else if (l�nn>999550) {
			showMessageDialog (null, "Din trinnskatt totalt blir: " + Trinn4 + "kr");
		}
	
	}
		
	
		
				
	}


