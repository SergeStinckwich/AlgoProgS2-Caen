public class TestListeSimple{

	private static ListeSimple l1, l2;

	private static int testCounter = 0;

	public static void setUp()
	{
		l1 = new ListeSimple();
		int t[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		l2 = new ListeSimple(t);
	}

	public static void assertTrue(String msg, boolean condition)
	{
		testCounter++;
		System.out.print("Test " + testCounter + ":");
		System.out.println(msg);
		if (condition) System.out.println("Test OK");
		else System.out.println("Test FALSE!!!!");
	}

	public static void main(String args[])
	{
		setUp();
		assertTrue("Vérifier qu'une nouvelle liste est vide", l1.estVide());

		setUp();
		l1.ajouterDebut(1);
		assertTrue("Lorsqu'on ajoute un élément au début d'une liste vide, la liste est de longueur 1",
			l1.longueur() == 1);

		setUp();
		l1.ajouterDebut(1);
		l1.ajouterDebut(2);
		assertTrue("Lorsqu'on ajoute un élément au début d'une liste avec un élément, la liste est de longueur 2",
			l1.longueur() == 2 );

		setUp();
		l1.ajouterDebut(1);
		assertTrue("Lorsqu'on ajoute l'élément 1 en début de liste, le premier noeud est 1",
			l1.premierNoeud().getElement().equals(1));

		setUp();
		l1.ajouterFin(2);
		assertTrue("Lorsqu'on ajoute un élément en fin d'une liste vide la liste est de longueur 1",
			l1.longueur() == 1);

		setUp();
		l1.ajouterFin(1);
		l1.ajouterFin(2);
		assertTrue("Lorsqu'on ajoute un élément en fin d'une liste avec un élément, la liste est de longueur 2"
			,l1.longueur() == 2 );

		setUp();
		l1.ajouterFin(1);
		assertTrue("Lorsqu'on ajoute l'élément 1 en fin d'une liste vide le dernier noeud est 1",
			l1.dernierNoeud().getElement().equals(1));

		setUp();
		l1.ajouterFin(2);
		l1.ajouterFin(1);
		assertTrue("Lorsqu'on ajoute l'élément 1 en fin d'une liste pas vide le dernier noeud est 1",
			l1.dernierNoeud().getElement().equals(1));

		setUp();
		l1.ajouterFin(2);
		l1.ajouterFin(1);
		assertTrue("Une liste de longueur 2, n'a pas d'élément en position 2",
			l1.iemeNoeud(2) == null);

		setUp();
		assertTrue("Vérifier qu'un élément appartient à une liste",
			l2.appartient(1) == true);

		setUp();
		assertTrue("Vérifier qu'un élément n'appartient pas à une liste",
			l2.appartient(11) == false);

		setUp();
		assertTrue("Vérifier que le noeud avant le premier noeud n'existe pas",
			l2.avant(l2.premierNoeud()) == null);

		setUp();
		assertTrue("Vérifier que le noeud avant le deuxième noeud est le noeud de position 1",
			l2.avant((NoeudSimple)l2.iemeNoeud(2)) == l2.iemeNoeud(1));

		setUp();
		assertTrue("Vérifier qu'il est possible de supprimer le premier élément d'une liste non vide",
			l2.supprimerPremier());

		setUp();
		l2.supprimerPremier();
		assertTrue("Vérifier que la liste l2 après suppression du premier noeud, commence par l'élement 2",
			l2.premierNoeud().getElement().equals(2));

		setUp();
		assertTrue("Vérifier qu'il est possible de supprimer le dernier élément d'une liste non vide",
			l2.supprimerDernier());

		setUp();
		l2.supprimerDernier();
		assertTrue("Vérifier que la liste l2 après suppression du dernier noeud a comme dernier noeud 9",
			l2.dernierNoeud().getElement().equals(9));

		setUp();
		l2.insererApres(l2.premierNoeud(), 1);
		assertTrue("Vérifier qu'insérer après le premier noeud, augmente la taille de la liste de 1",
			l2.longueur() == 11);

		setUp(); 
		l2.insererAvant(l2.premierNoeud(), 0);
		assertTrue("Vérifier qu'après avoir inséré avant le premier noeud, l'élément 0, on a l'élément 0 en tête de la liste",
			l2.premierNoeud().getElement().equals(0));

	}
}