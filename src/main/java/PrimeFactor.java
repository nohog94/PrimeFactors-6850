import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> of(int number) {
        List<Integer> factor = new ArrayList<>();
        if (number > 1)
            factor.add(number);
        return factor;
    }
}
