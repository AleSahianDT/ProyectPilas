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
                JOptionPane.showMessageDialog(null,"El numero decimal " +textNumero.getText()+ ", en binario es "+pila.convertirBinario(Integer.parseInt(textNumero.getText())));
                textArea1.setText(pila.convertirBinario(Integer.parseInt(textNumero.getText())));
                textNumero.setText("");
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
