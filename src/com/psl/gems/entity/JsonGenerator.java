package com.psl.gems.entity;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.psl.gems.model.Card;

public class JsonGenerator {  

	public static void generateJson(ArrayList<Card> cards) {
		try {
			FileWriter fWriter = new FileWriter("pages/pack-of-cards.json");
			StringBuilder sb = new StringBuilder("[");
	        for (int i = 0; i < cards.size(); i++) {
	            Card card = cards.get(i);
	            sb.append("{\"suit\":\"").append(card.getSuit()).append("\",\"rank\":\"").append(card.getRank()).append("\"}");
	            if (i != cards.size() - 1) {
	                sb.append(",");
	            }
	        }
	        sb.append("]");
	        fWriter.write(sb.toString());
	        fWriter.close();
	        
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 
	        
	}

}
