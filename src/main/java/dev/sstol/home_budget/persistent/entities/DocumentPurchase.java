package dev.sstol.home_budget.persistent.entities;

 import dev.sstol.home_budget.persistent.entities.catalogs.CatalogStore;
 import jakarta.persistence.Entity;
 import jakarta.persistence.GeneratedValue;
 import jakarta.persistence.GenerationType;
 import jakarta.persistence.Id;
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
 @Entity
 @Table(name = "doc_purchases")
public class DocumentPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    LocalDateTime dateTime;

    String number;

    @ManyToOne
    CatalogStore store;
}
