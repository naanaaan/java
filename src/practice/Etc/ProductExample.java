package practice.Etc;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("그랜져");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		car.setTire("금호타이어");
		
		System.out.println("차모델: " + carModel);
		System.out.println("차타이어: " + car.getTire());
	
	}
}
