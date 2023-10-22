package kasus1;

public class Commission extends Hourly{
	double totalSales;
	double commissionRate;
	
	public Commission(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate, double rateEmployee) {
		super(eName,eAddress,ePhone,socSecNumber,rate);
		commissionRate = rateEmployee;
	}
	
	public void addSales(double TotalSales) {
		totalSales += TotalSales;
	}
	
	public double pay() {
		double payment = commissionRate + totalSales + super.pay(); 
		totalSales = 0;
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nCurrent Total Sales: " + totalSales;
		
		return result;
	}
	
}


