public class Gerente extends Cargo{
    public Gerente(Nivel nivel){
        super(nivel);
    }

    public String getCargoCompleto(){
        return "Gerente" + nivel.getDescricao();
    }
}
