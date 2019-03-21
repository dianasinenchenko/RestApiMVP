package com.devitis.restapimvp.mainscreen;

import com.devitis.restapimvp.data.Post;

import java.util.List;
import java.util.Observable;

import retrofit2.http.GET;


/**
 * Created by Diana on 21.03.2019.
 */

public class MainScreenPresenter implements IMainScreenContract.IPresenter {
    @Override
    public void loadPost() {

    }


    public interface IPostService {
        @GET("/posts")
        Observable<List<Post>> getPostList();
    }
}
