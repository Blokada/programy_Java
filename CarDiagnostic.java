
public class CarDiagnostic {
	public static void main(String[] args) {
		Car audiA4 = new Car();
		audiA4.carBrand = "Audi";
		audiA4.model = "A4";
		audiA4.year = 2008;
		audiA4.horsePower = 170;
		
		Car vwGolf = new Car();
		vwGolf.carBrand = "Volkswagen";
		vwGolf.model = "Golf";
		vwGolf.year = 2010;
		vwGolf.horsePower = 130;
		
		System.out.println("Samochód 1: ");
		System.out.println(audiA4.carBrand + " " + audiA4.model
		+ ", rok produkcji: " + audiA4.year + ", moc: " + audiA4.horsePower);
		
		System.out.println("Samochód 2: ");
		System.out.println(vwGolf.carBrand + " " + vwGolf.model
		+ ", rok produkcji: " + vwGolf.year + ", moc: " + vwGolf.horsePower);
	}

}
