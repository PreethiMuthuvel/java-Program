package SocialNetworkingSystem;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String id;
	private String name;
	private List<User> friendList= new ArrayList<User>();;
	public User(String id, String name) {
		this.id = id;
		this.name = name;
	//	this.friendList = friendList;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getFriendList() {
		return friendList;
	}
	
	
	public void addConnection(User user) {
		this.friendList.add(user);
		//user.friendList.add(user)
		//user.addConnection(this);
		user.friendList.add(this);
	//	System.out.println(user.getFriendList());
		
	}
	
	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", friendList=" + friendList + "]";
	}

	

	
	
	
}
