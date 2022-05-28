package com.example.demo.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomNamesUtil {
	
	private static int getRandom() {
		Random random = new Random();
		int n = random.nextInt(20);
		return n;
	}

	public static Map<String, String> getRNames() {
		int n = getRandom();
		String names[] = {"Jeevan","Veena","Sonika","Bhawna","Deepak","Monika","Deepali","Deepa", "Vaishali", "Sita", "Geeta", "Rohan", "Sohan", "Kahana","Ram", "Lakshaman", "Janki", "Jai", "Bolo", "Hanuman", "Ki", "JaiShreeMahakl"};
		String imsis[] = {"4636434","35435234","43657587","6251355","65756734","536243","5462436","5252514","858562","97871415","78761644","13459854","6713643","6238148","21357845","6123413","1357854","1345874","9758471","8784357","87134543","32154545"};
		List<String> listNames = Arrays.asList(names);
		List<String> listImsi = Arrays.asList(imsis);
		Map<String, String> nameImsi = new HashMap<>();
		nameImsi.put(listNames.get(n), listImsi.get(n));
		return nameImsi;
	}
	
	
	public static int getRNumbers() {
		Random random = new Random();
		//int number = random.nextInt(100, 1000000);
		int number = random.nextInt(1000000)+100;
		return number;
	}

}
