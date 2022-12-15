package org.perscholas;

public class ParkingSBA {

	public static void main(String[] args) {
		
HospitalParking hospitalPark = new HospitalParking(10);
System.out.println("  Price for the hospital  parking is " +hospitalPark.processTicket());
MallParking mallPark = new MallParking (10);
System.out.println("  Price for the mall  parking is " +mallPark.processTicket());


	}

}
