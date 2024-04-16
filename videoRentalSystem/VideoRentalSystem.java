package videoRentalSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.preethi.test.Mark;

public class VideoRentalSystem {

	public Map<String, Integer> checkOutMap = new HashMap<String, Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoRentalSystem videoRentalSystem = new VideoRentalSystem();
		VideoStore videoStore = new VideoStore();
		String video1 = "Gaming Video";
		String video2 = "Playing Video";
		String video3 = "Devotinal Video";
		String video4 = "Cooking Video";
		videoStore.addVideos(video1);
		videoStore.addVideos(video2);
		videoStore.addVideos(video3);
		videoStore.addVideos(video4);

		videoStore.checkOut(video1);
		videoStore.checkOut(video2);
		/*
		 * *
		 * 
		 * 
		 * 
		 * videoStore.returnVideos(video1);
		 */
		videoRentalSystem.checkOutVideos(video1);
		videoRentalSystem.checkOutVideos(video2);
		videoRentalSystem.checkOutVideos(video1);
		videoStore.receiveRating(video1, 8);
		videoStore.receiveRating(video2, 9);
		videoStore.displayInventoryVideos();

		videoStore.sortMapByKey();
		videoStore.sortByRating();
	}

	private void checkOutVideos(String title) {
		// TODO Auto-generated method stub
		VideoStore videoStore = new VideoStore();
		Video video = videoStore.checkOut(title);
		if (checkOutMap.containsKey(video.getTitle())) {
			checkOutMap.put(video.getTitle(), checkOutMap.get(video.getTitle()) + 1);

		} else {
			checkOutMap.put(video.getTitle(), 1);
		}

		System.out.println(checkOutMap);
		// Collections.max(checkOutMap.entrySet(),
		// Map.Entry.comparingByValue()).getKey();
		// Collections.max(checkOutMap.values());
		int maximumCheckOutVideo = 0;
		String checkOutVideo = "";
		{
			for (String video1 : checkOutMap.keySet()) {
				if (checkOutMap.get(video1) > maximumCheckOutVideo) {
					maximumCheckOutVideo = checkOutMap.get(video1);
					checkOutVideo = video1;
				}
			}
			System.out.println("Maximum checkout video  is  " + checkOutVideo + " count is " + maximumCheckOutVideo);

		}
	}

}