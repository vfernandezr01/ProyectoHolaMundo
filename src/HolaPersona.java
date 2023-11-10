import javax.swing.JOptionPane;

public class HolaPersona {

	
	public static void main(String[] args) {
		
		String nombre=JOptionPane.showInputDialog("Dame tu nombre: ");
		
		JOptionPane.showMessageDialog(null, "hola" + nombre);
		
		System.out.println("Hola caracola");
	}
}
