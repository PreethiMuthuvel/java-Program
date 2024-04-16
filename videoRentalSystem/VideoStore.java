package videoRentalSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.preethi.test.Mark;

public class VideoStore {

	// Video[] videoArray = new Video[10];
	// List<Video> videoList=new ArrayList<Video>();
	public Map<String, Video> videoListMap = new HashMap<String, Video>();
	public List<String> checkOutList = new ArrayList<String>();

	public void addVideos(String title) {

		Video video = new Video(title);
		videoListMap.put(title, video);
		System.out.println(videoListMap.toString());

	}

	public Video checkOut(String title) {

		Video video = new Video(title);
		if (videoListMap.containsKey(title)) {
			video.setAvailable(false);
			checkOutList.add(title);

			System.out.println(checkOutList.toString());

		}

		return video;
	}

	public void receiveRating(String title, int rating) {
		Video video = new Video(title);
		if (videoListMap.containsKey(title)) {
			videoListMap.get(title).setRating(rating);
			System.out.println(videoListMap);

		}

	}

	public void displayInventoryVideos() {
		// TODO Auto-generated method stub
		System.out.println("before returning the videos");
		for (Map.Entry<String, Video> entry : videoListMap.entrySet()) {
			// String title = entry.getKey();

			Video videos = entry.getValue();

			System.out.println(videos);

		}
	}

	public void returnVideos(String title) {
		// TODO Auto-generated method stub

		if (checkOutList.contains(title)) {
			checkOutList.remove(title);
			if (videoListMap.containsKey(title)) {
				videoListMap.get(title).setAvailable(true);
			}

		}

	}

	public void sortMapByKey() {
		// TODO Auto-generated method stub
		ArrayList<String> sortKeys = new ArrayList<String>(videoListMap.keySet());
		Collections.sort(sortKeys);
		System.out.println("sorting by title");
		for (String x : sortKeys)
			System.out.println("Key = " + x + ", Value = " + videoListMap.get(x));

	}

	public void sortByRating() {
		List<Video> sortList = new ArrayList<Video>();
		// TODO Auto-generated method stub
		for (Map.Entry<String, Video> entry : videoListMap.entrySet()) {
			// String title = entry.getKey();
			Video videos = entry.getValue();
			sortList.add(videos);
		}
			Collections.sort(sortList, new RatingComparator());
			for (Video videolist : sortList) {
				System.out.println(videolist.getRating() + " " + videolist.getTitle() + " " + videolist.isAvailable);
			}
		}
	}


