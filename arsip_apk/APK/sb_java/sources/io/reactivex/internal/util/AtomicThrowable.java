package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public AtomicThrowable() {
    }

    public boolean a(Throwable r1) {
        return ExceptionHelper.a(this, r1);
    }

    public Throwable b() {
        return ExceptionHelper.b(this);
    }
}
