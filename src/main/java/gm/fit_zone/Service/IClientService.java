package gm.fit_zone.Service;

import gm.fit_zone.model.Client;
import java.util.List;

public interface IClientService {
    public List<Client> listClients();

    public Client getClientById(Integer idClient);

    // Next method = client.exists() ? create new client : update client
    public void saveClient(Client client);

    public void deleteClientById(Client client);
}
