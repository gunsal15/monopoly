package domain.model;

import java.util.HashMap;

public class DeedFactiory {
	private static DeedFactiory deedFactory;
	
	private DeedFactiory() {
		
	}
	
	public static synchronized DeedFactiory getInstance() {
		if(deedFactory == null) {
			deedFactory = new DeedFactiory();
		}
		return deedFactory;
	}
	
	public Deed createDeed(String name) {
		
		if (name.equals("Mediterranean")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",2);
				put("oneHouse", 10);
				put("twoHouse", 30);
				put("threeHouse", 90);
				put("fourHouse", 160);
				put("hotel", 250);
				put("sky", 750);
				put("mortgage", 30);
				put("housePrice", 50);
				put("hotelPrice", get("housePrice")*4+50);
				put("skyPrice", get("hotelPrice")+50);
			}});
		}else if (name.equals("Baltic")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",4);
				put("oneHouse", 20);
				put("twoHouse", 60);
				put("threeHouse", 180);
				put("fourHouse", 320);
				put("hotel", 450);
				put("sky", 900);
				put("mortgage", 30);
				put("housePrice", 50);
				put("hotelPrice", get("housePrice")*4+50);
				put("skyPrice", get("hotelPrice")+50);
			}});
		}else if (name.equals("Oriental")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",6);
				put("oneHouse", 30);
				put("twoHouse", 90);
				put("threeHouse", 270);
				put("fourHouse", 400);
				put("hotel", 550);
				put("sky", 1050);
				put("mortgage", 50);
				put("housePrice", 50);
				put("hotelPrice", get("housePrice")*4+50);
				put("skyPrice", get("hotelPrice")+50);
			}});
		}else if (name.equals("Vermont")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",6);
				put("oneHouse", 30);
				put("twoHouse", 90);
				put("threeHouse", 270);
				put("fourHouse", 400);
				put("hotel", 550);
				put("sky", 1050);
				put("mortgage", 50);
				put("housePrice", 50);
				put("hotelPrice", get("housePrice")*4+50);
				put("skyPrice", get("hotelPrice")+50);
			}});
		}else if (name.equals("Connecticut")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",8);
				put("oneHouse", 40);
				put("twoHouse", 100);
				put("threeHouse", 300);
				put("fourHouse", 450);
				put("hotel", 600);
				put("sky", 1100);
				put("mortgage", 60);
				put("housePrice", 50);
				put("hotelPrice", get("housePrice")*4+50);
				put("skyPrice", get("hotelPrice")+50);
			}});
		}else if (name.equals("StCharles")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",10);
				put("oneHouse", 50);
				put("twoHouse", 150);
				put("threeHouse", 450);
				put("fourHouse", 625);
				put("hotel", 750);
				put("sky", 1250);
				put("mortgage", 70);
				put("housePrice", 100);
				put("hotelPrice", get("housePrice")*4+100);
				put("skyPrice", get("hotelPrice")+100);
			}});
		}else if (name.equals("States")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",10);
				put("oneHouse", 50);
				put("twoHouse", 150);
				put("threeHouse", 450);
				put("fourHouse", 625);
				put("hotel", 750);
				put("sky", 1250);
				put("mortgage", 70);
				put("housePrice", 100);
				put("hotelPrice", get("housePrice")*4+100);
				put("skyPrice", get("hotelPrice")+100);
			}});
		}else if (name.equals("Virginia")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",12);
				put("oneHouse", 60);
				put("twoHouse", 180);
				put("threeHouse", 500);
				put("fourHouse", 700);
				put("hotel", 900);
				put("sky", 1400);
				put("mortgage", 80);
				put("housePrice", 100);
				put("hotelPrice", get("housePrice")*4+100);
				put("skyPrice", get("hotelPrice")+100);
			}});
		}else if (name.equals("StJames")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",14);
				put("oneHouse", 70);
				put("twoHouse", 200);
				put("threeHouse", 550);
				put("fourHouse", 750);
				put("hotel", 950);
				put("sky", 1450);
				put("mortgage", 90);
				put("housePrice", 100);
				put("hotelPrice", get("housePrice")*4+100);
				put("skyPrice", get("hotelPrice")+100);
			}});
		}else if (name.equals("Tennessee")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",14);
				put("oneHouse", 70);
				put("twoHouse", 200);
				put("threeHouse", 550);
				put("fourHouse", 750);
				put("hotel", 950);
				put("sky", 1450);
				put("mortgage", 90);
				put("housePrice", 100);
				put("hotelPrice", get("housePrice")*4+100);
				put("skyPrice", get("hotelPrice")+100);
			}});
		}else if (name.equals("NewYork")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",16);
				put("oneHouse", 80);
				put("twoHouse", 220);
				put("threeHouse", 600);
				put("fourHouse", 800);
				put("hotel", 1000);
				put("sky", 1500);
				put("mortgage", 100);
				put("housePrice", 100);
				put("hotelPrice", get("housePrice")*4+100);
				put("skyPrice", get("hotelPrice")+100);
			}});
		}else if (name.equals("Kentucky")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",18);
				put("oneHouse", 90);
				put("twoHouse", 250);
				put("threeHouse", 700);
				put("fourHouse", 875);
				put("hotel", 1050);
				put("sky", 2050);
				put("mortgage", 100);
				put("housePrice", 150);
				put("hotelPrice", get("housePrice")*4+150);
				put("skyPrice", get("hotelPrice")+150);
			}});
		}else if (name.equals("Indiana")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",18);
				put("oneHouse", 90);
				put("twoHouse", 250);
				put("threeHouse", 700);
				put("fourHouse", 875);
				put("hotel", 1050);
				put("sky", 2050);
				put("mortgage", 100);
				put("housePrice", 150);
				put("hotelPrice", get("housePrice")*4+150);
				put("skyPrice", get("hotelPrice")+150);
			}});
		}else if (name.equals("Illinois")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",20);
				put("oneHouse", 100);
				put("twoHouse", 300);
				put("threeHouse", 750);
				put("fourHouse", 925);
				put("hotel", 1100);
				put("sky", 2100);
				put("mortgage", 120);
				put("housePrice", 150);
				put("hotelPrice", get("housePrice")*4+150);
				put("skyPrice", get("hotelPrice")+150);
			}});
		}else if (name.equals("Atlantic")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",22);
				put("oneHouse", 110);
				put("twoHouse", 330);
				put("threeHouse", 800);
				put("fourHouse", 975);
				put("hotel", 1150);
				put("sky", 2150);
				put("mortgage", 130);
				put("housePrice", 150);
				put("hotelPrice", get("housePrice")*4+150);
				put("skyPrice", get("hotelPrice")+150);
			}});
		}else if (name.equals("Ventnor")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",22);
				put("oneHouse", 110);
				put("twoHouse", 330);
				put("threeHouse", 800);
				put("fourHouse", 975);
				put("hotel", 1150);
				put("sky", 2150);
				put("mortgage", 130);
				put("housePrice", 150);
				put("hotelPrice", get("housePrice")*4+150);
				put("skyPrice", get("hotelPrice")+150);
			}});
		}else if (name.equals("Marvin")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",24);
				put("oneHouse", 120);
				put("twoHouse", 350);
				put("threeHouse", 850);
				put("fourHouse", 1025);
				put("hotel", 1200);
				put("sky", 2200);
				put("mortgage", 140);
				put("housePrice", 150);
				put("hotelPrice", get("housePrice")*4+150);
				put("skyPrice", get("hotelPrice")+150);
			}});
		}else if (name.equals("Pacific")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",26);
				put("oneHouse", 130);
				put("twoHouse", 390);
				put("threeHouse", 900);
				put("fourHouse", 1100);
				put("hotel", 1275);
				put("sky", 2275);
				put("mortgage", 150);
				put("housePrice", 200);
				put("hotelPrice", get("housePrice")*4+200);
				put("skyPrice", get("hotelPrice")+200);
			}});
		}else if (name.equals("NoCarolina")) {
			return new Deed("Street", new HashMap<String, Integer>(){{
				put("rent",26);
				put("oneHouse", 130);
				put("twoHouse", 390);
				put("threeHouse", 900);
				put("fourHouse", 1100);
				put("hotel", 1275);
				put("sky", 2275);
				put("mortgage", 150);
				put("housePrice", 200);
				put("hotelPrice", get("housePrice")*4+200);
				put("skyPrice", get("hotelPrice")+200);
			}});
		}
		
		
		else return null;
		
	}
	
}
