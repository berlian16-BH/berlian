package kasus3;

public class Salesperson implements Comparable{
	
	private String firstName, lastName;
	private int totalSales;
	
	public Salesperson(String first, String last, int sales)
	{
		firstName = first;
		lastName = last;
		totalSales = sales;
	}
	
	public String toString()
	{
		return lastName + ", " + firstName + ":  \t" + totalSales;
	}
	
	public boolean equals (Object other)
	{
		return (lastName.equals(((Salesperson)other).getLastName()) &&
				 firstName.equals(((Salesperson)other).getFirstName()));
	}
	
	@Override
	public int compareTo(Object other) {
		int result = 0;
		if (totalSales > ((Salesperson)other).totalSales) result = 1;
		else if(totalSales < ((Salesperson)other).totalSales) result = -1;
		else {
			if (lastName.compareTo(((Salesperson) other).getLastName()) < 0)
                return 1;
            else
                return -1;
		}
		return result;
	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getTotalSales() {
		return totalSales;
	}

}