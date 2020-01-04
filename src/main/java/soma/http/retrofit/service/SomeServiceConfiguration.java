package soma.http.retrofit.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;

/**
 * @author sroman
 */
@Configuration
public class SomeServiceConfiguration {

    @Value("${retrofit.some_service.url}")
    String url;

    @Bean
    ISomeService service() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .build();
        return retrofit.create(ISomeService.class);
    }
}
