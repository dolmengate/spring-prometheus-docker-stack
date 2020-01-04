package soma.http.retrofit.service;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ISomeService {

    @GET
    Call<String> someServiceEndpoint();
}
