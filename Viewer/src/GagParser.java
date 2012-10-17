import java.net.URL;

import it.sauronsoftware.feed4j.FeedParser;
import it.sauronsoftware.feed4j.bean.Feed;
import it.sauronsoftware.feed4j.bean.FeedHeader;
import it.sauronsoftware.feed4j.bean.RawElement;

import it.sauronsoftware.feed4j.bean.FeedItem;



public class GagParser {
	
	public static void main(String[] args)  throws Exception{
		
		URL url = new URL ("http://feeds.feedburner.com/9gag?format=xml");
		
		Feed feed =  FeedParser.parse(url);
		
		System.out.println("MemsName");
		int nm = feed.getItemCount();
		for (int i = 0; i < nm; i++) {
			FeedItem nm1 = feed.getItem(i);
			//System.out.println("Link: " + mem1.getLink());
			System.out.println("Title: " + nm1.getDescriptionAsText());
			//System.out.println("Link: " + mem1.getAttributeValue("http://feeds.feedburner.com/9gag?format=xml", "src"));
		}
		
		System.out.println("MemsLink");
		int lnk = feed.getItemCount();
		for (int j=0; j < lnk; j++) {
			RawElement lnk1 = feed.getHeader();
			System.out.println("Link: " + lnk1.getElementValue("http://feeds.feedburner.com/9gag?format=xml", "src"));
			//
			
		
		}	
	}	
}
