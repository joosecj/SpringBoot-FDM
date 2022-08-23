package com.devsuperior.desafiotres.services;

import com.devsuperior.desafiotres.dto.ClientDTO;
import com.devsuperior.desafiotres.entities.Client;
import com.devsuperior.desafiotres.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

}
