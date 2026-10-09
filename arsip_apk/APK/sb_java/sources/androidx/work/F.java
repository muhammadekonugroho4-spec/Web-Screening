package androidx.work;

import com.google.firebase.messaging.Constants;

/* loaded from: classes4.dex */
public abstract class F {
    public static final Object a(E r2, String r3, kotlin.jvm.functions.a r4) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        kotlin.jvm.internal.p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
        kotlin.jvm.internal.p.l(r4, "block");
        boolean r02 = r2.isEnabled();
        if (r02 == true) goto L18;
    L7:
        Object r32 = r4.invoke();     // Catch: Throwable -> L5
        kotlin.jvm.internal.n.b(1);
        if (r02 == false) goto L11;
        r2.d();
    L11:
        kotlin.jvm.internal.n.a(1);
        return r32;
    L5:
        th = move-exception;
        kotlin.jvm.internal.n.b(1);
        if (r02 == false) goto L16;
        r2.d();
    L16:
        kotlin.jvm.internal.n.a(1);
        throw th;
    L18:
        r2.a(r3);     // Catch: Throwable -> L5
        goto L7
    }
}
