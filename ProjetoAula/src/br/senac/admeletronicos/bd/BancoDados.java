package br.senac.admeletronicos.bd;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class BancoDados {
    private Connection conexao;
    public void conectar () {
        try {
            
            System.out.println("Iniciando conexão");
            Class.forName("com.mysql.jdbc.Driver");
            conexao = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/admprodutos", "root", "root");
            System.out.println("SUCESSO!");
        } catch (SQLException ex) {
            System.out.println("Falha!!!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Falha: nao encontrou");
            
        }
    }
    public void desconectar (){
        try {
            if(conexao != null && !conexao.isClosed())
            {
                conexao.close();
                System.out.println("Desconectado com sucesso");
            }
            } catch (SQLException ex){
                System.out.println("Erro " + ex.getMessage());
        }
    }
    public Connection getConexao() {
        return conexao;
    }
    
}
