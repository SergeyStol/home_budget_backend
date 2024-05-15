package dev.sstol.home_budget.persistent.entities.catalogs;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Sergey Stol
 * 2024-05-15
 */
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Builder
public class Address {
   @NotNull
   @Column(nullable = false)
   String country;
   @NotNull
   @Column(nullable = false)
   String city;
   String street;
   String building;
   String postalCode;
   String phoneNumber;
}
