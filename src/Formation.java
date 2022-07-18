import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Formation {
	private String intitulé;
	private Professeur responsable;
	Set<Etudiant> etudiants = new HashSet<Etudiant>();
	private Semestre[] semestres = new Semestre[9];
	
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Formation(String intitulé, Professeur responsable) {
		super();
		this.intitulé = intitulé;
		this.responsable = responsable;
	}
	public String getIntitulé() {
		return intitulé;
	}
	public void setIntitulé(String intitulé) {
		this.intitulé = intitulé;
	}
	public Professeur getResponsable() {
		return responsable;
	}
	public void setResponsable(Professeur responsable) {
		this.responsable = responsable;
	}
	public Semestre getSemestres(int i) {
		return semestres[i];
	}
	public void setSemestres(Semestre semestre, int i) {
		this.semestres[i] = semestre;
	}
	@Override
	public String toString() {
		return "Formation [intitulé=" + intitulé + ", responsable=" + responsable + "/n, semestres="
				+ Arrays.toString(semestres) + "]";
	}
	public void afficher() {
		System.out.println(this.toString());
	}
	public double getChargeHoraireFormation() {
		double CH=0;
		for(Semestre i: semestres) {
			CH += i.getChargeHoraireSemestre();
		}
		return CH;
	}
	public boolean addEtudiant ( Etudiant etudiant) {
		return this.etudiants.add(etudiant);
	}
	public boolean removeEtudiant ( Etudiant etudiant) {
		return this.etudiants.remove(etudiant);
	}
	public Etudiant getEtudiant(String numeroEtudiant) {
		Etudiant e = new Etudiant();
		Integer num = Integer.parseInt(numeroEtudiant);
		e.setNummerEtudiant(num);
		if(this.etudiants.contains(e))
			return e;
		return null;
	}
	
	public void afficherEtudiantParOrder() {
		ArrayList<Etudiant> list = new ArrayList<Etudiant>(this.etudiants);
		list.sort(Comparator.comparing(Etudiant::getNummerEtudiant));
		for(int i=0; i<list.size(); i++) {
			list.get(i).afficher();
		}
	}
	
	public void afficherEtudiantParOrdreAlpha() {
		ArrayList<Etudiant> list = new ArrayList<Etudiant>(this.etudiants);
		list.sort(Comparator.comparing(Etudiant::getNom));
	}
	
	public void afficheEtudiant(String numeroEtudiant) {
		this.getEtudiant(numeroEtudiant).afficher();
	}
	
}
