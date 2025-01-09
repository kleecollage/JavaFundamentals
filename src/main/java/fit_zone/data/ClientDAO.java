package fit_zone.data;

import fit_zone.domain.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static fit_zone.connection.DbConnection.getConnection;

public class ClientDAO implements IClientDAO {
    // GET ALL CLIENTS
    @Override
    public List<Client> listClients() {
        List<Client> clients = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection connection = getConnection();
        var sql = "SELECT * FROM client ORDER BY id";

        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                var client = new Client();
                client.setId(rs.getInt("id"));
                client.setName(rs.getString("name"));
                client.setLastname(rs.getString("lastname"));
                client.setMembership(rs.getInt("membership"));
                clients.add(client);
            }

        } catch (Exception e) {
            System.out.println("Error getting clients: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }

        return clients;
    }

    // GET CLIENT BY ID
    @Override
    public boolean searchClientById(Client client) {
        PreparedStatement ps;
        ResultSet rs;
        var connection = getConnection();
        var sql = "SELECT * FROM client WHERE id = ?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, client.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                client.setName(rs.getString("name"));
                client.setLastname(rs.getString("lastname"));
                client.setMembership(rs.getInt("membership"));
                return true;
            }

        }catch (Exception e) {
            System.out.println("Error getting client by id: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
        return false;
    }

    // ADD NEW CLIENT
    @Override
    public boolean addClient(Client client) {
        PreparedStatement ps;
        Connection connection = getConnection();
        String sql = "INSERT INTO client (name, lastname, membership) VALUES (?, ?, ?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, client.getName());
            ps.setString(2, client.getLastname());
            ps.setInt(3, client.getMembership());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error adding client: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
        return false;
    }

    // UPDATE CLIENT
    @Override
    public boolean updateClient(Client client) {
        PreparedStatement ps;
        Connection connection = getConnection();
        String sql = "UPDATE client SET name=?, lastname=?, membership=? WHERE id=?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, client.getName());
            ps.setString(2, client.getLastname());
            ps.setInt(3, client.getMembership());
            ps.setInt(4, client.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error updating client: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
        return false;
    }

    // REMOVE CLIENT
    @Override
    public boolean deleteClient(Client client) {
        PreparedStatement ps;
        Connection connection = getConnection();
        String sql = "DELETE FROM client WHERE id=?";

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, client.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error deleting client: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }

        return false;
    }

    /* DEBUG
    public static void main(String[] args) {
        System.out.println("CLIENT DAO");
        IClientDAO clientDAO = new ClientDAO();
        System.out.println("List clients");
        clientDAO.listClients().forEach(System.out::println);

        System.out.println("\nSearch client by id");
        var client1 = new Client(3);
        System.out.println("client1 = " + client1);
        var found = clientDAO.searchClientById(client1);
        if (found)
            System.out.println("Client found: " + client1);
        else
            System.out.println("Client not found " + client1);

        System.out.println("\nAdd new client");
        var newClient = new Client("David", "Brown", 300);
        var added = clientDAO.addClient(newClient);
        if (added)
            System.out.println("Client added: " + newClient);
        else
            System.out.println("Client not added " + newClient);

        System.out.println("\nUpdate existing client");
        var clientToUpdate = new Client(4, "Emily", "Willis", 300);
        var updated = clientDAO.updateClient(clientToUpdate);
        if (updated)
            System.out.println("Client updated: " + clientToUpdate);
        else
            System.out.println("Client not updated " + clientToUpdate);

        System.out.println("\nDelete client");
        var clientToDelete = new Client(4);
        var deleted = clientDAO.deleteClient(clientToDelete);
        if (deleted)
            System.out.println("Client deleted: " + clientToDelete);
        else
            System.out.println("Failed on delete " + clientToDelete);

    }
    */
}
















