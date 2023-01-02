package Wallet.Handlers;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class PasswordHandler {
    public static String ConvertToMd5(String password) {
        String retVal = "";
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(password.getBytes());

            byte[] bytes = m.digest();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            retVal = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return retVal;
    }
}
