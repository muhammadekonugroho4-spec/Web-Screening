package com.tinder.scarlet;

/* loaded from: classes2.dex */
public interface j extends org.reactivestreams.a {

    public interface a {
        void dispose();
    }

    public interface b {
        void onComplete();

        void onError(Throwable r1);

        void onNext(Object r1);
    }

    a c(b r1);
}
