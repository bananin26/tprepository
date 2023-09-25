package pe.edu.upc.aww.takemehomes.dtos;

import pe.edu.upc.aww.takemehomes.entities.User;

import java.time.LocalDate;

public class ForumDTO {

    private int idForum;
    private String forum;
    private LocalDate date;

    private User idUser;

    public int getIdForum() {
        return idForum;
    }

    public void setIdForum(int idForum) {
        this.idForum = idForum;
    }

    public String getForum() {
        return forum;
    }

    public void setForum(String forum) {
        this.forum = forum;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }
}
