package androidx.lifecycle;

import com.clevertap.android.sdk.Constants;
import java.io.Closeable;

/* loaded from: classes4.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.viewmodel.internal.g f25677a;

    public e0() {
        this.f25677a = new androidx.lifecycle.viewmodel.internal.g();
    }

    public /* synthetic */ void c3(Closeable r2) {
        kotlin.jvm.internal.p.l(r2, "closeable");
        androidx.lifecycle.viewmodel.internal.g r02 = this.f25677a;
        if (r02 == null) goto L6;
        r02.d(r2);
        return;
    }

    public final void d3(String r2, AutoCloseable r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
        kotlin.jvm.internal.p.l(r3, "closeable");
        androidx.lifecycle.viewmodel.internal.g r02 = this.f25677a;
        if (r02 == null) goto L6;
        r02.e(r2, r3);
        return;
    }

    public final void e3() {
        androidx.lifecycle.viewmodel.internal.g r02 = this.f25677a;
        if (r02 == null) goto L5;
        r02.f();
    L5:
        g3();
    }

    public final AutoCloseable f3(String r2) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
        androidx.lifecycle.viewmodel.internal.g r02 = this.f25677a;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.h(r2);
    }

    public void g3() {
    }
}
