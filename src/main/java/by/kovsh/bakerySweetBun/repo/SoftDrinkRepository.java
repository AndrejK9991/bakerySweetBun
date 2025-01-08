package by.kovsh.bakerySweetBun.repo;

import by.kovsh.bakerySweetBun.entity.Pie;
import by.kovsh.bakerySweetBun.entity.SoftDrink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftDrinkRepository extends JpaRepository<SoftDrink, Long> {
}
