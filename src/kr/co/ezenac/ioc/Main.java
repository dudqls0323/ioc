package kr.co.ezenac.ioc;

public class Main {

    public static void main(String[] args) {

        String url = "https://spring.io/";



        IEncoder encoder = new Encoder();
        String result = encoder.encode(url);

        //url endocding
        IEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);

        System.out.println("hello Spring!!");

        System.out.println(result);
    }
}
