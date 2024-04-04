import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel ventana;
    private JTextField textNumero;
    private JButton apilarButton;
    private JButton desapilarButton;
    private JButton cimaButton;
    private JButton buscarButton;
    private JTextArea textArea1;
    private Pila pila = new Pila();

    public Ventana(){

        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pila.apilar(Interger.parseInt(textNumero.getText()));
                textArea1.setText(pila.toString());
            }
        });

    }
}
