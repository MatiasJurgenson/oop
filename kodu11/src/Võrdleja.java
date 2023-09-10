public class Võrdleja<T extends Comparable<T>> {
    public T leiaSuurem(T üks, T teine) {
        int tulemus = üks.compareTo(teine);
        if (tulemus > 0) return üks;
        return teine;
    }
}
