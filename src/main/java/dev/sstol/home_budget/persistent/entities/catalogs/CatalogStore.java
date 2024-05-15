package dev.sstol.home_budget.persistent.entities.catalogs;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "cat_stores")
public class CatalogStore {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   String officialTitle;
   @NotNull
   @Column(unique = true, nullable = false)
   String title;

   Address address;

}
