package aula10;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Client {
     public static void main(String[] args) throws IOException {

        JFrame clie = new JFrame("Cliente");
        clie.setSize(500, 400);
        clie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clie.setLayout(new BorderLayout());

        JTextArea chat = new JTextArea();
        chat.setBounds(10, 10, 0, 0);
        chat.setEditable(false);
        clie.add(new JScrollPane(chat), BorderLayout.CENTER);

        JTextField escrever = new JTextField();
        clie.add(escrever, BorderLayout.SOUTH);

        clie.setVisible(true);

        Socket socket = new Socket("169.254.162.138", 1509);
        chat.setForeground(Color.BLUE);
        chat.append("Conectado ao servidor!\n");
        

        BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);

        new Thread(() -> {
            try {
                String msg;
                while ((msg = entrada.readLine()) != null) {
                    chat.append("Servidor: " + msg + "\n");
                }
            } catch (IOException e) {
                chat.setForeground(Color.RED);
                chat.append("Conexão encerrada.\n");
            }
        }).start();

        escrever.addActionListener(e -> {
            String texto = escrever.getText();
            saida.println(texto);
            chat.append("Cliente: " + texto + "\n");
            escrever.setText("");
        });
    }
}