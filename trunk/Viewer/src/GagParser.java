import java.net.URL;

import it.sauronsoftware.feed4j.FeedParser;
import it.sauronsoftware.feed4j.bean.Feed;
import it.sauronsoftware.feed4j.bean.FeedHeader;
import it.sauronsoftware.feed4j.bean.FeedItem;


public class GagParser {
	
	public static void main(String[] args)  throws Exception{
		
		URL url = new URL ("http://feeds.feedburner.com/9gag?format=xml");
		
		Feed feed =  FeedParser.parse(url);
		
		
		
		System.out.println("List");
		FeedHeader list = new FeedHeader();
		System.out.println("Link:" + list.getLink());
		System.out.println("Description" + list.getDescription());
		
		System.out.println("Mems");
		int mem = feed.getItemCount();
		for (int i = 0; i < mem; i++) {
			FeedItem mem1 = feed.getItem(i);
			//System.out.println("Link: " + mem1.getLink());
			System.out.println("Link: " + mem1.getLink());
			System.out.println("Title: " + mem1.getDescriptionAsText());
		}
	}
	
	
}
