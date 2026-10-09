package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final long f18041a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18042b;

    /* renamed from: c, reason: collision with root package name */
    public MotionEvent f18043c;

    static {
    }

    public A(long r1, List r3, MotionEvent r4) {
        this.f18041a = r1;
        this.f18042b = r3;
        this.f18043c = r4;
    }

    public final MotionEvent a() {
        return this.f18043c;
    }

    public final List b() {
        return this.f18042b;
    }

    public final void c(MotionEvent r1) {
        this.f18043c = r1;
    }
}
