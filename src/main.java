
import javax.swing.*;

public class main {
	public static void main(String[] args) {
	
		  main1 m = new main1();

          //this exits the JFrame when the user closes it
          m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          /*sizes Jframe to ensure that all of the contents 
          are at or above their preferred sizes
          */
          m.pack();

          //sets size of JFrameto 450 x 150
          m.setSize(900,900);

          //makes JFrame visible
          m.setVisible(true);
		
	}
	    
	    
	                      }