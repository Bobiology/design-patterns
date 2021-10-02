package Notification;

public class Notification101 implements Notification {
	
	public Notification101() {
		
	}

	@Override
	public void sendEmail(String email) {
		System.out.println("************* EMAIL NOTIFICATION STARTS *************");
		connect();
		authenticate();
		System.out.println("Email send to " + email);

		disconnect();
		System.out.println("************* EMAIL NOTIFICATION ENDS *************");


	}

	@Override
	public void sendSMS(String mobile) {
		System.out.println("************* SMS NOTIFICATION START *************");
		connect();
		authenticate();
		System.out.println("SMS Notification sent to "+mobile);
		disconnect();
		System.out.println("************* SMS NOTIFICATION ENDS *************");

	}

	@Override
	public void connect() {
		System.out.println("Connect");

	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect");

	}

	@Override
	public void authenticate() {
		System.out.println("Authenticate");

	}

}
