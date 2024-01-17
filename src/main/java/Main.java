import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;

import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        String url = "/index.html?param1=value1&param2=value2";

       //  URLEncodedUtils utils;

        URIBuilder uriBuilder = new URIBuilder(url);

        var result= uriBuilder.getQueryParams();
        result.forEach(System.out::println);

    }
}
