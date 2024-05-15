package dev.sstol.home_budget.persistent.entities.catalogs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * @author Sergey Stol
 * 2024-05-15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "cat_categories")
public class CatalogCategory {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   private String title;
}
