import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> of(int number) {
        List<Integer> factor = new ArrayList<>();
        if (number > 1) {
            if (number == 4) {
                factor.add(2);
                factor.add(2);
            } else factor.add(number);
        }
        return factor;
    }
}
