package aula17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertSql {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/escola";
        String usuario = "root";
        String senha = "";
        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");
            String sql = "INSERT INTO aluno (nome, idade) VALUES (?, ?)";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "Carlos");
            ps.setInt(2, 20);
            ps.executeUpdate();
            System.out.println("Insert realizado com sucesso!");
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
