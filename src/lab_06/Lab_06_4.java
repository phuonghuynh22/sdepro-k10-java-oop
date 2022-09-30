package lab_06;

import java.util.Arrays;

public class Lab_06_4 {
    public static void main(String[] args) {
        /*
         * String url = "https://google.com";
         * Check http OR https; domain name, .com OR .net
         */
        String url = "https://google.com";
        System.out.println("The input url: " + url);
        String[] splitStr = url.split("://");

        //System.out.println(Arrays.toString(splitStr));
        String protocol = "";
        String hostname = "";

        for (int index = 0; index < splitStr.length; index++) {
            protocol = splitStr[index];
            ++index;
            hostname = splitStr[index];
            break;
        }

        //System.out.println(hostname);

        if (protocol.equals("http"))
            System.out.println("Protocol is http!");
        else if (protocol.equals("https"))
            System.out.println("Protocol is https");
        else
            System.out.println("Neither http nor https!");

        String domain = "";
        String topLevelDomain = "";
        if (hostname.contains(".com") || hostname.contains(".net"))
            for (int index = 0; index < hostname.length(); index++) {
                topLevelDomain = hostname.substring(hostname.length()-4);
                domain = hostname.substring(0,hostname.length()-4);
            }
        else
            System.out.println("Neither .com nor .net!");

        System.out.println("Domain is " + domain);
        System.out.println(topLevelDomain);

    }
}
