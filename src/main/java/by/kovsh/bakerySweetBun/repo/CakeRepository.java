package by.kovsh.bakerySweetBun.repo;

import by.kovsh.bakerySweetBun.entity.Cake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CakeRepository extends JpaRepository<Cake, Long> {
}
