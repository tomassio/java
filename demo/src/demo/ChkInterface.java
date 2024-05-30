package demo;

public class ChkInterface implements VehicleInf {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		VehicleInf t = new ChkInterface();
		t.cleanVehicle();
		}

	@Override
	public void cleanVehicle() {
		// TODO Auto-generated method stub
		System.out.println("cleanVehicle");		
	}
    
}
