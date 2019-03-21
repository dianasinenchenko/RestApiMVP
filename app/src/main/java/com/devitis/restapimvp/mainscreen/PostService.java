package com.devitis.restapimvp.mainscreen;

import com.devitis.restapimvp.data.Post;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Diana on 21.03.2019.
 */

interface PostService {
    @GET("/posts")
    Observable<List<Post>> getPostList();
}

