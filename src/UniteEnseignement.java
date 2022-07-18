
public class UniteEnseignement {
	private  Module module;
	private String année;
	private Double note;
	private Semestre semestre;
	
	public UniteEnseignement(Module module, String année, Double note, Semestre sem) {
		super();
		this.module = module;
		this.année = année;
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
	
	public String getAnnée() {
		return année;
	}
	public void setAnnée(String année) {
		this.année = année;
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
		if(this.getSemestre().getNuméro()<=4)
			return (this.getNote()>=10);
		else
			return(this.getNote()>=12);
	}
	
}
