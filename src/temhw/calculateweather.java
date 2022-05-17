package temhw;

public class calculateweather {
	public void calculation(){
	userInput sb = new userInput();
	
	String object = "WATER";
	String object1 = "OXYZEN";
	String object2 = "ETHYL";
	double tem = sb.temp();
	
	weather cw = new weather();
	
	if(object.equals("WATER")) {
	if (object.equals("WATER")&& tem >=212) {
		
		cw.iswaterboiling();
		
	}else if(object.equals("WATER")&& tem <=32) {
		
		cw.iswaterfreezin();
		
	} else {
	
		cw.iswaternormal();
	}
}
	
	if (object1.equals("OXYZEN")) {
		if (object1.equals("OXYZEN")&& tem >=-306) {
			
			cw.isoxyzenboiling();
			
		}else if(object1.equals("OXYZEN")&& tem <=-362) {
			cw.isoxyzenfreezin();
			
		} else {
			cw.isoxyzennormal();
		}
		
	}

	if (object2.equals("ETHYL")) {
		if (object2.equals("ETHYL")&& tem >=172) {
			cw.isethyboiling();
			
		}else if(object2.equals("ETHYL")&& tem <=-172) {
			cw.isethyfreezin();
			
		} else {
			cw.isethynormal();
		}

}
	
}
}



