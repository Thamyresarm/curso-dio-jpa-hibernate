import DAO.ClienteDAO;
import config.Conexao;
import model.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SQLException {

        try (Connection conn = Conexao.getConnection()){
            ClienteDAO dao = new ClienteDAO(conn);
            List<Cliente> clientes = dao.buscarTodosClientes();
            System.out.println(clientes);

            dao.insertNovoCliente("Manuela");
            clientes = dao.buscarTodosClientes();
            System.out.println(clientes);
        }

    }
}
