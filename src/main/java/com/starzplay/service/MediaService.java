package com.starzplay.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import com.starzplay.model.*;

@Component
public class MediaService {

	private static List<Entries> entries = new ArrayList<>();
	static {
		Media media1 = new Media("http://data.media.theplatform.eu/media/data/Media/62819397370",
				"Oz : The Great And Powerful", "OZTHEGREATANDPOWERFULY2013MFR",
				"http://access.auth.theplatform.com/data/Account/2460380049", 14263776, 15684192, "available");

		List<Media> medias1 = new ArrayList<>(Arrays.asList(media1));

		Entries entry1 = new Entries(
				"http://data.entertainment.tv.theplatform.eu/entertainment/data/ProgramAvailability/42759720403",
				"OZTHEGREATANDPOWERFULY2013MFR", 1477996265, "Oz : The Great And Powerful", "", "", medias1);
		entries.add(entry1);

		Media media2 = new Media("http://data.media.theplatform.eu/media/data/Media/18586693474",
				"Vualto: An Unexpected DRM Journey. Extra type", "VUALTOTESTEXTRA",
				"http://access.auth.theplatform.com/data/Account/2460380049", 1421712, 15513984, "available");

		List<Media> medias2 = new ArrayList<>(Arrays.asList(media2));

		Entries entry2 = new Entries(
				"http://data.entertainment.tv.theplatform.eu/entertainment/data/ProgramAvailability/29216808163",
				"VUALTOTESTEXTRA", 1462869966, "Vualto: An Unexpected DRM Journey. Extra type", "", "Uncensored",
				medias2);

		entries.add(entry2);

		Media media3 = new Media("http://data.media.theplatform.eu/media/data/Media/9029701328",
				"How to Train Your Dragon", "HOWTOTRAINYOURDRAGONY2010M",
				"http://access.auth.theplatform.com/data/Account/2460380049", 1390176, 1551312, "available");

		List<Media> medias3 = new ArrayList<>(Arrays.asList(media3));

		Entries entry3 = new Entries(
				"http://data.entertainment.tv.theplatform.eu/entertainment/data/ProgramAvailability/24706088272",
				"HOWTOTRAINYOURDRAGONY2010M", 1462869773, "How to Train Your Dragon", "", "Uncensored", medias3);

		entries.add(entry3);

		Media media4 = new Media("http://data.media.theplatform.eu/media/data/Media/31472709186", "Think Like A Man",
				"THINKLIKEAMANY2012M", "http://access.auth.theplatform.com/data/Account/2460380049", 14568084, 15525216,
				"available");

		Media media5 = new Media("http://data.media.theplatform.eu/media/data/Media/31476805410", "Think Like A Man",
				"THINKLIKEAMANY2012MC", "http://access.auth.theplatform.com/data/Account/2460380049", 14568084,
				15525216, "available");

		List<Media> medias4 = new ArrayList<>(Arrays.asList(media4, media5));

		Entries entry4 = new Entries(
				"http://data.entertainment.tv.theplatform.eu/entertainment/data/ProgramAvailability/33829928299",
				"THINKLIKEAMANY2012M", 1464181466, "Think Like A Man", "", "Censored", medias4);

		entries.add(entry4);
	}

	public String retrieveMedia(String filter, String level) {

		return "Filter used is" + filter + "level is" + level;
	}

	public List<Entries> retrieveEntries() {

		return entries;
	}

	public List<Entries> retrieveEntries(String filter, String level) {
		//System.out.println("Filter is Inside service"+filter);
		//System.out.println("Level is Inside service"+level);
		for (Entries f : entries) {
			//System.out.println(f);
			
			for (Media m : f.getMedia()) {
				Character final_character=m.getGuid().charAt(m.getGuid().length() - 1);
				System.out.println(final_character+":"+f.getPeg$contentClassification()+":"+level); 
				if (f.getPeg$contentClassification().equals("Censored") && level.equals("censored")){
					
					if (final_character.equals("C")) 
					{
						System.out.println("censored media");
					}
					else{
						System.out.println("Removed media"+m);
						entries.remove(m);
						
					}
				
					
				}
				else if (f.getPeg$contentClassification().equals("Uncensored") && level.equals("censored")){
					if (final_character.equals("C")) 
					{
						System.out.println("Removed media"+m);
						entries.remove(m);
					}
					else{
						
						System.out.println("Uncensored media");
					}
				}
				else{
					//System.out.println("No censorship entry Entry:");
					//System.out.println(f);
				}
			}
		}

		return entries;
	}

}
