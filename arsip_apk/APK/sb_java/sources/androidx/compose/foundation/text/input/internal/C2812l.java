package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* renamed from: androidx.compose.foundation.text.input.internal.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2812l {

    /* renamed from: a, reason: collision with root package name */
    public static final C2812l f10309a = null;

    static {
        f10309a = new C2812l();
    }

    public C2812l() {
    }

    public static /* synthetic */ void a(IntConsumer r02, int r1) {
        c(r02, r1);
    }

    public static final void c(IntConsumer r02, int r1) {
        r02.accept(r1);
    }

    public final void b(I2 r1, HandwritingGesture r2, Executor r3, final IntConsumer r4) {
        final int r12 = r1.f(r2);
        if (r4 != null) goto L5;
        return;
    L5:
        if (r3 == null) goto L8;
        r3.execute(new RunnableC2808k(r4, r12));
        return;
    L8:
        r4.accept(r12);
    }

    public final boolean d(I2 r1, PreviewableHandwritingGesture r2, CancellationSignal r3) {
        return r1.previewHandwritingGesture(r2, r3);
    }
}
