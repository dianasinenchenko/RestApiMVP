package com.devitis.restapimvp;

import android.app.Application;

import com.devitis.restapimvp.data.component.INetComponent;
import com.devitis.restapimvp.data.module.AppModule;
import com.devitis.restapimvp.data.module.NetModule;

/**
 * Created by Diana on 21.03.2019.
 */

public class App extends Application {

    private INetComponent iNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        iNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public INetComponent getiNetComponent() {
        return iNetComponent;
    }
}
