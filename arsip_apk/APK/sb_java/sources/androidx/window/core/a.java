package androidx.window.core;

import android.util.Log;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f28866a = null;

    static {
        f28866a = new a();
    }

    public a() {
    }

    @Override // androidx.window.core.g
    public void debug(String r2, String r3) {
        p.l(r2, "tag");
        p.l(r3, "message");
        Log.d(r2, r3);
    }
}
