import java.awt.Point;


public class Terrain {
	
	private final static int LIGNES = 5;
	private final static int COLONNES = 9;
	private Case tableau[][] = new Case[5][9];
	
	public Terrain() 
	{	
		for(int ligne = 0 ; ligne < Terrain.LIGNES; ligne++)
			for(int colonne = 0 ; colonne < Terrain.COLONNES; colonne++) {
				if(ligne == 0 || ligne == 1) 
					this.tableau[ligne][colonne] = new Case(new Point(ligne,colonne), Case.Etat.joueur1);
				else if(ligne == 3 || ligne == 4)
					this.tableau[ligne][colonne] = new Case(new Point(ligne,colonne), Case.Etat.joueur2);
				else {
					if(colonne == 0 || colonne == 2 || colonne == 5 || colonne == 7)
						this.tableau[ligne][colonne] = new Case(new Point(ligne,colonne), Case.Etat.joueur1);
					else if(colonne == 1 || colonne == 3 || colonne == 6 || colonne == 8)
						this.tableau[ligne][colonne] = new Case(new Point(ligne,colonne), Case.Etat.joueur2);
					else
						this.tableau[ligne][colonne] = new Case(new Point(ligne,colonne), Case.Etat.vide);
				}
			}
			
		System.out.println("ok");
	}

	public Case[][] getTableau() {
		return tableau;
	}

	public void setTableau(Case tableau[][]) {
		this.tableau = tableau;
	}
	
}
