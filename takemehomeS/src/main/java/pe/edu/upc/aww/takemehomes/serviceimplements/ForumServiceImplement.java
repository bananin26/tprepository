package pe.edu.upc.aww.takemehomes.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.takemehomes.entities.Forum;
import pe.edu.upc.aww.takemehomes.repositories.IForumRepository;
import pe.edu.upc.aww.takemehomes.serviceinterfaces.IForumService;

import java.time.LocalDate;
import java.util.List;

@Service
public class ForumServiceImplement implements IForumService {

    @Autowired
    private IForumRepository fR;
    @Override
    public void insert(Forum forum) {
        fR.save(forum);
    }

    @Override
    public List<Forum> list() {
        return fR.findAll();
    }

    @Override
    public void delete(int idForum) {
        fR.deleteById(idForum);
    }

    @Override
    public Forum listId(int idForum) {
        return fR.findById(idForum).orElse(new Forum());
    }

    @Override
    public List<Forum> findByDate(LocalDate date) {
        return fR.findByDate(date);
    }
}
