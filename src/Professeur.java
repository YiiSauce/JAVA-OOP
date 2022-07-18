import java.util.ArrayList;
import java.util.HashMap;

public class Professeur extends Personne implements Enseignent{
	private Integer nummerSomme; 
	private String grade;
	HashMap<String, ArrayList<Module>> chargeHoraire = new HashMap<String,ArrayList<Module>>();
	
	public Professeur(String nom, Integer nummerSomme, String email, String grade) {
		super(nom, email);
		this.nummerSomme = nummerSomme;
		this.grade = grade;
	}
	public Professeur() {
		super();
	}
	
	public Integer getNummerSomme() {
		return nummerSomme;
	}
	public void setNummerSomme(Integer nummerSomme) {
		this.nummerSomme = nummerSomme;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Professeur [nom=" + this.getNom() + ", nummerSomme=" + nummerSomme + ", email=" + this.getEmail() + ", grade=" + grade + "]";
	}
	public void afficher() {
		//System.out.println("-------------------------Infos : ----------------------------");
		System.out.println(this.toString());
	}
	
	@Override
	public double getChargeHoraire() {
		double CH=0;
		for(ArrayList<Module> i: chargeHoraire.values()){
			for(int j=0; j<i.size(); j++)
			CH += i.get(j).getChargeHoraireModule();
		}
		return CH;
	}

	@Override
	public double getVacations() {
		double sarf = 0;
		for(String i:this.chargeHoraire.keySet()) {
			sarf += this.getVacationAnuelle(i);
		}
		return sarf;
	}
	
	public ArrayList<Module> getChargeAnnuelle(String Date){
		return this.chargeHoraire.get(Date);
	}
	
	public double getChargeHoraireAnuelle(String Date) {
		double CH = 0;
		for(Module i:this.chargeHoraire.get(Date)) {
			CH += i.getChargeHoraireModule();
		}
		return CH;
	}
	
	public double getVacationAnuelle(String Date) {
		double charge =this.getChargeHoraireAnuelle(Date);
		double chMin = 0;
		if(this.grade == "PA")
			chMin = 320;
		else if(this.grade == "PH")
			chMin = 300;
		else if(this.grade == "PES")
			chMin = 280;
		double chSup = Math.max(charge-chMin, 0);
		double chNrml = Math.min(charge, chMin);
		return (chNrml*400*0.66 + chSup*600*0.83)+5000;
	}
	
	public boolean addChargeHoraire(String Date,ArrayList<Module> modules) {
		if(!this.chargeHoraire.containsKey(Date)) {
			this.chargeHoraire.put(Date, modules);
			return true;
		}
		return false;
	}
	public boolean updateChargeHoraire(String date, ArrayList<Module> modules){
		if(this.chargeHoraire.containsKey(date)) {
			this.chargeHoraire.replace(date, modules);
			return true;
		}
		return false;
	}
	
	
	
			 
}
