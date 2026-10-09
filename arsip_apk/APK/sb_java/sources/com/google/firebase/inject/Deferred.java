package com.google.firebase.inject;

import com.google.firebase.annotations.DeferredApi;

/* loaded from: classes6.dex */
public interface Deferred<T> {

    public interface DeferredHandler<T> {
        @DeferredApi
        void handle(Provider<T> r1);
    }

    void whenAvailable(DeferredHandler<T> r1);
}
