package com.devitis.restapimvp.mainscreen;

import com.devitis.restapimvp.data.Post;

import java.util.List;
import java.util.Observable;

import javax.inject.Inject;

import retrofit2.Retrofit;
import retrofit2.http.GET;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
//import rx.schedulers.Schedulers;


/**
 * Created by Diana on 21.03.2019.
 */

public class MainScreenPresenter implements IMainScreenContract.IPresenter {

    Retrofit retrofit;
    IMainScreenContract.IView iView;

    @Inject
    public MainScreenPresenter(Retrofit retrofit, IMainScreenContract.IView iView) {
        this.retrofit = retrofit;
        this.iView = iView;
    }

    @Override
    public void loadPost() {
        retrofit.create(PostService.class).getPostList().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<List<Post>>() {
                    @Override
                    public void onCompleted() {
                        iView.showComplete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        iView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(List<Post> posts) {
                        iView.showPosts(posts);
                    }
                });

    }


}
