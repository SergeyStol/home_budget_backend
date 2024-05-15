package dev.sstol.home_budget.persistent;

import dev.sstol.home_budget.persistent.entities.registers.accumulation.AccumulatorPurchase;
import dev.sstol.home_budget.persistent.entities.registers.accumulation.AccumulatorPurchaseId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sergey Stol
 * 2024-05-15
 */
@Repository
public interface AccumulationRegisterPurchasesRepository extends JpaRepository<AccumulatorPurchase, AccumulatorPurchaseId> {

}
