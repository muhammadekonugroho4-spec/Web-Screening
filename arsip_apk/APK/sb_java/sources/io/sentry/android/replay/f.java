package io.sentry.android.replay;

import java.io.Closeable;

/* loaded from: classes3.dex */
public interface f extends Closeable {
    void j(o r1);

    void pause();

    void reset();

    void resume();

    void start();

    void stop();
}
