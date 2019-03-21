package com.devitis.restapimvp.data.component;

import com.devitis.restapimvp.data.module.AppModule;
import com.devitis.restapimvp.data.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Diana on 21.03.2019.
 * present modules
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface INetComponent {

    Retrofit retrofit();
}
