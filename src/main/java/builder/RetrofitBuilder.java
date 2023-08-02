package builder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    private Retrofit retrofit;

    public RetrofitBuilder() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.example.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
//    private static Retrofit retrofit;
//
//    public static Retrofit getRetrofitInstance() {
//        if (retrofit == null) {
//            // Create OkHttpClient to log request and response information (optional, for debugging)
//            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
//            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//            httpClient.addInterceptor(loggingInterceptor);
//
//            retrofit = new Retrofit.Builder()
//                    .baseUrl("BASE_URL")
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .client(httpClient.build())
//                    .build();
//        }
//        return retrofit;
//    }
}

