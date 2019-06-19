package dao;

import connection.ConnectionFactory;
import model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private Connection connection;

    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Cliente cliente){

        try {

            String sql = "INSERT INTO cliente (id_cliente, nome) VALUES(?, ?)";

            PreparedStatement stmt = this.connection.prepareStatement(sql);

            stmt.setInt(1, cliente.getIdCliente());

            stmt.setString(2, cliente.getNome());

            stmt.execute();
            stmt.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    } // metodo adiciona

    public void lista(){


        try {

            List<Cliente> clientes = new ArrayList<>();
            PreparedStatement stmt =this.connection.prepareStatement("select * from cliente");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setNome(rs.getString("nome"));
                clientes.add(cliente);
                System.out.print(cliente.getIdCliente()+" ----- ");
                System.out.println(cliente.getNome());
            }
            rs.close();
            stmt.close();


        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }// metodo lista

    public void altera(Cliente cliente, String novo_nome){
        try {
            String sql = "UPDATE cliente SET nome = ? WHERE id_cliente = ?";
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setString(1,novo_nome);
            stmt.setInt(2,cliente.getIdCliente());

            stmt.execute();
            stmt.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }//metodo altera

    public void apaga(Integer id){
        try {
            String sql = "DELETE FROM cliente WHERE id_cliente = ?";
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setInt(1,id);
                       stmt.execute();
            stmt.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}//classe
