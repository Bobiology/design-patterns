package Notification;

public class Main {
	public static void main(String[] args) {
		
		Notification101 notification101 = new Notification101();
		notification101.sendEmail("XXXXXXXXXX");
		System.out.println();
		notification101.sendSMS("XXXXXXXXX");
	}
}
