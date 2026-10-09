package org.reactivestreams;

/* loaded from: classes3.dex */
public interface b {
    void onComplete();

    void onError(Throwable r1);

    void onNext(Object r1);

    void onSubscribe(c r1);
}
