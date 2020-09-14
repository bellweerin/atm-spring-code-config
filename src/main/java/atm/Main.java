package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DataSourceDB dataSourceDB = new DataSourceDB();
//        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
//        Bank bank = new Bank("My Bank", dataSourceFile);
//        ATM atm = new ATM(bank);
//        AtmUI atmUI = new AtmUI(atm);
//        atmUI.run();
        ApplicationContext context = new AnnotationConfigApplicationContext(ATMConfig.class);
        ATM atm = context.getBean(ATM.class);
//        String name = atm.validateCustomer(2,2345);
        String name = atm.validateCustomer(1,1234);
        System.out.println(name+" "+atm.getBalance());
        Bank bank = context.getBean(Bank.class);
        System.out.println(bank.getName());
    }
}
