public static void main(String[] args) {
		ArmaBase armaSimples = new ArmaBase();
		armaSimples.montar();
		
		Mira armaMira = new Mira(armaSimples);
		armaMira.montar();
		
		Silenciador armaSilencio = new Silenciador(armaSimples);
		Silenciador armaTopSilencio = new Silenciador(armaMira);
		Mira armaTopMira = new Mira(armaTopSilencio);
		
		
		armaSimples.mirar();
		armaSimples.atirar();
		
		armaMira.mirar();
		armaMira.mira10x();
		armaMira.atirar();
		
		armaSilencio.mirar();
		armaSilencio.atirar();
		
		armaTopSilencio.mirar();
		armaTopSilencio.atirar();
		armaTopMira.mira10x();
		
		
		
		
		
		
	}
	public interface Arma {

		public void montar();
		public void atirar();
		public void mirar();
		

	}
	
	public static class ArmaBase implements Arma {

		@Override
		public void montar() {
			System.out.println("Essa é uma arma base");
		}
		
		@Override
		public void atirar() {
			System.out.println("BOOM");
			
		}
		
		@Override
		public void mirar() {
			System.out.println("Mira comum");
			
			
		}
		
		

	}
	
	public static  class ArmaDecorator implements Arma {

		public Arma arma;

		public ArmaDecorator(Arma arma) {
			this.arma = arma;
		}
		
		@Override
		public void atirar() {
			this.arma.atirar();
			
		}
		public void mirar() {
			this.arma.mirar();
		}
		@Override
		public void montar() {
			this.arma.montar();
		}

	}

	public static class Silenciador extends ArmaDecorator {

		public Silenciador(Arma arma) {
			super(arma);
		}

		@Override
		public void montar() {
			super.montar();
			System.out.println("Adicionando silenciador a arma");
		}
		
		@Override
		public void atirar() {
			System.out.println("piu");
		}

	}

	public static class Mira extends ArmaDecorator {

		public Mira(Arma arma) {
			super(arma);
		}
		
		public void mirar(){
			System.out.println("zoom aplicado");
			
		}
		
		public void mira10x(){
			System.out.println("zoom 10x aplicado");
			
		}

		@Override
		public void montar() {
			super.montar();
			System.out.println("Adicionando mira a arma");
		}

	}