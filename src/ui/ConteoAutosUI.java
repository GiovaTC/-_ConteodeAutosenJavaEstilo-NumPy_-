package ui;

import model.AutoData;
import service.AutoCounter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class ConteoAutosUI extends JFrame {

    private JTextArea resultado;

    public ConteoAutosUI() {

        setTitle("Conteo de Autos (Estilo NumPy)");
        setSize(420, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        resultado = new JTextArea();
        resultado.setEditable(false);
        resultado.setFont(new Font("Consolas", Font.PLAIN, 14));

        JButton btnContar = new JButton("Procesar Conteo");
        btnContar.addActionListener(e -> procesar());

        add(new JScrollPane(resultado), BorderLayout.CENTER);
        add(btnContar, BorderLayout.SOUTH);
    }

    private void procesar() {

        resultado.setText("=== Conteo de Autos ===\n\n");

        Map<String, Integer> conteo =
                AutoCounter.contarAutos(AutoData.AUTOS);

        conteo.forEach((tipo, cantidad) ->
                resultado.append(tipo + " : " + cantidad + "\n")
        );

        resultado.append("\nTotal de autos: "
                + AutoCounter.totalAutos(AutoData.AUTOS));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new ConteoAutosUI().setVisible(true));
    }
}