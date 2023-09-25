package pe.edu.upc.aww.takemehomes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aww.takemehomes.entities.Role;

public interface IRoleRepository extends JpaRepository<Role,Long> {
}
