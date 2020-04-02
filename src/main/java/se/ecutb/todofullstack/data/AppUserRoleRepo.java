package se.ecutb.todofullstack.data;

import org.springframework.data.jpa.repository.JpaRepository;
import se.ecutb.todofullstack.entity.AppUserRole;

import java.util.Optional;

public interface AppUserRoleRepo extends JpaRepository<AppUserRole, Integer> {

    @Override
    Optional<AppUserRole> findById(Integer integer);

    Optional<AppUserRole> findByRole(AppUserRole appUserRole);
}
