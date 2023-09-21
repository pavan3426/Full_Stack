import javax.swing.JOptionPane;
public Class Grades{
	public static void main (String[] args){
	
		int matGrade =0;
		int historyGrade =0;
		int scienceGrade=0;
		double average=0;
		
		mathGrade= Integer.parseInt(JOptionPane.showInputDialog("enter math grade between 0 and 100!"));
		historyGrade= Integer.parseInt(JOptionPane.showInputDialog("enter history grade between 0 and 100!"));
		scienceGrade= Integer.parseInt(JOptionPane.showInputDialog("enter science grade between 0 and 100!"));
		
		average= (mathGrade+ historyGrade+scienceGrade) / 3;
		
		if(average >= 60){
		JOptionPane.showMessageDialog(null, "Good job! Your average is " +average);
		}
		else{
		JOptionPane.showMessageDialog(null, "You need to do better! Your average is " +average);
		
		
		}
	
	
	}



}