
public class UniteEnseignement {
	private  Module module;
	private String ann�e;
	private Double note;
	private Semestre semestre;
	
	public UniteEnseignement(Module module, String ann�e, Double note, Semestre sem) {
		super();
		this.module = module;
		this.ann�e = ann�e;
		this.note = note;
		this.semestre = sem;
	}
	
	public UniteEnseignement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	
	public String getAnn�e() {
		return ann�e;
	}
	public void setAnn�e(String ann�e) {
		this.ann�e = ann�e;
	}
	
	public Double getNote() {
		return note;
	}
	public void setNote(Double note) {
		this.note = note;
	}
	
	
	
	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	public boolean isValide() {
		if(this.getSemestre().getNum�ro()<=4)
			return (this.getNote()>=10);
		else
			return(this.getNote()>=12);
	}
	
}
