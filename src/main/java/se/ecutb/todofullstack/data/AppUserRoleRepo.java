package se.ecutb.todofullstack.data;

import org.springframework.data.jpa.repository.JpaRepository;
import se.ecutb.todofullstack.entity.AppUserRole;

public interface AppUserRoleRepo extends JpaRepository<AppUserRole, Integer> {
}
