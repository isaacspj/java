package aula17;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.sql.*;

public class Client {
    public static void main(String[] args) {
        JFrame cli = new JFrame("Cliente");
        cli.setSize(500, 400);
        cli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cli.setLayout(new BorderLayout());

        JTextArea chat = new JTextArea();
        chat.setEditable(false);
        cli.add(new JScrollPane(chat), BorderLayout.CENTER);

        JTextField escrever = new JTextField();
        cli.add(escrever, BorderLayout.SOUTH);

        cli.setVisible(true);

        try {
            Socket socket = new Socket("100.78.1.136", 1509);
            chat.append("Conectado ao servidor!\n");

            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://100.78.1.136:3306/chat",
                    "chatuser",
                    "1234"
            );

            new Thread(() -> {
                try {
                    String msg;
                    while ((msg = entrada.readLine()) != null) {
                        chat.append("Servidor: " + msg + "\n");
                        PreparedStatement ps = conn.prepareStatement("INSERT INTO mensagens (origem, mensagem) VALUES (?, ?)");
                        ps.setString(1, "servidor");
                        ps.setString(2, msg);
                        ps.executeUpdate();
                    }
                } catch (Exception e) {
                    chat.append("Conexão encerrada.\n");
                }
            }).start();

            escrever.addActionListener(e -> {
                try {
                    String texto = escrever.getText();
                    saida.println(texto);
                    chat.append("Cliente: " + texto + "\n");
                    PreparedStatement ps = conn.prepareStatement("INSERT INTO mensagens (origem, mensagem) VALUES (?, ?)");
                    ps.setString(1, "cliente");
                    ps.setString(2, texto);
                    ps.executeUpdate();
                    escrever.setText("");
                } catch (Exception ex) {
                    chat.append("Erro ao enviar.\n");
                }
            });

        } catch (Exception e) {
            chat.append("Erro ao conectar.\n");
        }
    }
}