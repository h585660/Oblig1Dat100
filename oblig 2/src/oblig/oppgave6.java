package oblig;


import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class oppgave6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//
		double lønn = parseDouble(showInputDialog(("Hvor mye tjener du?")));
		double Trinn0 = (lønn);
		double Trinn1 = (lønn - 180800)*0.019;
		double Trinn2 = (254500-180800)*0.019 + (lønn -254500)*0.042;
		double Trinn3 = ((254500-180800)*0.019) + ((639750 - 254500) * 0.042) + ((lønn - 639750) * 0.132);
		double Trinn4 = (254500-180800)*0.019 + ((639750 - 254500) * 0.042 + (999550 - 639750) * 0.132) + ((lønn - 999550))
				*0.162;
		
	
		
		if (lønn <= 180800) {
		showMessageDialog (null, "Du betaler ingenting i trinnskatt");
		}
		else if (lønn >= 180800 && lønn <= 254500) {
			showMessageDialog (null, "Din trinnskatt trinnskatt blir: " +Trinn1 + "kr");
			
		}
		
		else if (lønn>254500 & lønn <= 639750) {
		showMessageDialog (null, "Din trinnskatt totalt blir: " + Trinn2 + "kr");
	}
		else if (lønn>639750 && lønn <= 999550) {
			showMessageDialog (null, "Din trinnskatt totalt blir: " + Trinn3 + "kr");
		}
		
		else if (lønn>999550) {
			showMessageDialog (null, "Din trinnskatt totalt blir: " + Trinn4 + "kr");
		}
	
	}
		
	
		
				
	}


