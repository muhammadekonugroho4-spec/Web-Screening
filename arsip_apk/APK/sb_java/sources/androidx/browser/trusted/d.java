package androidx.browser.trusted;

import android.os.IBinder;
import android.support.customtabs.trusted.a;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.customtabs.trusted.a f3907a;

    public d(android.support.customtabs.trusted.a r1) {
        this.f3907a = r1;
    }

    public static d a(IBinder r1) {
        if (r1 != null) goto L5;
        android.support.customtabs.trusted.a r12 = null;
    L6:
        if (r12 != null) goto L9;
        return null;
    L9:
        return new d(r12);
    L5:
        r12 = a.AbstractBinderC0010a.V(r1);
        goto L6
    }
}
