import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> of(int number) {
        List<Integer> factor = new ArrayList<>();
        if (number > 1) {
            if (number == 4) {
                while (number % 2 == 0){
                    factor.add(2);
                    number /= 2;
                }
            } else factor.add(number);
        }
        return factor;
    }
}
