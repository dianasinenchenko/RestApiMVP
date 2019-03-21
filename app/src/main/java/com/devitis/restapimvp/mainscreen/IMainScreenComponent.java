package com.devitis.restapimvp.mainscreen;

import com.devitis.restapimvp.MainActivity;
import com.devitis.restapimvp.data.component.INetComponent;
import com.devitis.restapimvp.util.CustomScope;

import dagger.Component;

/**
 * Created by Diana on 21.03.2019.
 */
@CustomScope
@Component(dependencies = INetComponent.class, modules = MainScreenModule.class)
public interface IMainScreenComponent {

    void inject(MainActivity mainActivity);
}
