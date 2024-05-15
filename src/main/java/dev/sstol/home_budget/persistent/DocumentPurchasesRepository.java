package dev.sstol.home_budget.persistent;

import dev.sstol.home_budget.persistent.entities.DocumentPurchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sergey Stol
 * 2024-05-15
 */
@Repository
public interface DocumentPurchasesRepository extends JpaRepository<DocumentPurchase, Integer> {

}
