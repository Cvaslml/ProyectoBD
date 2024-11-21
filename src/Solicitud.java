import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solicitud extends JFrame {
    public Solicitud() {
        setTitle("Solicitud de Readmisión");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel de contenido
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        // Campos para la solicitud
        JLabel lblMotivo = new JLabel("Motivo:");
        JComboBox<String> comboMotivo = new JComboBox<>(new String[] { "Motivos Personales", "Cambio de Domicilio", "Muerte de Familiar", "Enfermedad" });
        JLabel lblDescripcion = new JLabel("Descripción:");
        JTextArea txtDescripcion = new JTextArea(4, 20);
        JLabel lblDocumento = new JLabel("Adjuntar Documento:");
        JButton btnAdjuntar = new JButton("Adjuntar");
        JButton btnEnviar = new JButton("Enviar");

        // Acción para enviar solicitud
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Solicitud.this, "Solicitud Enviada.");
            }
        });

        // Añadir componentes al panel
        panel.add(lblMotivo);
        panel.add(comboMotivo);
        panel.add(lblDescripcion);
        panel.add(new JScrollPane(txtDescripcion));
        panel.add(lblDocumento);
        panel.add(btnAdjuntar);
        panel.add(btnEnviar);

        // Añadir panel al JFrame
        add(panel);
    }
}
