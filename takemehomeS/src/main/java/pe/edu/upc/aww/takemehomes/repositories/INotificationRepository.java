package pe.edu.upc.aww.takemehomes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aww.takemehomes.entities.Notification;

public interface INotificationRepository extends JpaRepository<Notification, Integer> {
}
