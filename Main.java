// Atharv Thakur and Vivaan Bhole

public class Main {
    public static void main(String[] args) {
        int lower = 0, upper = 0;
        try{
            lower = Integer.parseInt(args[0]);
            upper = Integer.parseInt(args[1]);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        BetweenAdder adder = (a, b) -> {
            int sum = 0;
            for (int i = a; i <= b; i++)
                sum+= i;
            return sum;
        };
        System.out.println(adder.add(lower, upper));
    }
}
