package aula17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpDateSql {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/escola";
        String usuario = "root";
        String senha = "";
        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");

            String sql = "UPDATE aluno SET idade = ? WHERE nome = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, 20);
            ps.setString(2, "Bruno");
            ps.executeUpdate();
            System.out.println("Update realizado com sucesso!");
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
