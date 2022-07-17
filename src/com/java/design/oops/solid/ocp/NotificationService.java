package com.java.design.oops.solid.ocp;

public class NotificationService implements INotificationService {

	public void sendOTP(String medium) {
		if (medium.equals("email")) {
			// write email related logic
			// use JavaMailSenderAPI
		}
		if (medium.equals("mobile")) {
			// write logic using twillio API
		}
	}

}
