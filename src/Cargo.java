public abstract class Cargo {
    protected Nivel nivel;

    public Cargo(Nivel nivel){
        this.nivel = nivel;
    }

    public abstract String getCargoCompleto();
}
