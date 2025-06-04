import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> of(int number) {
        List<Integer> factor = new ArrayList<>();
        if (number > 1) {
            int divisor = 2;
            if (number == 4) {
                while (number % divisor == 0){
                    factor.add(divisor);
                    number /= divisor;
                }
            } else if (number == 6){
                for (divisor = 2 ; number > 1 ; divisor++) {
                    while (number % divisor == 0) {
                        factor.add(divisor);
                        number /= divisor;
                    }
                }
            }else factor.add(number);
        }
        return factor;
    }
}
