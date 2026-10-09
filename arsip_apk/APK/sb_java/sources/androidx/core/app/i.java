package androidx.core.app;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22639a;

    /* renamed from: b, reason: collision with root package name */
    public Configuration f22640b;

    public i(boolean r1) {
        this.f22639a = r1;
    }

    public final boolean a() {
        return this.f22639a;
    }

    public i(boolean r2, Configuration r3) {
        kotlin.jvm.internal.p.l(r3, "newConfig");
        this(r2);
        this.f22640b = r3;
    }
}
