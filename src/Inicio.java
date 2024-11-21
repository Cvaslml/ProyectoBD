import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame {
    public Inicio() {
        setTitle("Universidad - Sistema");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel de contenido
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Cargar el ícono de la universidad
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/icon.png"));
        JLabel labelIcon = new JLabel(icon);

        // Botones para entrar a los módulos
        JButton btnEstudiante = new JButton("Módulo Estudiante");
        JButton btnConsejo = new JButton("Módulo Consejo");

        // Agregar el ícono y los botones al panel
        panel.add(labelIcon);
        panel.add(btnEstudiante);
        panel.add(btnConsejo);

        // ActionListener para los botones
        btnEstudiante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ModuloEstudiante().setVisible(true);
                dispose();
            }
        });

        btnConsejo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ModuloConsejo().setVisible(true);
                dispose();
            }
        });

        // Añadir panel al JFrame
        add(panel);
    }
}
