public class Analista extends Cargo{
    public Analista(Nivel nivel){
        super(nivel);
    }

    public String getCargoCompleto(){
        return "Analisa" + nivel.getDescricao();
    }
}
