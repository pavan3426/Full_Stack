import javax.swing.JOptionPane;

public class NumWords{

	public NumWords(){
	}

	
	public static void main(String [] args){
	
		String msg = "";
		
		int input =0;
		
		input = Integer.parseInt(JOptionPane.showInputDialog ( "Enter math grade between 0 and 10!"));
		
		if (input ==1) msg = "one";
		else if (input == 2) msg = "two";
		else if (input == 3) msg = "three";
		else if (input == 4) msg = "four";
		else if (input == 5) msg = "five";
		else if (input == 6) msg = "six";
		else if (input == 7) msg = "seven";
		else if (input == 8) msg = "eight";
		else if (input == 9) msg = "nine";
		else if (input == 10) msg = "ten";
		
		else msg = "Invalid Number ";

		JOptionPane.showMessageDialog(null ,msg );
		
		
	}
}
 