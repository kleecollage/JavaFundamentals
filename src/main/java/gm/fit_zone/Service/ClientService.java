package gm.fit_zone.Service;

import gm.fit_zone.model.Client;
import gm.fit_zone.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {
    @Autowired
    private IClientRepository clientRepository;

    @Override
    public List<Client> listClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Integer idClient) {
        return clientRepository.findById(idClient).orElse(null);
    }

    @Override
    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void deleteClientById(Client client) {
        clientRepository.delete(client);
    }
}
