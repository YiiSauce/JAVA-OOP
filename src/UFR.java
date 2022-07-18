
public class UFR {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Etudiant
		
	
		System.out.println("******** ETUDIANT********");
		System.out.println();
		Etudiant ossama =new Etudiant();
		ossama.setNom("ossama");
		ossama.setEmail("ossama@gmail.com");
		ossama.setNummerEtudiant(10);
		ossama.afficher();
		
		// LES PROFESEURS ******************************
		
		System.out.println();
		System.out.println("******** Professeur ********");
		System.out.println();
		Professeur anas=new Professeur();
		anas.setNom("Anas");
		anas.setNummerSomme(20);
		anas.setEmail("anas@gmail.com");
		anas.setGrade("B");
		anas.afficher();
		
		Professeur khalid=new Professeur();
		khalid.setNom("Khalid");
		khalid.setNummerSomme(30);
		khalid.setEmail("khalid@gmail.com");
		khalid.setGrade("A");
		khalid.afficher();
		
		Professeur marwa=new Professeur();
		marwa.setNom("Marwa");
		marwa.setNummerSomme(10);
		marwa.setEmail("marwa@gmail.com");
		marwa.setGrade("A");
		marwa.afficher();
		
		Professeur adile=new Professeur();
		adile.setNom("Adile");
		adile.setNummerSomme(10);
		adile.setEmail("adile@gmail.com");
		adile.setGrade("C");
	
		//LES MODULES ********************************
		
		System.out.println();
		System.out.println("******** Modules ********");
		System.out.println();
		
		Module analyse=new Module();
		analyse.setLibellé("analyse");
		analyse.setCoefficient(3);
		analyse.setNbrHeuresCours(15);
		analyse.setNbrHeuresTD(15);
		analyse.setNbrHeuresTP(8);
		analyse.setEnseignent(anas);
		analyse.afficher();
		
		Module info=new Module();
		info.setLibellé("informatique");
		info.setCoefficient(3);
		info.setNbrHeuresCours(25);
		info.setNbrHeuresTD(20);
		info.setNbrHeuresTP(8);
		info.setEnseignent(khalid);
		
		Module meca=new Module();
		meca.setLibellé("Mecanique");
		meca.setCoefficient(4);
		meca.setNbrHeuresCours(25);
		meca.setNbrHeuresTD(15);
		meca.setNbrHeuresTP(0);
		meca.setEnseignent(marwa);
		
		Module ang=new Module();
		ang.setLibellé("Anglais");
		ang.setCoefficient(4);
		ang.setNbrHeuresCours(25);
		ang.setNbrHeuresTD(10);
		ang.setNbrHeuresTP(0);
		ang.setEnseignent(adile);
		
		// les Semesters ********************************
		System.out.println();
		System.out.println("********Semestres********");
		System.out.println();
		
		Semestre s1=new Semestre();
		s1.setNuméro(1);
		s1.setModules(info, 0);
		s1.setModules(analyse, 1);
		s1.afficher();
		System.out.println("le semestre prend "+s1.getChargeHoraireSemestre()+" Heures");
		
		Semestre s2=new Semestre();
		s2.setNuméro(2);
		s2.setModules(meca, 0);
		s2.setModules(ang, 1);

		
		// formation *************************************
		System.out.println();
		System.out.println("******** Formation ********");
		System.out.println();
		Formation classe= new  Formation();
		classe.setIntitulé("classe");
		classe.setResponsable(anas);
		classe.setSemestres(s1, 0);
		classe.setSemestres(s2, 1);
		classe.afficher();
		System.out.println("La formation prend "+classe.getChargeHoraireFormation()+" Heures");
		
	}
	
}

