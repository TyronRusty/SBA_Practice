package org.perscholas;

public interface ParkingSystem {
double NIGHTLY = 30 , MORNING =20 , TWENTY_FOUR = 45;
double processTicket(); 

	
}
class HospitalParking implements ParkingSystem{
	
	int time;
	double surcharge = 0.20;
	HospitalParking (int time){
		this.time = time;
	}
	@Override
	public double processTicket() {
		if (5 <= this.time && this.time <=17) 
		{
			return surcharge* MORNING + MORNING ;
		}
		else if (17<=this.time && this.time <=24) 
		{
			return surcharge *NIGHTLY + NIGHTLY;
		}
		else 
		{
			return surcharge*TWENTY_FOUR +TWENTY_FOUR;
		}
		
	}
	@Override
	public String toString() {
		return "HospitalParking [time=" + time + ", surcharge=" + surcharge + "]";
	}
	
}
class MallParking implements ParkingSystem{
	int time;
	double surcharge = 0.10;
	MallParking (int time){
		this.time = time;}
	@Override
	public double processTicket() {
		// TODO Auto-generated method stub
		if (5 <= this.time && this.time <=17) 
		{
			return surcharge* MORNING + MORNING ;
		}
		else if (17<=this.time && this.time <=24) 
		{
			return surcharge *NIGHTLY + NIGHTLY;
		}
		else 
		{
			return surcharge*TWENTY_FOUR +TWENTY_FOUR;
		}
	}
	@Override
	public String toString() {
		return "MallParking [time=" + time + ", surcharge=" + surcharge + "]";
	}
	
	
}
