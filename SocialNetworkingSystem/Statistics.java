package SocialNetworkingSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statistics {

	Map<String,Integer> map=new HashMap<String,Integer>();
	
	public void numberOfConnections(User user, List<User> friendList) {
		// TODO Auto-generated method stub
		int count=friendList.size();
		System.out.println("Number of connections in friendlist is "+ count);//number of post
	}

	
	

}
