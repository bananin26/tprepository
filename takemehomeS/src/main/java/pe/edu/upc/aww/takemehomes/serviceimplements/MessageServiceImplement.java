package pe.edu.upc.aww.takemehomes.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.takemehomes.entities.Message;
import pe.edu.upc.aww.takemehomes.repositories.IMessageRepository;
import pe.edu.upc.aww.takemehomes.serviceinterfaces.IMessageService;

import java.util.List;
@Service
public class MessageServiceImplement implements IMessageService {
    @Autowired
    private IMessageRepository mR;


    @Override
    public void insert(Message message) {
        mR.save(message);
    }

    @Override
    public List<Message> list() {
        return mR.findAll();
    }

    @Override
    public Message listId(int idMessage) {
        return mR.findById(idMessage).orElse(new Message());
    }

    @Override
    public void delete(int idMessage) {
        mR.deleteById(idMessage);
    }
}
