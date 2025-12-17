package aula17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletSql {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/escola";
        String usuario = "root";
        String senha = "";
        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");

            String sql = "DELETE FROM aluno WHERE nome = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "Bruno");
            ps.executeUpdate();
            System.out.println("delete realizado com sucesso!");
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }

    }
}
