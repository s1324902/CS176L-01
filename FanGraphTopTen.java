import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FanGraphTopTen {

	public static void main(String[] args) throws IOException {
		String stats2021 = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0";
		Document doc =Jsoup.connect(stats2021
				).timeout(6000).get();
		
		Elements body = doc.select("tbody");	
		//for (Element e : body.select("tr")) {
			//String name = e.select("td.grid_line_regular").text();
			//System.out.println(name);
			
			
			for (Element e : body.select("td.grid_line_regular")) {
			String name = e.select("a").text();
			if(name!= "" && name.length()>3)System.out.println(name);
		}

	}

	
}
