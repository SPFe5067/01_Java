package edu.kh.poly.ex1.model.dto;

public class tesla extends car{

		private int batteryCapacity;

		public tesla(String engine, String fuel, int wheel, int batteryCapacity) {
			super(engine, fuel, wheel);
			this.batteryCapacity = batteryCapacity;
		}

		public tesla() {
			
		}

		public int getBatteryCapacity() {
			return batteryCapacity;
		}

		public void setBatteryCapacity(int batteryCapacity) {
			this.batteryCapacity = batteryCapacity;
		}
		
		//car.toString() 오버라이딩
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " / " + batteryCapacity;
		}

		

		
		
	

}
