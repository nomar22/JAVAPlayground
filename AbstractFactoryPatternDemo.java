public class AbstractFactoryPatternDemo {
	
	public static void main(String[] args) {
		//get shape factory
//	      FabricaAbstrata shapeFactory = FactoryProducer.getFactory("SHAPE");
		FabricaAbstrata fabricaForma = GeradoFabrica.getFabrica("SHAPE");


	      //get an object of Shape Rectangle
	      Forma shape2 = fabricaForma.getShape("RECTANGLE");

	      //call draw method of Shape Rectangle
	      shape2.draw();
	      
	      //get an object of Shape Square 
	      Forma shape3 = fabricaForma.getShape("SQUARE");

	      //call draw method of Shape Square
	      shape3.draw();

	      //get color factory
	      FabricaAbstrata colorFactory = GeradoFabrica.getFabrica("COLOR");

	      //get an object of Color Red
	      Color color1 = colorFactory.getColor("RED");
	      color1.fill();
		


	}

}
