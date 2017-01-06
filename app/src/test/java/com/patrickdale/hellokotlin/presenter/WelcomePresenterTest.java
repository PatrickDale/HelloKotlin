package com.patrickdale.hellokotlin.presenter;

import com.patrickdale.hellokotlin.presenter.WelcomePresenter.WelcomeView;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by patdale on 1/6/17.
 */

public class WelcomePresenterTest {

    private WelcomeView view;
    private WelcomePresenter welcomePresenter;

    @Before
    public void setUp() throws Exception {
        view = mock(WelcomeView.class);
        welcomePresenter = new WelcomePresenter(view);
    }

    @Test
    public void shouldSetWelcomeMessageToHelloWhenInitialized() {
        welcomePresenter.init();

        verify(view).setWelcomeMessage("hello");
    }

    @Test
    public void shouldSetWelcomeMessageToWorldWhenUpdatedAndValueIsHello() throws Exception {
        welcomePresenter.updateWelcomeMessage("hello");

        verify(view).setWelcomeMessage("world");
    }

    @Test
    public void shouldSetWelcomeMessageToHelloWhenUpdatedAndValueIsWorld() throws Exception {
        welcomePresenter.updateWelcomeMessage("world");

        verify(view).setWelcomeMessage("hello");
    }
}
