package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
       float result = Math.round(numberToBeRounded);

        System.out.println((int) result);
    }

    public static void main(String[] args) {
        FloatTypeCasting x = new FloatTypeCasting();
        x.roundNumber(19.5F);
    }
}
