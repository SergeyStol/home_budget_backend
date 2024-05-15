package dev.sstol.home_budget.persistent;

import dev.sstol.home_budget.persistent.entities.catalogs.CatalogUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sergey Stol
 * 2024-05-15
 */
@Repository
public interface CatalogUnitsRepository extends JpaRepository<CatalogUnit, Integer> {

}
