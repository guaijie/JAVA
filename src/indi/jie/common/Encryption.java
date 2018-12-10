package indi.jie.common;
import org.junit.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Encryption {

    private byte[] secretBytes={};

    public Encryption  entcrypt(String data,String algorithm){

        MessageDigest md = null;
        algorithm=algorithm.toUpperCase();

        try {
            md = MessageDigest.getInstance(algorithm);
            byte[] bytes=data.getBytes();
            md.update(bytes);
            secretBytes=md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有"+algorithm+"算法！");
        }

        return  this;
    }

    public String digest(String type){
        type=type.toLowerCase();
        String secretData="";
        if(type.equals("base64")){
            secretData=Base64.getEncoder().encodeToString(secretBytes);
        }else if(type.equals("hex")){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<secretBytes.length;i++){
                System.out.println(i);
                String hex=Integer.toHexString(secretBytes[i] & 0xFF);
                if(hex.length()<2){
                    sb.append(0);
                }
                sb.append(hex);
            }
            secretData=sb.toString();
        }
        return secretData;
    }

    public String digest(){

        return secretBytes.toString();

    }

}
