public class FabricaGerente implements FabricaCargo{
    public  Cargo criar(Nivel nivel){
        return new Gerente(nivel);
    }
}
