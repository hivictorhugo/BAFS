public class FabricaAnalista implements FabricaCargo{
    private FabricaAnalista() {};
    private static FabricaAnalista instance = new FabricaAnalista();
    public static FabricaAnalista getInstance() {
        return instance;
    }
    public Cargo criar(Nivel nivel){
        return new Analista(nivel);
    }
}