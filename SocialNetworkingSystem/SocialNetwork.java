package SocialNetworkingSystem;

import java.util.ArrayList;
import java.util.List;

import com.preethi.test.MarkManagement;

public class SocialNetwork {
	List<SocialNetwork> userListInNetwork = new ArrayList<SocialNetwork>();
	Statistics statistics = new Statistics();
	static PostManagement postManagement = new PostManagement();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SocialNetwork socialNetwork = new SocialNetwork();
		User userA = new User("U001", "Preethi");
		User userB = new User("U002", "Saran");
		socialNetwork.addUserToNetwork(userA);
		socialNetwork.addUserToNetwork(userB);

		User userA1 = new User("U00A1", "Kavitha");
		User userA2 = new User("U00A2", "muthuvel");

		User userB1 = new User("U00B1", "pranitha");
		User userB2 = new User("U00B2", "kavin");

		userB1.addConnection(userB2);
		userA.addConnection(userA2);

		Post post1 = new Post("P001", "todayPic", "U001", System.currentTimeMillis());
		Post post2 = new Post("P002", "sunday", "U002", System.currentTimeMillis());
		Post post3 = new Post("P003", "monday", "U001", System.currentTimeMillis());
		Post post4 = new Post("P004", "tuesday", "U002", System.currentTimeMillis());
		Post post5 = new Post("P005", "wedneday", "U00A1", System.currentTimeMillis());
		Post post6 = new Post("P006", "thursday", "U00A2", System.currentTimeMillis());

		postManagement.createPost(userA, post1);
		postManagement.createPost(userB, post2);
		postManagement.createPost(userA, post3);
		postManagement.createPost(userA, post4);
		postManagement.createPost(userB, post4);
		postManagement.createPost(userA1, post5);
		postManagement.createPost(userA2, post6);

		socialNetwork.getPostByFriend(userA);
		socialNetwork.getPostByFriend(userB);
		socialNetwork.mostActiveUser();

	}

	private void mostActiveUser() {
		// TODO Auto-generated method stub
		postManagement.mostActiveUser();

	}

	private void getPostByFriend(User user) {
		// TODO Auto-generated method stub

		postManagement.postByfriends(user);

	}

	private void addUserToNetwork(User user) {
		// TODO Auto-generated method stub
		userListInNetwork.add(this);

	}

}
