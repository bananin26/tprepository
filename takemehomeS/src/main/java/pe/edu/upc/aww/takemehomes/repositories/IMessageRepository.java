package pe.edu.upc.aww.takemehomes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aww.takemehomes.entities.Message;

public interface IMessageRepository extends JpaRepository<Message,Integer> {
}
