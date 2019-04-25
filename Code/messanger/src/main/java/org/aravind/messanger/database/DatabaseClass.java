package org.aravind.messanger.database;

import java.util.HashMap;
import java.util.Map;
import org.aravind.messanger.model.Profile;
import org.aravind.messanger.model.Message;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	public static Map<Long, Profile> getProfiles(){
		return profiles;
	}
}
