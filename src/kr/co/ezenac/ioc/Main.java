package kr.co.ezenac.ioc;

public class Main {

    public static void main(String[] args) {

        String url = "https://spring.io/";

        Encoder encoder = new Encoder();
        String result = encoder.encode(url);
        System.out.println(result);

    }
}
