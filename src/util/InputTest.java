package util;

import static util.Input.*;

public class InputTest {
    public static void main(String[] args) {
        getString();
        System.out.println(yesNo());
        getInt(5,10);
        getInt();
        getDouble(1,10);
        getDouble();
    }
}
