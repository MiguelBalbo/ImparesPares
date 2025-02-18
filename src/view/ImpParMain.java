package view;
import controller.ImpParCtrl;
import javax.swing.JOptionPane;

public class ImpParMain {
	public static void main (String args[]) {
		int i;
		
		int[] vetor = new int[100];
		for (i=0; i<8; i++) {
			vetor[i] = Integer.p8arseInt(JOptionPane.showInputDialog("Digite um dos valores"));
		}
		ImpParCtrl.Contagem(vetor);
	}
}
