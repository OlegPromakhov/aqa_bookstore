package api;

import retrofit2.Call;
import retrofit2.http.*;
import models.request.User;
import models.response.CreatedUser;

public interface UserClient {
    @POST("/Account/v1/models.request.User")
    Call<CreatedUser> createUser(@Body User user);

    @POST("/Account/v1/GenerateToken")
    Call<Void> generateUserToken(
            @Body User user
    );
}

