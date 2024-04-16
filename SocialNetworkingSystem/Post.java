package SocialNetworkingSystem;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Post {
	
	String id;
	String content;
	String userId;
	Long timestamp;

	public Post(String id, String content, String userId, long a) {
		this.id = id;
		this.content = content;
		this.userId = userId;
		this.timestamp = a;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	//@Override
/*	public String toString() {
		return "Post [id=" + id + ", content=" + content + ", author=" + author + ", timestamp=" + timestamp + "]";
	}*/
	@Override
	public String toString() {
		return "Post [id=" + id + ", content=" + content + ", userId=" + userId + "]";
	}
	

}
