package Opgaver_05;

public class Car {
	
    String nummerplade,farve,m�rke;


    public Car(String nummerplade, String farve, String m�rke){

        this.nummerplade = nummerplade;
        this.farve = farve;
        this.m�rke = m�rke;
    }

    @Override
    public String toString(){
        return ("["+nummerplade+"]"+ farve + m�rke);
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

    public String getM�rke() {
        return m�rke;
    }

    public void setM�rke(String m�rke) {
        this.m�rke = m�rke;
    }

    public boolean equals(Car otherCar){
        return (this.nummerplade.equalsIgnoreCase(getNummerplade()));
    }

    public boolean alike(Car otherCar){
        if (this.farve.equals(otherCar.getFarve()) || this.m�rke.equals(otherCar.getM�rke())){
            return true;
        }else{
            return false;
        }
    }

}
