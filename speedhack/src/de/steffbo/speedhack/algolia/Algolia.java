package de.steffbo.speedhack.algolia;

import com.algolia.search.saas.APIClient;
import com.algolia.search.saas.Index;

import de.steffbo.speedhack.Util;

public class Algolia {

	public static void main(String[] args) {
		
//		APIClient client = new APIClient(Util.getProperty("algolia_id"), Util.getProperty("algolia_key"));		
//		Index index = client.initIndex("steffbo");
		
		System.out.println(Util.getProperty("algolia_id"));
	}

}
