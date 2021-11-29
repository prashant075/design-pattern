package c_com.java.builderPattern;

public class Laptop {
	
	private String ram;
	
	private String hdd;
	private String cpu;
	
	
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;
	
	//step 1:
	private Laptop(LaptopBuilder builder) {
		this.ram = builder.ram;
		this.cpu = builder.cpu;
		this.hdd = builder.hdd;
		
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicsEnabled = builder.isGraphicsEnabled;
	}
	
	
	
	//step 2:
	public void setRam(String ram) {
		this.ram = ram;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public void setGraphicsEnabled(boolean isGraphicsEnabled) {
		this.isGraphicsEnabled = isGraphicsEnabled;
	}
	public void setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}
	
	//step 3:
		public static class LaptopBuilder{
			
			private String ram;
			private String hdd;
			private String cpu;
			
			//optional
			private boolean isGraphicsEnabled;
			private boolean isBluetoothEnabled;
			
			//step 4:
			public LaptopBuilder(String ram, String hdd, String cpu) {
				super();
				this.ram = ram;
				this.hdd = hdd;
				this.cpu = cpu;
			}

			
			//step 5:
			public LaptopBuilder setGraphicsEnabled(boolean isGraphicsEnabled) {
				this.isGraphicsEnabled = isGraphicsEnabled;
				return this;
			}


			public LaptopBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
				this.isBluetoothEnabled = isBluetoothEnabled;
				return this;
			}
			
			//step 6:
			public Laptop build() {
				return new Laptop(this);
			}
			
			
		}
	
	
		@Override
		public String toString() {
			return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled=" + isGraphicsEnabled
					+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
		}

}
