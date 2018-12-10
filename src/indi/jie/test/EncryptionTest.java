package indi.jie.test;
import indi.jie.common.Encryption;
import org.junit.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


public class EncryptionTest {


    public static void main(String[] args){

        Encryption et=new Encryption();
        String data=et.entcrypt("","md5").digest("hex");
        System.out.println(data.length());//UUSMzrCeEuDcNu9Rtw+bsw==

    }


}
