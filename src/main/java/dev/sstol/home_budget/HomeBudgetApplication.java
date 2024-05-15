package dev.sstol.home_budget;

import dev.sstol.home_budget.persistent.AccumulationRegisterPurchasesRepository;
import dev.sstol.home_budget.persistent.CatalogCategoriesRepository;
import dev.sstol.home_budget.persistent.DocumentPurchasesRepository;
import dev.sstol.home_budget.persistent.CatalogStoresRepository;
import dev.sstol.home_budget.persistent.CatalogUnitsRepository;
import dev.sstol.home_budget.persistent.entities.catalogs.Address;
import dev.sstol.home_budget.persistent.entities.catalogs.CatalogCategory;
import dev.sstol.home_budget.persistent.entities.catalogs.CatalogStore;
import dev.sstol.home_budget.persistent.entities.DocumentPurchase;
import dev.sstol.home_budget.persistent.entities.catalogs.CatalogUnit;
import dev.sstol.home_budget.persistent.entities.registers.accumulation.AccumulatorPurchase;
import dev.sstol.home_budget.persistent.entities.registers.accumulation.AccumulatorPurchaseId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class HomeBudgetApplication implements CommandLineRunner {

   public static void main(String[] args) {
      SpringApplication.run(HomeBudgetApplication.class, args);
   }

   @Autowired
   CatalogStoresRepository catalogStoresRepository;

   @Autowired
   CatalogCategoriesRepository catalogCategoriesRepository;

   @Autowired
   CatalogUnitsRepository catalogUnitsRepository;

   @Autowired
   DocumentPurchasesRepository documentPurchasesRepository;

   @Autowired
   AccumulationRegisterPurchasesRepository accumulationRegisterPurchasesRepository;

   @Override
   public void run(String... args) throws Exception {
      Address address = Address.builder()
        .country("Country1")
        .city("City1")
        .street("Street1")
        .building("Building1")
        .phoneNumber("11-111-11-11")
        .postalCode("11111111")
        .build();
      CatalogStore store = new CatalogStore(0, "Store1Official", "Store1", address);
      catalogStoresRepository.save(store);

      DocumentPurchase documentPurchase = new DocumentPurchase(0, LocalDateTime.now(), "111", store);
      documentPurchasesRepository.save(documentPurchase);

      CatalogCategory category = new CatalogCategory(0, "Category1");
      catalogCategoriesRepository.save(category);

      CatalogUnit unit = new CatalogUnit(0, "Unit1");
      catalogUnitsRepository.save(unit);

      AccumulatorPurchaseId accumulatorPurchaseId = new AccumulatorPurchaseId(LocalDateTime.now(), documentPurchase);
      AccumulatorPurchase movement = new AccumulatorPurchase(accumulatorPurchaseId, "Product1", category, unit, 12.35f, 30f);
      accumulationRegisterPurchasesRepository.save(movement);

      foo();
   }

   private void foo() {
      System.out.println("***** CATALOG STORES *****");
      List<CatalogStore> stores = catalogStoresRepository.findAll();
      stores.forEach(System.out::println);

      System.out.println("***** CATALOG CATEGORIES *****");
      List<CatalogCategory> categories = catalogCategoriesRepository.findAll();
      categories.forEach(System.out::println);

      System.out.println("***** CATALOG UNITS *****");
      List<CatalogUnit> units = catalogUnitsRepository.findAll();
      units.forEach(System.out::println);

      System.out.println("***** DOCUMENT PURCHASES *****");
      List<DocumentPurchase> documentPurchases = documentPurchasesRepository.findAll();
      documentPurchases.forEach(System.out::println);

      System.out.println("***** ACCUMULATION REGISTER PURCHASES *****");
      List<AccumulatorPurchase> purchases = accumulationRegisterPurchasesRepository.findAll();
      purchases.forEach(System.out::println);
   }
}
