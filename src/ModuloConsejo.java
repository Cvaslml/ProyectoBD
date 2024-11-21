import java.awt.*;
import javax.swing.*;

public class ModuloConsejo extends JFrame {
    public ModuloConsejo() {
        setTitle("Módulo Consejo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel de contenido
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        // Botón para ver las solicitudes
        JButton btnVerSolicitudes = new JButton("Ver Solicitudes");
        panel.add(btnVerSolicitudes);

        // Botón para aprobar solicitudes
        JButton btnAprobar = new JButton("Aprobar Solicitud");
        panel.add(btnAprobar);

        // Añadir panel al JFrame
        add(panel);
    }
}


