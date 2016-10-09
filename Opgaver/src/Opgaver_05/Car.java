package Opgaver_05;

public class Car {
	
    String nummerplade,farve,mærke;


    public Car(String nummerplade, String farve, String mærke){

        this.nummerplade = nummerplade;
        this.farve = farve;
        this.mærke = mærke;
    }

    @Override
    public String toString(){
        return ("["+nummerplade+"]"+ farve + mærke);
    }

    public String getNummerplade() {
        return nummerplade;
    }

    public void setNPmmerplade(String nummerplade) {
        this.nummerplade = nummerplade;
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public boolean equals(Car otherCar){
        return (this.nummerplade.equalsIgnoreCase(getNummerplade()));
    }

    public boolean alike(Car otherCar){
        if (this.farve.equals(otherCar.getFarve()) || this.mærke.equals(otherCar.getMærke())){
            return true;
        }else{
            return false;
        }
    }

}
