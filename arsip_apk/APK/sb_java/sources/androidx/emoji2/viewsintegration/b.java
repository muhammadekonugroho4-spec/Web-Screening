package androidx.emoji2.viewsintegration;

import android.text.Editable;
import androidx.emoji2.text.r;

/* loaded from: classes4.dex */
public final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f24131a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Editable.Factory f24132b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f24133c;

    static {
        f24131a = new Object();
    }

    public b() {
        f24133c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());     // Catch: Throwable -> L5
        return;
    }

    public static Editable.Factory getInstance() {
        if (f24132b != null) goto L16;
        Object r02 = f24131a;
        monitor-enter(r02);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f24132b != null) goto L11;
        f24132b = new b();     // Catch: Throwable -> L9
    L11:
        monitor-exit(r02);     // Catch: Throwable -> L9
    L16:
        return f24132b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence r2) {
        Class r02 = f24133c;
        if (r02 == null) goto L7;
        return r.c(r02, r2);
    L7:
        return super.newEditable(r2);
    }
}
