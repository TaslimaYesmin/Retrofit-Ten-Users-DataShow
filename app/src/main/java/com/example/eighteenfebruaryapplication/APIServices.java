package com.example.eighteenfebruaryapplication;

import com.example.eighteenfebruaryapplication.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIServices {

    @GET("users")
    Call<List<Post>> getPostList();

   /* @POST("posts")
    Call<Post> getPost(@Body Post post);

    @FormUrlEncoded
    @POST("posts")
    Call<Post> createPost(
            @Field("userId") int userId,
            @Field("title") String title,
            @Field("body") String body);


    @PUT("posts/{id}")
    Call<Post> putPost(@Path("id") int id, @Body Post post);

    @PATCH("posts/{id}")
    Call<Post>patchPost(@Path("id") int id,@Body Post post);

    @DELETE("posts/{id}")
    Call<Post> deletePost(@Path("id") int id);*/
}
