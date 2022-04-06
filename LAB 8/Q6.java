
public class Q6 {
    public static int calculateSum(int args, int[] array) throws CheckArgumentException {
        int sum = 0;
        if (args < 4)
            throw new CheckArgumentException("The Number of Arguments passed in the CLI is less than 4");
        else {
            for (int i = 0; i < args; i++) {
                sum = sum + (array[i] * array[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] array = {4,5,6,7,5};
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        try {
            int result = calculateSum(args.length, array);
            System.out.println("The Sum of the Sqaures of the numbres is: " + result);
        } catch (CheckArgumentException e) {
            System.out.println(e);
        }

    }
}

class CheckArgumentException extends Exception {
    CheckArgumentException(String s) {
        super(s);
    }
}