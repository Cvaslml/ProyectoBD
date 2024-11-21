import java.awt.*;
import javax.swing.*;

public class ModuloEstudiante extends JFrame {
    public ModuloEstudiante() {
        setTitle("Módulo Estudiante");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel de contenido
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Campos de entrada
        JLabel lblCodigo = new JLabel("Código Estudiante:");
        JTextField txtCodigo = new JTextField(7);
        JLabel lblPrograma = new JLabel("Programa:");
        JComboBox<String> comboPrograma = new JComboBox<>(new String[] { "Ingeniería de Sistemas", "Medicina", "Derecho" });
        JLabel lblPassword = new JLabel("Contraseña:");
        JPasswordField txtPassword = new JPasswordField(10);
        
        // Botón para ingresar
        JButton btnIngresar = new JButton("Ingresar");

        // ActionListener para el botón
        btnIngresar.addActionListener(e -> {
            String codigo = txtCodigo.getText();
            String programa = (String) comboPrograma.getSelectedItem();
            String password = new String(txtPassword.getPassword());
            JOptionPane.showMessageDialog(this, "Estudiante: " + codigo + " - " + programa + "\nContraseña: " + password);
        });

        // Añadir los componentes al panel
        panel.add(lblCodigo);
        panel.add(txtCodigo);
        panel.add(lblPrograma);
        panel.add(comboPrograma);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnIngresar);

        // Añadir panel al JFrame
        add(panel);
    }
}

