package pe.edu.upc.aww.takemehomes.serviceinterfaces;

import pe.edu.upc.aww.takemehomes.entities.Message;

import java.util.List;

public interface IMessageService {
    public void insert(Message message);
    public List<Message> list();
    public Message listId(int idMessage);
    public void delete(int idMessage);
}
