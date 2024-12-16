import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfiguration {

    @Bean
    CommandLineRunner initDatabase(StoreModelAPI storeService, LedgerAPI ledger) {
        return args -> {

            // Step 1: Provision Store
            storeService.provisionStore(1L, "75 Forbes", "My First Store", null);

            // Step 2: Provision Customer
            Customer customer = storeService.provisionCustomer(
                    1L,
                    "Sergey",
                    "Sundukovskiy",
                    CustomerType.guest,
                    "ssunduko@gmail.com",
                    "75 Forbes",
                    null
            );

            // Step 3: Provision Basket
            Basket basket = storeService.provisionBasket(1L, null);

            // Step 4: Assign Basket to Customer
            storeService.assignCustomerBasket(customer.getId(), basket.getId(), null);

            // Step 5: Implement Ledger Instantiation
            Account storeAccount = ledger.createAccount(
                    1L, // Store ID as account ID
                    "Store Account",
                    AccountType.BUSINESS,
                    "Account for My First Store"
            );

            Account customerAccount = ledger.createAccount(
                    customer.getId(),
                    "Customer Account",
                    AccountType.PERSONAL,
                    "Account for Sergey Sundukovskiy"
            );

            // Step 6: Persist Transactions
            ledger.recordTransaction(
                    storeAccount.getId(),
                    customerAccount.getId(),
                    basket.getTotalPrice(),
                    "Initial purchase transaction"
            );
        };
    }
}
