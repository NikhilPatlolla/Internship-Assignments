
public class PositiveNegativeZero {
    public static void main(String[] args) {
        String type = typeOfValue(0);
        System.out.println(type);
    }

    private static String typeOfValue(int value){
        if(value > 0) return "positive";
        else if(value < 0) return "negative";
        else return "zero";
    }
}
