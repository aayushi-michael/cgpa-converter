import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class CGPAConverterGUI {
    private static final Map<String, Double> gpaScales = new HashMap<>();
    private static final List<String> history = new ArrayList<>();

    private JFrame frame;
    private JTextField cgpaField;
    private JComboBox<String> scaleBox;
    private JTextArea resultArea;

    static {
        gpaScales.put("4.0 Scale", 4.0);
        gpaScales.put("5.0 Scale", 5.0);
        gpaScales.put("Percentage", 100.0);
    }

    public CGPAConverterGUI() {
        frame = new JFrame("CGPA Converter");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(44, 62, 80));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2, 10, 10));
        inputPanel.setBackground(new Color(52, 73, 94));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel cgpaLabel = new JLabel("Enter CGPA:");
        cgpaLabel.setForeground(Color.WHITE);
        cgpaField = new JTextField();

        JLabel scaleLabel = new JLabel("Select Grading Scale:");
        scaleLabel.setForeground(Color.WHITE);
        scaleBox = new JComboBox<>(gpaScales.keySet().toArray(new String[0]));

        JButton convertButton = new JButton("Convert");
        JButton reportButton = new JButton("Generate Report");
        styleButton(convertButton);
        styleButton(reportButton);

        inputPanel.add(cgpaLabel);
        inputPanel.add(cgpaField);
        inputPanel.add(scaleLabel);
        inputPanel.add(scaleBox);
        inputPanel.add(convertButton);
        inputPanel.add(reportButton);

        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        resultArea.setBackground(new Color(236, 240, 241));
        resultArea.setFont(new Font("SansSerif", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(resultArea);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCGPA();
            }
        });

        reportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateReport();
            }
        });

        frame.setVisible(true);
    }

    private void styleButton(JButton button) {
        button.setBackground(new Color(41, 128, 185));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setFont(new Font("SansSerif", Font.BOLD, 14));
    }

    private void convertCGPA() {
        try {
            double cgpa = Double.parseDouble(cgpaField.getText());
            String scale = (String) scaleBox.getSelectedItem();
            double convertedValue = (cgpa / 10.0) * gpaScales.get(scale);
            String result = "Converted CGPA: " + String.format("%.2f", convertedValue)
                    + " on " + scale;
            history.add(result);
            resultArea.setText(result);
        } catch (NumberFormatException ex) {
            resultArea.setText("Invalid CGPA input. Please enter a valid number.");
        }
    }

    private void generateReport() {
        StringBuilder report = new StringBuilder("Conversion History:\n");
        for (String record : history) {
            report.append(record).append("\n");
        }
        resultArea.setText(report.toString());
    }

    public static void main(String[] args) {
        new CGPAConverterGUI();
    }
}
