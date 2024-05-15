package dev.sstol.home_budget.persistent.entities.registers.accumulation;

import dev.sstol.home_budget.persistent.entities.DocumentPurchase;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

/**
 * @author Sergey Stol
 * 2024-05-15
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Embeddable
public class AccumulatorPurchaseId {
   LocalDateTime dateTime;
   @ManyToOne
   DocumentPurchase documentPurchase;
}
