
public class Module extends UniteEnseignement {
	private String libell�;
	private Integer coefficient;
	private Integer nbrHeuresCours;
	private Integer nbrHeuresTD;
	private Integer nbrHeuresTP;
	private Professeur enseignent;
	public Module(String libell�, Integer coefficient, Integer nbrHeuresCours, Integer nbrHeuresTD, Integer nbrHeuresTP,
			Professeur enseignent) {
		super();
		this.libell� = libell�;
		this.coefficient = coefficient;
		this.nbrHeuresCours = nbrHeuresCours;
		this.nbrHeuresTD = nbrHeuresTD;
		this.nbrHeuresTP = nbrHeuresTP;
		this.enseignent = enseignent;
	}
	public Module() {
		super();
	}
	public String getLibell�() {
		return libell�;
	}
	public void setLibell�(String libell�) {
		this.libell� = libell�;
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
		return "Module [libell�=" + libell� + ", coefficient=" + coefficient + ", nbrHeuresCours=" + nbrHeuresCours
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
	
