package dev.sstol.home_budget.persistent;

import dev.sstol.home_budget.persistent.entities.catalogs.CatalogCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sergey Stol
 * 2024-05-15
 */
public interface CatalogCategoriesRepository extends JpaRepository<CatalogCategory, Integer> {
}
