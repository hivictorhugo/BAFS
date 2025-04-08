public class FabricaAnalista implements FabricaCargo{
    public Cargo criar(Nivel nivel){
        return new Analista(nivel);
    }
}

