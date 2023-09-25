package pe.edu.upc.aww.takemehomes.serviceinterfaces;

import pe.edu.upc.aww.takemehomes.entities.Forum;

import java.time.LocalDate;
import java.util.List;

public interface IForumService {
    public void insert(Forum forum);
    public List<Forum> list();
    public void delete(int idForm);
    public Forum listId(int idForum);
    List<Forum>findByDate(LocalDate date);
}
