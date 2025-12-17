package aula17;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.sql.*;

public class Server {
    public static void main(String[] args) {
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

        try {
            ServerSocket serverSocket = new ServerSocket(1509);
            chat.append("Aguardando conexão...\n");

            Socket socket = serverSocket.accept();
            chat.append("Cliente conectado!\n");

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
                        chat.append("Cliente: " + msg + "\n");
                        PreparedStatement ps = conn.prepareStatement("INSERT INTO mensagens (origem, mensagem) VALUES (?, ?)");
                        ps.setString(1, "cliente");
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
                    chat.append("Servidor: " + texto + "\n");
                    PreparedStatement ps = conn.prepareStatement("INSERT INTO mensagens (origem, mensagem) VALUES (?, ?)");
                    ps.setString(1, "servidor");
                    ps.setString(2, texto);
                    ps.executeUpdate();
                    escrever.setText("");
                } catch (Exception ex) {
                    chat.append("Erro ao enviar.\n");
                }
            });

        } catch (Exception e) {
            chat.append("Erro geral.\n");
        }
    }
}