package com.grayzlp.ggithub.core;

/**
 * Created by grayzlp on 2017/9/16.
 */

public interface BasePresenter<T> {

    void takeView(T view);

    void dropView();
}
