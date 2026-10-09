package io.sentry.android.core.performance;

import android.view.Window;

/* loaded from: classes3.dex */
public class l extends io.sentry.android.core.internal.gestures.i {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f175601b;

    public l(Window.Callback r1, Runnable r2) {
        super(r1);
        this.f175601b = r2;
    }

    @Override // io.sentry.android.core.internal.gestures.i, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        this.f175601b.run();
    }
}
