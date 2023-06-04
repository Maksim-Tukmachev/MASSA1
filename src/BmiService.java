public class BmiService {
    public int calculate(double kg, double cm) {
        int calculateResult;
        calculateResult = (int) (kg / (cm * cm));
        return calculateResult;
    }
}
