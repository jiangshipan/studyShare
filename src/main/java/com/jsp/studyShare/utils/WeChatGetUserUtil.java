//package com.jsp.studyShare.utils;////import com.alibaba.fastjson.JSON;//import com.alibaba.fastjson.JSONObject;//import org.bouncycastle.jce.provider.BouncyCastleProvider;//import org.springframework.util.Base64Utils;////import javax.crypto.Cipher;//import javax.crypto.spec.IvParameterSpec;//import javax.crypto.spec.SecretKeySpec;//import java.security.AlgorithmParameters;//import java.security.Security;//import java.util.Arrays;////public class WeChatGetUserUtil {////    public static String  getUserInfo(String encryptedData, String sessionKey, String iv) {//        //被加密的数据//        byte[] dataByte = Base64Utils.decode(encryptedData.getBytes());//        //加密密钥//        byte[] keyByte = Base64Utils.decode(sessionKey.getBytes());//        //偏移量//        byte[] ivByte = Base64Utils.decode(iv.getBytes());//        try {//            //加密用的Key 可以用26个字母和数字组成 此处使用AES-128-CBC加密模式，key需要为16位。//            //如果密钥不足16位,就补足//            int base = 16;//            if (keyByte.length % base != 0) {//                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);//                byte[] temp = new byte[groups * base];//                Arrays.fill(temp, (byte) 0);//                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);//                keyByte = temp;//            }//            //初始化//            Security.addProvider(new BouncyCastleProvider());//            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");//            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");//            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");//            parameters.init(new IvParameterSpec(ivByte));//            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);//            byte[] resultByte = cipher.doFinal(dataByte);//            if (null != resultByte && resultByte.length > 0) {//                String result = new String(resultByte,"UTF-8");//                return result;//            }//        } catch (Exception e) {//            e.printStackTrace();//        }//        return null;//    }//}