package Arrays;

public class ColorArray {
    public static void main(String[] args) {

        String[][] colors = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}
        };

        for (int i = 0; i < colors.length; i++) {
            for (int k = 0; k < colors.length; k++) {
                System.out.print(colors[i][k] + ", ");
            }


        }
    }
}
