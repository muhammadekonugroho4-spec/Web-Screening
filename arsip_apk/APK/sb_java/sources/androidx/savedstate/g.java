package androidx.savedstate;

import android.os.Bundle;
import androidx.savedstate.b;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.savedstate.internal.b f28021a;

    /* renamed from: b, reason: collision with root package name */
    public b.C0252b f28022b;

    public interface a {
        void a(j r1);
    }

    public interface b {
        Bundle a();
    }

    public g(androidx.savedstate.internal.b r2) {
        p.l(r2, "impl");
        this.f28021a = r2;
    }

    public final Bundle a(String r2) {
        p.l(r2, Constants.KEY_KEY);
        return this.f28021a.c(r2);
    }

    public final b b(String r2) {
        p.l(r2, Constants.KEY_KEY);
        return this.f28021a.d(r2);
    }

    public final void c(String r2, b r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "provider");
        this.f28021a.j(r2, r3);
    }

    public final void d(Class r5) {
        p.l(r5, "clazz");
        if (this.f28021a.e() == false) goto L17;
        b.C0252b r02 = this.f28022b;
        if (r02 != null) goto L7;
        r02 = new b.C0252b(this);
    L7:
        this.f28022b = r02;
        r5.getDeclaredConstructor(null);     // Catch: NoSuchMethodException -> L13
        b.C0252b r03 = this.f28022b;
        if (r03 == null) goto L20;
        String r52 = r5.getName();
        p.k(r52, "getName(...)");
        r03.b(r52);
        return;
    L20:
        return;
    L13:
        e = move-exception;
        throw new IllegalArgumentException("Class " + r5.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
    L17:
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public final void e(String r2) {
        p.l(r2, Constants.KEY_KEY);
        this.f28021a.k(r2);
    }
}
