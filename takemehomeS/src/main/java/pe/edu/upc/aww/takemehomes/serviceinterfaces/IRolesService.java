package pe.edu.upc.aww.takemehomes.serviceinterfaces;

import pe.edu.upc.aww.takemehomes.entities.Role;

import java.util.List;

public interface IRolesService {

    public void insert(Role role);
    public List<Role> list();
}
