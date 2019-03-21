package com.devitis.restapimvp.data.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Diana on 21.03.2019.
 * retrofit and Okhttp use in application
 * the app context is provided to Retrofit and OkHttp library
 */


@Module
public class AppModule {
    Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return application;
    }
}
