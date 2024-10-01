package personelkayit;

public class Personel {
	 int personelNo;
	    String isim;
	    double brutMaas;
	    double kesinti;
	    double netMaas;

	 
	    
	    public void maasHesapla() {
	        netMaas = brutMaas - kesinti;
	    }
	    @Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return "Personel No: " + personelNo + ", Ad: " + isim + ", Net Maaş: " + netMaas;
	    }
	    
}