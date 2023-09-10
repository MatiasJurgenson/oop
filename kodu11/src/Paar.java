public class Paar<E, T> {
    private E esimene;
    private T teine;

    public Paar(E esimene, T teine) {
        this.esimene = esimene;
        this.teine = teine;
    }

    public E getEsimene() {
        return esimene;
    }

    public T getTeine() {
        return teine;
    }

    public void setEsimene(E esimene) {
        this.esimene = esimene;
    }

    public void setTeine(T teine) {
        this.teine = teine;
    }

    public String toString() {
        return esimene + ", " + teine;
    }
}
