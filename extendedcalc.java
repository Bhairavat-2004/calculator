public class extendedcalc {
    float square(float operand_1) {
        return (operand_1 * operand_1);
    }

    float cube(float operand_1) {
        return ((operand_1 * operand_1) * operand_1);
    }

    public static void main(String[] args) {
        float operand_1 = 10;
        float operand_2 = 5;
        extendedcalc cal = new extendedcalc();

        float div_square = cal.square(operand_1);
        System.out.println("Result of Addition:" + div_square);

        float div_cube = cal.cube(operand_1);
        System.out.println("Result of Addition:" + div_cube);
    }
}
