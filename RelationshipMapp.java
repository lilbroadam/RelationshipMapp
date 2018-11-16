import java.awt.Graphics;

public class RelationshipMapp {

	public static void main(String[] args) {
		GraphicsHandler.setUpWindow(500, 500);
		
		Person adam = new Person("Adam", true);
		Person grecia = new Person("Grecia", adam, "dating");
		Person allen = new Person("Allen", adam, "friend");
		Person ana = new Person("Ana", adam, "friend");
		Person khoi = new Person("Khoi", adam, "friend");
		
		allen.addRelationship(ana, "friend");
		
		adam.printRelationships();
		System.out.println();
		grecia.printRelationships();
		System.out.println();
		allen.printRelationships();
		System.out.println();
		ana.printRelationships();
		
		GraphicsHandler.displayWindow();
	}

}
