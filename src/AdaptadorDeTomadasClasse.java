
public class AdaptadorDeTomadasClasse extends TomadaModeloAntigo implements TomadaDeTresPinosIF {

	public void conectar(ConectorDeTresPinos conector){
		super.conectar(new ConectorDeDoisPinos(conector.getDescricao()));
	}
}
