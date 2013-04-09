public class TestListeSimple{

	private static ListeSimple l1, l2;

	public static void setUp()
	{
		l1 = new ListeSimple();
		int t[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		l2 = new ListeSimple(t);
	}

	public static void main(String args[])
	{
		// Test1: vérifier qu'une nouvelle liste est vide
		setUp();
		System.out.println(l1.estVide() == true);

		// Test2: Lorsqu'on ajoute un élément au début d'une liste vide
		// la liste est de longueur 1
		setUp();
		l1.ajouterDebut(1);
		System.out.println(l1.longueur() == 1);

		// Test3: Lorsqu'on ajoute un élément au début d'une liste avec un élément,
		// la liste est de longueur 2
		setUp();
		l1.ajouterDebut(1);
		l1.ajouterDebut(2);
		System.out.println(l1.longueur() == 2 );

		// Test4: Lorsqu'on ajoute l'élément 1 en début de liste, le premier noeud est 1
		setUp();
		l1.ajouterDebut(1);
		System.out.println(l1.premierNoeud().getElement().equals(1));

		// Test5: Lorsqu'on ajoute un élément en fin d'une liste vide
		// la liste est de longueur 1
		setUp();
		l1.ajouterFin(2);
		System.out.println(l1.longueur() == 1);

		// Test6: Lorsqu'on ajoute un élément en fin d'une liste avec un élément,
		// la liste est de longueur 2
		setUp();
		l1.ajouterFin(1);
		l1.ajouterFin(2);
		System.out.println(l1.longueur() == 2 );

		// Test7: Lorsqu'on ajoute l'élément 1 en fin d'une liste vide
		// le dernier noeud est 1
		setUp();
		l1.ajouterFin(1);
		System.out.println(l1.dernierNoeud().getElement().equals(1));

		// Test8: Lorsqu'on ajoute l'élément 1 en fin d'une liste pas vide
		// le dernier noeud est 1
		setUp();
		l1.ajouterFin(2);
		l1.ajouterFin(1);
		System.out.println(l1.dernierNoeud().getElement().equals(1));

		// Test9: Une liste de longueur 2, n'a pas d'élément en position 2
		setUp();
		l1.ajouterFin(2);
		l1.ajouterFin(1);
		System.out.println(l1.iemeNoeud(2) == null);

		// Test10: Vérifier qu'un élément appartient à une liste
		setUp();
		System.out.println(l2.appartient(1) == true);

		// Test11: Vérifier qu'un élément n'appartient pas à une liste
		setUp();
		System.out.println(l2.appartient(11) == false);

		// Test12: Vérifier que le noeud avant le premier noeud n'existe pas
		setUp();
		System.out.println(l2.avant(l2.premierNoeud()) == null);

		// Test13: Vérifier que la liste l2 après suppression du premier noeud, commence par l'élement 2
		setUp();
		l2.supprimerPremier();
		System.out.println(l2.premierNoeud().getElement().equals(2));

		// Test14: Vérifier que la liste l2 après suppression du dernier noeud a
		// comme dernier noeud 9.
		setUp();
		l2.supprimerDernier();
		System.out.println(l2.dernierNoeud().getElement().equals(9));

		// Test15: Vérifier qu'insérer après le premier noeud, augmente la taille de la liste de 1
		setUp();
		l2.insererApres(l2.premierNoeud(), 1);
		System.out.println(l2.longueur() == 11);

		// Test16: Vérifier qu'après avoir inséré avant le premier noeud, l'élément 0, on a l'élément 0
		//en tête de la liste
		setUp(); 
		l2.insererAvant(l2.premierNoeud(), 0);
		System.out.println(l2.premierNoeud().getElement().equals(0));

	}
}