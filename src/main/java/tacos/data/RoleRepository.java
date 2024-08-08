package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.UserRoles;

public interface RoleRepository extends CrudRepository<UserRoles, Long> {
    UserRoles findByRole(String role);
}
