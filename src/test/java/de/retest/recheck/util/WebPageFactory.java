package de.retest.recheck.util;

import java.util.stream.Stream;

public class WebPageFactory {

	public static Stream<String> getLinks() {
		return Stream.of( //
				"https://retest.de", // 
				"https://retest.de/devtesters", //
				"https://retest.de/managers", //
				"https://retest.de/product-overview", //
				"https://retest.de/recheck-web-chrome-extension", //
				"https://retest.de/recheck-open-source", //
				"https://retest.de/rehub", //
				"https://retest.de/review", //
				"https://retest.de/request-demo", //
				"https://retest.de/faqs", //
				"https://retest.de/about-us", // 
				"https://retest.de/team", //
				"https://retest.de/jobs", //
				"https://retest.de/news", //
				"https://retest.de/contact-us", //
				"https://assets.retest.org/releases/review.html", //
				"https://retest.de/feature-unbreakable-selenium", //
				"http://garkbit.prod.cloud.retest.org/dashboard" //
		);
	}
}
