public class ColorFactory extends FabricaAbstrata {

		@Override
		public Forma getShape(String shapeType) {
			return null;
		}

		@Override
		Color getColor(String color) {

			if (color == null) {
				return null;
			}

			if (color.equalsIgnoreCase("RED")) {
				return new Red();

			} else if (color.equalsIgnoreCase("GREEN")) {
				return new Green();

			}

			return null;
		}
	}