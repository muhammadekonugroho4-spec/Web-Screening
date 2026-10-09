package com.koushikdutta.async;

/* loaded from: classes6.dex */
public interface q {
    AsyncServer b();

    void close();

    boolean isPaused();

    com.koushikdutta.async.callback.c p();

    void pause();

    void resume();

    void w(com.koushikdutta.async.callback.a r1);

    void x(com.koushikdutta.async.callback.c r1);
}
