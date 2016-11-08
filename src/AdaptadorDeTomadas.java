
public class AdaptadorDeTomadas implements TomadaDeTresPinosIF {

	private TomadaModeloAntigo tomadaAntiga;
	
	public AdaptadorDeTomadas(TomadaModeloAntigo tomadaAntiga){
		this.tomadaAntiga = tomadaAntiga;
	}
	
	public void conectar(ConectorDeTresPinos conector){
		tomadaAntiga.conectar(new ConectorDeDoisPinos(conector.getDescricao()));
	}
}
