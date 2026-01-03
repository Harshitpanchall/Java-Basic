package encapsulation;

public class Automobile {

	private String color;
	private String make;
	private int gear;
	private int speed;
	
	public final static int NO_OF_GEAR = 6;

	public String getColor() {
		return this.color;

	}

	public void setColor(String color) {
		this.color = color;

	}

	public int getGear() {
		return this.gear;

	}

	public void setGear(int gear) {
		this.gear = gear;

	}

	public String getMake() {
		return this.make;

	}

	public void setMake(String make) {
		this.make = make;

	}
	
	public void brake() {
		if(speed == 0) {
			System.out.println("car is already stoped");
			
		}else {
			speed = speed -10;
		}
	}
		
		public void accelerator() {
			if(speed == 400 || speed > 400) {
				System.out.println("high speed is limlit the brake");
				
			} else {
				speed = speed - 10;
				
			}
		}
		
		public void grear(int grear) {
			if(gear >NO_OF_GEAR) {
				System.out.println("switc 1");
				
				if(speed >1) {
					speed = 20;
					System.out.println("gear no. 6" + speed);
					
				}
				
			}
		}
		
		
		
	}


