package com.devitis.restapimvp.mainscreen;

import com.devitis.restapimvp.util.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Diana on 21.03.2019.
 */
@Module
public class MainScreenModule {

    private final IMainScreenContract.IView iView;

    public MainScreenModule(IMainScreenContract.IView iView) {
        this.iView = iView;
    }

    @Provides
    @CustomScope
    IMainScreenContract.IView provideMainScreenContractView() {
        return iView;
    }


}
