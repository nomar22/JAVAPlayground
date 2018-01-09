public class GeradoFabrica {
	
		public static FabricaAbstrata getFabrica(String choice) {
			if(choice.equalsIgnoreCase("SHAPE"))
				return new FabricaForma();
			if(choice.equalsIgnoreCase("COLOR"))
				return new ColorFactory();
			return null;
			
		}
	}