/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productapp;

/**
 *
 * @author Student
 */
import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class ProductApp {


public class mattressSales extends JFrame {

    JTextField txtCustomer;
    JTextField txtPrice;
    JComboBox<String> cmbProduct;
    JButton btnProcess;

    public mattressSales() {

        setTitle("Product App");
        setSize(550, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create labels and text fields
        JLabel lblCustomer = new JLabel("Customer Name:");
        JLabel lblProduct = new JLabel("Select Product:");
        JLabel lblPrice = new JLabel("Enter Price:");

        txtCustomer = new JTextField(20);
        txtPrice = new JTextField(20);

        // Create product combo box
        String products[] = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        cmbProduct = new JComboBox<>(products);

        // Create process button
        btnProcess = new JButton("PROCESS");

        // Create form panel
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 15));

        panel.setBorder(
            BorderFactory.createEmptyBorder(30, 30, 30, 30)
        );

        panel.add(lblCustomer);
        panel.add(txtCustomer);

        panel.add(lblProduct);
        panel.add(cmbProduct);

        panel.add(lblPrice);
        panel.add(txtPrice);

        panel.add(new JLabel(""));
        panel.add(btnProcess);

        add(panel);

        // Create menu
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu toolsMenu = new JMenu("Tools");

        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem processItem = new JMenuItem("Process");
        JMenuItem clearItem = new JMenuItem("Clear");

        fileMenu.add(exitItem);

        toolsMenu.add(processItem);
        toolsMenu.add(clearItem);

        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);

        setJMenuBar(menuBar);

        // Process button
        btnProcess.addActionListener(e -> processSale());

        // Process menu item
        processItem.addActionListener(e -> processSale());

        // Clear menu item
        clearItem.addActionListener(e -> clearForm());

        // Exit menu item
        exitItem.addActionListener(e -> System.exit(0));
    }

    // Process the sale
    public void processSale() {

        try {

            String customer = txtCustomer.getText();
            String product = (String) cmbProduct.getSelectedItem();

            double price = Double.parseDouble(txtPrice.getText());

            if (customer.trim().isEmpty() || price <= 0) {
                JOptionPane.showMessageDialog(
                    this,
                    "Please enter a customer name and a valid price."
                );
                return;
            }

            // Create calculation object
            ProductCalculations calc =
            new ProductCalculations(price);

            double vat = calc.GetVat();
            double commission = calc.GetCommission();
            double total = calc.GetTotal();

            // Display results
            String message =
                "Customer Name: " + customer +
                "\nProduct: " + product +
                "\nVAT: R " + vat +
                "\nCOMMISSION: R " + commission +
                "\nTOTAL: R " + total;

            JOptionPane.showMessageDialog(
                this,
                message,
                "Message",
                JOptionPane.INFORMATION_MESSAGE
            );

            // Save information to file
            FileWriter writer = new FileWriter("data.txt", true);

            writer.write("DATA LOG\n");
            writer.write("****************************\n");
            writer.write("Customer Name: " + customer + "\n");
            writer.write("Product: " + product + "\n");
            writer.write("VAT: R " + vat + "\n");
            writer.write("COMMISSION: R " + commission + "\n");
            writer.write("TOTAL: R " + total + "\n");
            writer.write("****************************\n");

            writer.close();

            JOptionPane.showMessageDialog(
                this,
                "Information saved successfully!"
            );

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                this,
                "Please enter a valid number for the price."
            );

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(
                this,
                "Error saving data to file."
            );
        }
    }

    // Clear all fields
    public void clearForm() {

        txtCustomer.setText("");
        txtPrice.setText("");
        cmbProduct.setSelectedIndex(0);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new ProductApp().setVisible(true);
        });
    }
    }


}
