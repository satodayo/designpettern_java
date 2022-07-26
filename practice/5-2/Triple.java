public class Triple {
    private Triple(){}

    private static Triple alpha = new Triple();
    private static Triple beta = new Triple();
    private static Triple gamma = new Triple();

    public static Triple getInstance(String name){
        switch(name){
            case "ALPHA":
            return alpha;
            case "BETA":
            return beta;
            case "GAMMA":
            default:
            return gamma;
        }
    }
}
