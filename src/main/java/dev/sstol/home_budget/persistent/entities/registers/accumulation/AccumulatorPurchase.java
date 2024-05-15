package dev.sstol.home_budget.persistent.entities.registers.accumulation;

import dev.sstol.home_budget.persistent.entities.catalogs.CatalogCategory;
import dev.sstol.home_budget.persistent.entities.catalogs.CatalogUnit;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * @author Sergey Stol
 * 2024-05-15
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "acc_purchases")
public class AccumulatorPurchase {
   @EmbeddedId
   AccumulatorPurchaseId id;

   String productName;

   @ManyToOne
   CatalogCategory category;

   @ManyToOne
   CatalogUnit productUnit;

   float productVolume;
   float productCost;
}
