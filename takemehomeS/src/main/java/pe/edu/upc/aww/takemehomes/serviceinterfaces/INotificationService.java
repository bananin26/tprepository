package pe.edu.upc.aww.takemehomes.serviceinterfaces;

import pe.edu.upc.aww.takemehomes.entities.Notification;

import java.util.List;

public interface INotificationService {
    public void insert(Notification notification);
    public List<Notification> list();
    public void delete(int idNotification);
    public Notification listId(int idNotification);
}
