package com.devitis.restapimvp.mainscreen;

import com.devitis.restapimvp.data.Post;

import java.util.List;

/**
 * Created by Diana on 21.03.2019.
 */

public interface IMainScreenContract {

    interface IView {

        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }


    interface IPresenter {
        void loadPost();
    }
}
