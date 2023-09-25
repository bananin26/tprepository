package pe.edu.upc.aww.takemehomes.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.takemehomes.entities.Role;
import pe.edu.upc.aww.takemehomes.repositories.IRoleRepository;
import pe.edu.upc.aww.takemehomes.serviceinterfaces.IRolesService;

import java.util.List;

@Service
public class RoleServiceImplement implements IRolesService {

    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

}
