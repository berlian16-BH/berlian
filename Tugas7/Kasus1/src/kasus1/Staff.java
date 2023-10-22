package kasus1;
// A set of employees to be added to a firm.

public class Staff {
	private StaffMember[] staffList;
	
	public Staff() {
		staffList = new StaffMember[8];
		
		staffList[0] = new Executive("Sam", "123 Main Line", "555-0469",
				"123-45-6789", 2423.07);
		
		staffList[1] = new Employee ("Carla", "456 Off Line",
				"555-0101", "987-65-4321", 1246.15);
		
		staffList[2] = new Employee ("Woody", "789 Off Rocker",
				"555-0000", "010-20-3040", 1169.23);
		
		staffList[3] = new Hourly ("Diane", "678 Fifth Ave.",
				"555-0690", "958-47-3625", 10.55);
		
		staffList[4] = new Volunteer ("Norm", "987 Suds Blvd.",
				"555-8374");
		
		staffList[5] = new Volunteer ("Cliff", "321 Duds Lane",
				"555-7282");
		
		staffList[6] = new Commission("Brownz", "3321 Bandung",
				"214-421", "012214-421", 6.25, 0.2);
		
		staffList[7] = new Commission("Suuuu", "321 Rancaekek",
				"3321-421", "001-221-332", 9.75, 0.15);
		
		((Executive) staffList[0]).awardBonus(500.00);
		
		((Hourly) staffList[3]).addHours(40);
		
		((Commission)staffList[6]).addHours(35);
		((Commission)staffList[6]).addSales(400);;
	
		((Commission)staffList[7]).addHours(40);
		((Commission)staffList[7]).addSales(950);;
	}
	
	
	public void payday() {
		double amount;
		
		for (int k = 0; k < staffList.length; k++) {
			System.out.println(staffList[k]);
			
			amount = staffList[k].pay(); // polymorphic
			
			if (amount == 0.0)
				System.out.println("Thanks!");
			else	//why can't we invoke pay()'s here?
				System.out.println("Pain: " + amount);
			
			System.out.println("----------------------------------------");
		}
	}
}
