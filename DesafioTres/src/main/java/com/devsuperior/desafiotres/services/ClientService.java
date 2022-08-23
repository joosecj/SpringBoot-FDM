package com.devsuperior.desafiotres.services;

import com.devsuperior.desafiotres.dto.ClientDTO;
import com.devsuperior.desafiotres.entities.Client;
import com.devsuperior.desafiotres.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public ClientDTO findByeId(Long id) {
        Client client = clientRepository.findById(id).get();
        return new ClientDTO(client);
    }
    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> clients = clientRepository.findAll(pageable);
        return clients.map(ClientDTO::new);
    }
    @Transactional(readOnly = false)
    public ClientDTO insert(ClientDTO clientDTO) {
        Client entity = new Client();
        copyDtoToClient(clientDTO, entity);
        entity = clientRepository.save(entity);
        return new ClientDTO(entity);
    }
    @Transactional(readOnly = false)
    public ClientDTO update(Long id, ClientDTO clientDTO) {
        Client entity = clientRepository.getReferenceById(id);
        copyDtoToClient(clientDTO, entity);
        return new ClientDTO(clientRepository.save(entity));
    }

    @Transactional(readOnly = false)
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    public void copyDtoToClient(ClientDTO clientDTO, Client entity) {
        entity.setName(clientDTO.getName());
        entity.setCpf(clientDTO.getCpf());
        entity.setIncome(clientDTO.getIncome());
        entity.setBirthDate(clientDTO.getBirthDate());
        entity.setChildren(clientDTO.getChildren());
    }
}
