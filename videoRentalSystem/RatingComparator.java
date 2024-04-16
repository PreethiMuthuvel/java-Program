package videoRentalSystem;

import java.util.Comparator;

public class RatingComparator implements Comparator<Video> {

	public int compare(Video o1, Video o2) {
		// TODO Auto-generated method stub

		if (o1.rating == o2.rating)
			return 0;
		else if (o1.rating > o2.rating)
			return 1;
		else
			return -1;
	}

}
