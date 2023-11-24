import com.example.Feline;

import java.util.List;

public class InjectionClassDependingOnPredators {
    Feline feline = new Feline();
    boolean hasMane;

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
