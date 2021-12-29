package kr.co.ezenac.ioc;

public class Main {

    public static void main(String[] args) {

        String url = "https://spring.io/";

        //Base64 encoding
        IEncoder encoder = new Base64Encoder();
        String result = encoder.encode(url);

        //url encoding
        IEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);

        System.out.println("hello Spring!!");

        System.out.println(result);
    }
}
