package jv.prueba2;

public class EncryptorDecryptor {
    public static String encrypt(String text, int num) {
        StringBuilder encryptedText = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                encryptedText.append((char) ('A' + (ch - 'A' + num) % 26));
            } else if (Character.isLowerCase(ch)) {
                encryptedText.append((char) ('a' + (ch - 'a' + num) % 26));
            } else {
                encryptedText.append(ch);
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(String encryptedText, int num) {
        StringBuilder decryptedText = new StringBuilder();

        for (char ch : encryptedText.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                decryptedText.append((char) ('A' + (ch - 'A' - num + 26) % 26));
            } else if (Character.isLowerCase(ch)) {
                decryptedText.append((char) ('a' + (ch - 'a' - num + 26) % 26));
            } else {
                decryptedText.append(ch);
            }
        }

        return decryptedText.toString();
    }
}
