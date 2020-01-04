package soma.http;

import com.squareup.okhttp.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpConfiguration {

    @Bean
    OkHttpClient okHttpClient() {
        return new OkHttpClient();
    }

}
