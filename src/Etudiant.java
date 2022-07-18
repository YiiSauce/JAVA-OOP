import java.util.ArrayList;

public class Etudiant extends Personne {
	private Integer nummerEtudiant;
	ArrayList<Module> modules = new ArrayList<Module>();
	
	public Etudiant(String nom, Integer nummerEtudiant, String email) {
		super(nom, email);
		this.nummerEtudiant = nummerEtudiant;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getNummerEtudiant() {
		return nummerEtudiant;
	}
	public void setNummerEtudiant(Integer nummerEtudiant) {
		this.nummerEtudiant = nummerEtudiant;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + this.getNom() + ", nummerEtudiant=" + nummerEtudiant + ", email=" + this.getEmail() + "]";
	}
	public void afficher() {
		//System.out.println("-------------------------Infos : ----------------------------");
		System.out.println(this.toString());
	}
	public boolean addModule(Module module) {
		if (modules.isEmpty()) {
			modules.add(module);
			return true;
		}
		for(int i =0 ;i<modules.size();i++) {
			if(!modules.get(i).isValide()) {
				return false;
				}
		}
		modules.add(module);
		return true;
	}


}
