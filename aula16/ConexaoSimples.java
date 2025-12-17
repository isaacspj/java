package aula16;

import java.sql.*;

public class ConexaoSimples {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/teste";
        String usuario = "root";
        String senha = "";
        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
