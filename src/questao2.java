import javax.swing.JOptionPane;

public class questao2 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		
		
		
		if (n1>=n2 && n1 != n2){
			JOptionPane.showMessageDialog(null, "O maior n�mero � " +n1);
		}	else if (n1<n2 && n1 != n2) {
				JOptionPane.showMessageDialog(null, "O maior n�mero � " +n2 );	
			
		}	else {
				JOptionPane.showMessageDialog(null, "N�meros iguais");
		}	
		
		



	}

}
