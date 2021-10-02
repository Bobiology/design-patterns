package Notification;

public interface Notification {
	public  void sendEmail(String email);
	public  void sendSMS(String mobile);
	public  void connect();
	public  void disconnect();
	public  void authenticate();
	
}
