package se.ecutb.todofullstack.data;

import org.springframework.data.jpa.repository.JpaRepository;
import se.ecutb.todofullstack.entity.AppUser;

public interface AppUserRepo extends JpaRepository<AppUser, Integer> {

}
