package com.example.eighteenfebruaryapplication;

import com.example.eighteenfebruaryapplication.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIServices {

    @GET("users")
    Call<List<User>> getPostList();

   /* @POST("posts")
    Call<User> getPost(@Body User post);

    @FormUrlEncoded
    @POST("posts")
    Call<User> createPost(
            @Field("userId") int userId,
            @Field("title") String title,
            @Field("body") String body);


    @PUT("posts/{id}")
    Call<User> putPost(@Path("id") int id, @Body User post);

    @PATCH("posts/{id}")
    Call<User>patchPost(@Path("id") int id,@Body User post);

    @DELETE("posts/{id}")
    Call<User> deletePost(@Path("id") int id);*/
}
