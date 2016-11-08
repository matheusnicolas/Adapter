
public class Main {

	public static void main(String[] args){
		
		CarregadorNovo carregadorNovo = new CarregadorNovo("Carregador de canela de bode");
		
		TomadaModeloAntigo modeloAntigo = new TomadaModeloAntigo();
		
		AdaptadorDeTomadas adaptador = new AdaptadorDeTomadas(modeloAntigo);
		adaptador.conectar(carregadorNovo);
		
		
		
	}
}
