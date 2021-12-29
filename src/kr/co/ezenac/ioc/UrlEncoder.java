package kr.co.ezenac.ioc;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlEncoder implements IEncoder{

    public String encode(String message) {

        try {
            return URLEncoder.encode(message, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
