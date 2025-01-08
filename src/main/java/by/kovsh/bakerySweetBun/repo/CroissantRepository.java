package by.kovsh.bakerySweetBun.repo;

import by.kovsh.bakerySweetBun.entity.Croissant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CroissantRepository extends JpaRepository<Croissant, Long> {
}
