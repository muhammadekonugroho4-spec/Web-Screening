package androidx.core.app;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22700a;

    /* renamed from: b, reason: collision with root package name */
    public Configuration f22701b;

    public v(boolean r1) {
        this.f22700a = r1;
    }

    public final boolean a() {
        return this.f22700a;
    }

    public v(boolean r2, Configuration r3) {
        kotlin.jvm.internal.p.l(r3, "newConfig");
        this(r2);
        this.f22701b = r3;
    }
}
