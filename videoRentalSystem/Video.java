package videoRentalSystem;

import java.util.Comparator;

public class Video {

	String title;
	boolean isAvailable;
	int rating;

	public Video(String title) {
		// TODO Auto-generated constructor stub

		this.title = title;
		isAvailable = true;
		rating = 0;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Video [title=" + title + ", isAvailable=" + isAvailable + ", rating=" + rating + "]";
	}
	// public static Comparator<Video> compareByTitle = Comparator.comparing(video
	// -> video.getTitle());

}
