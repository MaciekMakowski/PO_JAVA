public class PairUtil extends Pair {

    public static Pair swap(Pair pair){
        return new Pair(pair.getSecond(), pair.getFirst());
    }
}