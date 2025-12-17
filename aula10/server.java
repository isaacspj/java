package aula10;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class server {
 
    public static void main(String[] args) throws IOException {

        JFrame serv = new JFrame("Servidor");
        serv.setSize(500, 400);
        serv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        serv.setLayout(new BorderLayout());

        JTextArea chat = new JTextArea();
        chat.setEditable(false);
        serv.add(new JScrollPane(chat), BorderLayout.CENTER);

        JTextField escrever = new JTextField();
        serv.add(escrever, BorderLayout.SOUTH);

        serv.setVisible(true);

        ServerSocket serverSocket = new ServerSocket(1509);
        chat.append("Servidor aguardando conexão...\n");

        Socket clientSocket = serverSocket.accept();
        chat.setForeground(Color.gray);
        chat.append("Cliente conectado!\n");

        BufferedReader entrada = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter saida = new PrintWriter(clientSocket.getOutputStream(), true);

        new Thread(() -> {
            try {
                String msg;
                while ((msg = entrada.readLine()) != null) {
                    chat.append("Cliente: " + msg + "\n");
                }
            } catch (IOException e) {
                chat.append("Conexão encerrada.\n");
            }
        }).start();

        escrever.addActionListener(e -> {
            String texto = escrever.getText();
            saida.println(texto);
            chat.append("Servidor: " + texto + "\n");
            escrever.setText("");
        });
    }
}