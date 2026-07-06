package com.warehouse;

import com.warehouse.entity.Clients;
import com.warehouse.repository.ClientRepository;
import com.warehouse.repository.SpecificationsRepository;
import com.warehouse.repository.TtnRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ClientsRepositoryTest {

    @Autowired
    private ClientRepository clientsRepository;

    @Autowired
    private SpecificationsRepository specificationsRepository;  // ← ДОБАВИТЬ!

    @Autowired
    private TtnRepository ttnRepository;  // ← ДОБАВИТЬ!

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void cleanUp() {  // ← ВЕСЬ КОД ВНУТРИ МЕТОДА!
        // 1. Сначала спецификации (ссылаются на ttns)
        specificationsRepository.deleteAll();

        // 2. Потом накладные (ссылаются на clients)
        ttnRepository.deleteAll();

        // 3. Потом клиентов
        clientsRepository.deleteAll();
    }

    @Test
    void whenSaveClient_thenFindItById() {
        Clients client = new Clients();
        client.setClientName("Test Client");
        client.setType(1);

        Clients savedClient = clientsRepository.save(client);  // ← через инстанс!

        assertThat(savedClient.getClientId()).isNotNull();

        Clients foundClient = clientsRepository.findById(savedClient.getClientId()).orElse(null);
        assertThat(foundClient).isNotNull();
        assertThat(foundClient.getClientName()).isEqualTo("Test Client");
    }

    @Test
    void whenFindByType_thenReturnClients() {
        Clients client1 = new Clients();
        client1.setClientName("John");
        client1.setType(0);
        entityManager.persist(client1);

        Clients client2 = new Clients();
        client2.setClientName("Alice");
        client2.setType(1);
        entityManager.persist(client2);

        List<Clients> clients = clientsRepository.findByType(1);
        assertThat(clients).hasSize(1);
        assertThat(clients.get(0).getClientName()).isEqualTo("Alice");
    }
}