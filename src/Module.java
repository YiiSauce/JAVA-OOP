
public class Module extends UniteEnseignement {
	private String libellé;
	private Integer coefficient;
	private Integer nbrHeuresCours;
	private Integer nbrHeuresTD;
	private Integer nbrHeuresTP;
	private Professeur enseignent;
	public Module(String libellé, Integer coefficient, Integer nbrHeuresCours, Integer nbrHeuresTD, Integer nbrHeuresTP,
			Professeur enseignent) {
		super();
		this.libellé = libellé;
		this.coefficient = coefficient;
		this.nbrHeuresCours = nbrHeuresCours;
		this.nbrHeuresTD = nbrHeuresTD;
		this.nbrHeuresTP = nbrHeuresTP;
		this.enseignent = enseignent;
	}
	public Module() {
		super();
	}
	public String getLibellé() {
		return libellé;
	}
	public void setLibellé(String libellé) {
		this.libellé = libellé;
	}
	public Integer getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}
	public Integer getNbrHeuresCours() {
		return nbrHeuresCours;
	}
	public void setNbrHeuresCours(Integer nbrHeuresCours) {
		this.nbrHeuresCours = nbrHeuresCours;
	}
	public Integer getNbrHeuresTD() {
		return nbrHeuresTD;
	}
	public void setNbrHeuresTD(Integer nbrHeuresTD) {
		this.nbrHeuresTD = nbrHeuresTD;
	}
	public Integer getNbrHeuresTP() {
		return nbrHeuresTP;
	}
	public void setNbrHeuresTP(Integer nbrHeuresTP) {
		this.nbrHeuresTP = nbrHeuresTP;
	}
	public Professeur getEnseignent() {
		return enseignent;
	}
	public void setEnseignent(Professeur enseignent) {
		this.enseignent = enseignent;
	}
	@Override
	public String toString() {
		return "Module [libellé=" + libellé + ", coefficient=" + coefficient + ", nbrHeuresCours=" + nbrHeuresCours
				+ ", nbrHeuresTD=" + nbrHeuresTD + ", nbrHeuresTP=" + nbrHeuresTP + ", Avec "+this.enseignent.toString() +"]";
	}
	public void afficher() {
		//System.out.println("-------------------------Infos : ----------------------------");
		System.out.println(this.toString());
	}
	double getChargeHoraireModule() {
		return this.nbrHeuresCours*1.5+this.nbrHeuresTD+this.nbrHeuresTP*0.75;
	}
	}
	
