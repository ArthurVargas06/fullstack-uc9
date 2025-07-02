package Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





public class ConexaoDb {

    private static final string URL ="jdbc:mysql://localhost:3306/biblioteca_db"
    private static final string USUARIO = "root";
    private static final string SENHA = "root";

}

public static Connection conectar() {

    Connection.conexao = null;

    try {
        conexao = DriverManager.getConnection(URL, USUARIO, SENHA)
                system.out.println("Conexão com o banco de dados estabelecida com sucesso!");
    } catch (SQLException e) {
        System.err.printLn("Erro ao conectar com o bd: ") + e.getMessage());
    } return conexao;

    }

}

public static void fecharConexao(Connection conexao) {
    if (conexao != null) {

        try {
            conexao.close();
            System.out.printLn("Conexão com o bd fechada!");
        } catch (SQLException e) {
            System.err.println("Erro ao fechar conexão com o bd:");
        }
        public static void main (String[]args){
            Connection testeConexao = ConexaoDb.conectar();
            if (testeConexao != null) {
                ConexaoDb.fecharConexao(testeConexao)
            }
        }
    }
}

