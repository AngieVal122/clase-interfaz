package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame {
    private JPanel pnlPrincipal;
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblApellido;
    private JTextField txtApellido;
    private JButton guardarButton;
    private JLabel idioma;
    private JComboBox cmbidioma;
    private JCheckBox chbTerminos;
    private JLabel lblGénero;
    private JRadioButton rbtFmenino;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtOtro;
    private JRadioButton rbtPrefieroNoDecirlo;

    public IngresarPersona(){
        this.setContentPane(pnlPrincipal);
        this.setSize(400,300);
        this.setVisible(true);

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo=txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String idioma = cmbidioma.getSelectedItem().toString();
                String aceptoTerminos = (chbTerminos.isSelected()== true)?"Si":"NO";
                String mensaje = " Tus datos son: " + " \n" +
                        " Código: " + codigo + " \n" +
                        " Nombre: " + nombre + "\n" +
                        " Apellido: " + apellido + "\n" +
                        "Idioma: " + idioma +
                         "Aceptó términos: " + aceptoTerminos;
                JOptionPane.showMessageDialog(guardarButton, mensaje);
            }
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
