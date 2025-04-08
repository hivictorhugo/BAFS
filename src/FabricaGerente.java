public class FabricaGerente implements FabricaCargo{
    private FabricaGerente() {};
    private static FabricaGerente instance = new FabricaGerente();
    public static FabricaGerente getInstance() {
        return instance;
    }
    public  Cargo criar(Nivel nivel){
        return new Gerente(nivel);
    }
}
