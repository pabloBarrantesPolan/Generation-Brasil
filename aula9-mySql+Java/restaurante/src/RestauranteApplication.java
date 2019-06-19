import dao.ClienteDAO;
import model.Cliente;

public class RestauranteApplication {

    public static void main(String[] args) {

        ClienteDAO clienteDAO = new ClienteDAO();



        Cliente pessoa = new Cliente();
        pessoa.setNome("Filipi");
        pessoa.setIdCliente(16);

        //clienteDAO.adiciona(pessoa);

        //clienteDAO.altera(pessoa, "Julio");

        clienteDAO.apaga(16);

      clienteDAO.lista();

    }
}
