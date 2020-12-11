package Arrays;

public class SwapElements {
    public static void main(String[] args) {

        String[] elements= {"first", "third", "second"};
        String tmp = elements[1];
        elements[1] = elements[2];
        elements[2] = tmp;

        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}

