import java.util.ArrayList;
import java.util.HashMap;

public class Doctorant extends Etudiant implements Enseignent {
	private String SujetThese;
	private Professeur[] encadrant = new Professeur[2];
//	private Module[] cours = new Module[2];
	HashMap<String, ArrayList<Module>> chargeHoraire = new HashMap<String,ArrayList<Module>>();
	private String DateInscription;
	

	public Doctorant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctorant(String nom, Integer nummerEtudiant, String email) {
		super(nom, nummerEtudiant, email);
		// TODO Auto-generated constructor stub
	}


	public Doctorant(String nom, Integer nummerEtudiant, String email, String sujetThese) {
		super(nom, nummerEtudiant, email);
		this.SujetThese = sujetThese;
	}
	
	
	public String getDateInscription() {
		return DateInscription;
	}

	public void setDateInscription(String dateInscription) {
		DateInscription = dateInscription;
	}

	public String getSujetThese() {
		return SujetThese;
	}

	public void setSujetThese(String sujetThese) {
		SujetThese = sujetThese;
	}

	public Professeur getEncadrant(int i) {
		return encadrant[i];
	}

	public void setEncadrant(Professeur encadrant, int i) {
		this.encadrant[i] = encadrant;
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
		double charge =this.getChargeHoraire();
		double chSup = Math.max(charge-32, 0);
		double chNrml = Math.min(charge, 32);
		
		return (chNrml*400*0.66 + chSup*600*0.83);
	}
	
	public boolean addChargeHoraire(String Date,ArrayList<Module> modules) {
		if(!this.chargeHoraire.containsKey(Date) && 
				Date.compareTo(this.getDateInscription())>=0 && modules.size()<=2) {
			this.chargeHoraire.put(Date, modules);
			return true;
		}
		return false;
	}
	public boolean updateChargeHoraire(String date, ArrayList<Module> modules){
		if(this.chargeHoraire.containsKey(date) && 
				date.compareTo(this.getDateInscription())>=0 && modules.size()<=2) {
			this.chargeHoraire.replace(date, modules);
			return true;
		}
		return false;
	}
	

}
