package CoreApi;

import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;

public class Instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var z=ZonedDateTime.now();
		System.out.println(z.toInstant());
		var now = Instant.now();
		// do something time consuming
		var later = Instant.now();
		var duration = Duration.between(now, later);
		System.out.println(duration.toNanos());
		System.out.println(now);
		System.out.println(later);


	}

}
