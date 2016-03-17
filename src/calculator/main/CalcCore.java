package calculator.main;


import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CalcCore {

	public static void main(String args[]){
		int run = 1;
		while(run == 1){
		
		double firstnumsum;
		double secondnumsum;
		 double sumd = 0;
		 
	    JFrame frame = new JFrame("Adding");
	   
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	 String firstnum = JOptionPane.showInputDialog(frame, "Enter First Number");
	 
	  String[] Operations = { "Addition", "Subtraction", "Multiplication", "Division"};
	 

	    String Operation = (String) JOptionPane.showInputDialog(frame, 
	            "What Operation",
	            "Operations",
	            JOptionPane.QUESTION_MESSAGE, 
	            null, 
	            Operations, 
	            Operations[0]);

	    
	 String secondnum = JOptionPane.showInputDialog(frame, "Enter The Second Number");
		 
	 
	 firstnumsum = Double.parseDouble(firstnum); 
	 secondnumsum = Double.parseDouble(secondnum);
		
	 if(Operation == Operations[0]){
		 
		sumd = firstnumsum + secondnumsum;	 
		 
	 }
	 
	 if(Operation == Operations[1]){
		 
			sumd = firstnumsum - secondnumsum;	 
			 
		 }
	 
	 if(Operation == Operations[2]){
		 
			sumd = firstnumsum * secondnumsum;	 
			 
		 }
	 
	 if(Operation == Operations[3]){
		 
			sumd = firstnumsum / secondnumsum;	 
			 
		 }
	
	 
		JOptionPane.showMessageDialog(frame, "The Sum Is " + sumd);
		
		 Object[] options = {"Quit", "I want to Restart"};

		int Answer = JOptionPane.showOptionDialog(null, "What would you like to do? ","Quit : Continue", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
			    null, options,options[1]);
			    if(Answer == JOptionPane.YES_OPTION){

			        System.exit(0); 
			    }
			    else if (Answer == JOptionPane.CANCEL_OPTION) {
			        
			    	run = 0;
			    	
			    } 	
			}
		}
}