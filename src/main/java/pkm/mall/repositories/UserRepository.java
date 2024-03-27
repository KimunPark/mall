package pkm.mall.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pkm.mall.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
