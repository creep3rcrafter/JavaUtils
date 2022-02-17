package creep3rcrafter.logic;

public class PressedAndReleased {
    private boolean before;
    public boolean test(boolean input) {
        boolean output;
        output = !input && before;
        before = input;
        return output;
    }
}
