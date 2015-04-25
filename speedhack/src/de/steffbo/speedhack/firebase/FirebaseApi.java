package de.steffbo.speedhack.firebase;

import com.firebase.client.Firebase;

public class FirebaseApi {

	public static void main(String[] args) {
		Firebase client = new Firebase("https://steffbo.firebaseIO.com");
		
		System.out.println(client.getSdkVersion());
	}
}
