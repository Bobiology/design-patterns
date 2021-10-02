package builder.pattern;
public class CarBuilder {
	
	public CarBuilder(){
		Car car = new Car();
		car.buildEngine();
		car.buidBody();
		car.buildChessis();
	}
}
