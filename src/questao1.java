import javax.swing.JOptionPane;

public class questao1 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do aluno"));
		
		float resultado = nota;
		
		if (nota>=7){
			JOptionPane.showMessageDialog(null, "O aluno " +nome + " est� Aprovado com a nota " +nota );
		}	else if (nota >=4 && nota<7) {
				JOptionPane.showMessageDialog(null, "O aluno " +nome + " ficou de recupera��o com a nota " +nota );	
			
		}	else {
				JOptionPane.showMessageDialog(null, "O aluno " +nome + " est� reprovado com a nota " +nota );
		}	
		
		}


}