package Functions;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("dog", "god"));

    }

    public static boolean anagram(String input1, String input2) {
        char[] array1 = new char[input1.length()];
        for (int i = 0; i < input1.length(); i++) {
            array1[i] = input1.charAt(i);
        }
        char[] array2 = new char[input2.length()];
        for (int i = 0; i < input2.length(); i++) {
            array2[i] = input2.charAt(i);
        }
        char[] array3 = new char[array2.length];

        int j = 0;
        for (int i = array1.length - 1; i >= 0; i--) {
            array3[j] = array1[i];
            j++;
        }


        boolean anagram = true;
        for (int i = 0; i < array2.length; i++) {
            if(array2[i] != array3[i]) {
                anagram = false;
                break;
            } else {
                anagram = true;
            }
        }

        return anagram;
    }
}
