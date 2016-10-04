package Opgaver_05;

public class Car {
	
	String mærke,nummerplads,farve;
	
	public Car(String mærke, String nummerplads, String farve){
			
			this.mærke = mærke;
			this.nummerplads = nummerplads;
			this.farve = farve;	
		}
	
	@Override
	public String toString() {
		return "(" + "["+nummerplads+"]" + "," + farve + "," + mærke + ")";
	}

	public String getMærke() {
		return mærke;
	}

	public void setMærke(String mærke) {
		this.mærke = mærke;
	}

	public String getNummerplads() {
		return nummerplads;
	}

	public void setNummerplads(String nummerplads) {
		this.nummerplads = nummerplads;
	}

	public String getFarve() {
		return farve;
	}

	public void setFarve(String farve) {
		this.farve = farve;
	}
	
	public boolean equals(Car othercar){
		return (this.mærke == othercar.getMærke() && this.nummerplads == othercar.getNummerplads() && this.farve == othercar.getFarve());


	
}
		
		
	

}
