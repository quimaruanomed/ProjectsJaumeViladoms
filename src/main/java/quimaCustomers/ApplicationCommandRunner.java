package quimaCustomers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationCommandRunner implements CommandLineRunner  {

	
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	CustomerService customerservice;

	@Override
	public void run(String... args) throws Exception {

		logger.info("Welcome to the runner from commandLineRunner");


		Customer customer1 = new Customer("1","Tom", "Jones");
		Customer customer2 = new Customer("2", "Silvia", "Eriksson");
		Customer customer3 = new Customer("3", "Anna", "Britzles");
		Customer customer4 = new Customer("4", "Paul", "Gates");
		Customer customer5 = new Customer("5", "Felip", "Garcia");


		customerservice.save(customer1);
		customerservice.save(customer2);
		customerservice.save(customer3);
		customerservice.save(customer4);
		customerservice.save(customer5);


		logger.info(customerservice.findAll());

	}
}
