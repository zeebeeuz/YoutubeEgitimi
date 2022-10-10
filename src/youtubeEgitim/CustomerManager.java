package youtubeEgitim;

public class CustomerManager {

	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}

	public void Save(Customer customer) {
		System.out.println("Müşteri kaydedildi : " + _customer.city);
	}

	public void Delete(Customer customer) {
		System.out.println("Müşteri siindi : " + _customer.city);
	}
	
	public void GiveCredit () {
		_creditManager.Calculate();
		System.out.println("Kredi verildi");
		
	}

}
