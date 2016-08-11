package labs.set4Add.q1;

	public class Q1Driver {
		private int driverNum;
		private String driverName;
		
		public Q1Driver() {
			driverNum = 0;
			driverName = "";
		}
		public Q1Driver(int drNum, String drName) {
			driverNum = drNum;   // OR    setDriverNum(drNum); 
			driverName = drName;
		}
		
		public int getDriverNum() {
			return driverNum;
		}
		public String getDriverName() {
			return driverName;
		}
		
		public void setDriverNum(int drNum) {
			driverNum = drNum;
		}
		public void setDriverName(String drName) {
			driverName = drName;
		}
		
		public String toString() {
			return "\nDriver Name: " + getDriverName() + "\nDriver Number: " + getDriverNum();
		}
	}


