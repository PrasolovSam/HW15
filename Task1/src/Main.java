public class Main {
    public static void main(String[] args) {
        String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        for (int i = 0; i < alphabet.length(); i++) {
            char letter = alphabet.charAt(i);
            int code = (int) letter;
            System.out.println(letter + " : " + code);
        }

    }
}