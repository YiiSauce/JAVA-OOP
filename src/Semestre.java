import java.util.Arrays;

public class Semestre {
	 private int numéro = 0;
	 private Module [] modules = new Module[6];
	 
	public Semestre(int numéro, Module[] modules) {
		super();
		this.numéro = numéro;
	}

	public Semestre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNuméro() {
		return numéro;
	}

	public void setNuméro(int numéro) {
		this.numéro = numéro;
	}

	public Module getModules(int i) {
		return modules[i];
	}

	public void setModules(Module module, int i) {
		this.modules[i] = module;
	}

	@Override
	public String toString() {
		return "Semestre [numéro = " + numéro +
		 " modules : \n" + Arrays.toString(modules) + "]";
	}
	public void afficher() {
		//System.out.println("-------------------------Infos : ----------------------------");
		System.out.println(this.toString());
//		for(int i=0; i<modules.length; i++) {
//			System.out.println("Module N° : "+(i+1));
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
	
