public class Combinations {
public static void main(String[] args) {
    int input[] = {2,5,6,7 };
    // int input[] = {10,11,12,13};
    possibleNumbers(input, 0);
}

public static void possibleNumbers(int[] x, int index) {
    if (index == x.length) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    for (int i = index; i < x.length; i++) {
        int temp = x[index];
        x[index] = x[i];
        x[i] = temp;
        possibleNumbers(x, index + 1);

        temp = x[index];
        x[index] = x[i];
        x[i] = temp;
    }
}}