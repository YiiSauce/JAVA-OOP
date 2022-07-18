import java.util.Arrays;

public class Semestre {
	 private int num�ro = 0;
	 private Module [] modules = new Module[6];
	 
	public Semestre(int num�ro, Module[] modules) {
		super();
		this.num�ro = num�ro;
	}

	public Semestre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNum�ro() {
		return num�ro;
	}

	public void setNum�ro(int num�ro) {
		this.num�ro = num�ro;
	}

	public Module getModules(int i) {
		return modules[i];
	}

	public void setModules(Module module, int i) {
		this.modules[i] = module;
	}

	@Override
	public String toString() {
		return "Semestre [num�ro = " + num�ro +
		 " modules : \n" + Arrays.toString(modules) + "]";
	}
	public void afficher() {
		//System.out.println("-------------------------Infos : ----------------------------");
		System.out.println(this.toString());
//		for(int i=0; i<modules.length; i++) {
//			System.out.println("Module N� : "+(i+1));
//			modules[i].afficher();
//		}
	}
		public double getChargeHoraireSemestre() {
			double CH=0;
			for(int i=0; i<modules.length; i++) {
				CH += this.modules[i].getChargeHoraireModule();
			}
			return CH;
		}
	}
	
