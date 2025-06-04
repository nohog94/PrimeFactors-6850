import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> of(int number) {
        List<Integer> factor = new ArrayList<>();
        if (number == 2)
            factor.add(2);
        return factor;
    }
}
