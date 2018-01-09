


	public class FabricaForma extends FabricaAbstrata {

		@Override
		Color getColor(String color) {
			return null;
		}

		@Override
		Forma getShape(String shapeType) {
			if (shapeType == null) {
				return null;
			}

			if (shapeType.equalsIgnoreCase("RECTANGLE")) {
				return new Rectangle();

			} else if (shapeType.equalsIgnoreCase("SQUARE")) {
				return new Square();
			}

			return null;
		}

	}