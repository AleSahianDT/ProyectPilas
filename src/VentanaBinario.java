import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBinario {
    private JPanel ventanabinario;
    private JTextField textNumero;
    private JButton Convertir;
    private JTextArea textArea1;
    private Pila pila = new Pila();

    public VentanaBinario(){
        Convertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numeroDecimal = Integer.parseInt(textNumero.getText());
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numeroDecimal+
                        " en binario es: "+pila.convertirBinario(20));
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaBinario");
        frame.setContentPane(new VentanaBinario().ventanabinario);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
