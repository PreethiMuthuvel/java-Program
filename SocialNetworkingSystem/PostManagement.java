package SocialNetworkingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.preethi.test.Course;

public class PostManagement {

	// List<Post> postList = new ArrayList<Post>();
	public Map<String, List<Post>> postDetailsMap = new HashMap<String, List<Post>>();
	Map<String, Integer> postCountMap = new HashMap<String, Integer>();

	public void createPost(User user, Post post) {
		// TODO Auto-generated method stub

		List<Post> posts = postDetailsMap.getOrDefault(user.getId(), new ArrayList<Post>());
		posts.add(post);

		postDetailsMap.put(user.getId(), posts);

		System.out.println(postDetailsMap);

	}

	public void postByfriends(User user) {
		// TODO Auto-generated method stub

		List<User> friendLists = user.getFriendList();
		for (User userr : friendLists) {
			if (postDetailsMap.containsKey(userr.getId())) {

				System.out.println("Posts " + userr.getId() + ": " + postDetailsMap.get(userr.getId()));

			}
		}

	}

	public void mostActiveUser() {
		int maximumValue = 0;
		String maxUser = null;
		for (Map.Entry<String, List<Post>> entry : postDetailsMap.entrySet()) {
			String userId = entry.getKey();
			List<Post> posts = entry.getValue();
			int count = posts.size();
			// postCountMap.put(userId,count);
			if (count > maximumValue) {
				maxUser = userId;
				maximumValue = count;
			}

		}
		System.out.println("Maximum posted user  is  " + maxUser + " count is " + maximumValue);

	}

}
