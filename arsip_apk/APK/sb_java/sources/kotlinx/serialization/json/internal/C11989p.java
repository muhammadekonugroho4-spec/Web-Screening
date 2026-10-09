package kotlinx.serialization.json.internal;

import com.clevertap.android.sdk.Constants;
import java.util.Map;

/* renamed from: kotlinx.serialization.json.internal.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11989p {

    /* renamed from: a, reason: collision with root package name */
    public final Map f180877a;

    /* renamed from: kotlinx.serialization.json.internal.p$a */
    public static final class a {
        public a() {
        }
    }

    public C11989p() {
        this.f180877a = AbstractC11988o.a(16);
    }

    public final Object a(kotlinx.serialization.descriptors.f r2, a r3) {
        kotlin.jvm.internal.p.l(r2, "descriptor");
        kotlin.jvm.internal.p.l(r3, Constants.KEY_KEY);
        Map r22 = (Map) this.f180877a.get(r2);
        if (r22 == null) goto L5;
        Object r23 = r22.get(r3);
    L6:
        if (r23 != null) goto L8;
        return null;
    L8:
        return r23;
    L5:
        r23 = null;
        goto L6
    }

    public final Object b(kotlinx.serialization.descriptors.f r2, a r3, kotlin.jvm.functions.a r4) {
        kotlin.jvm.internal.p.l(r2, "descriptor");
        kotlin.jvm.internal.p.l(r3, Constants.KEY_KEY);
        kotlin.jvm.internal.p.l(r4, "defaultValue");
        Object r02 = a(r2, r3);
        if (r02 == null) goto L5;
        return r02;
    L5:
        Object r42 = r4.invoke();
        c(r2, r3, r42);
        return r42;
    }

    public final void c(kotlinx.serialization.descriptors.f r3, a r4, Object r5) {
        kotlin.jvm.internal.p.l(r3, "descriptor");
        kotlin.jvm.internal.p.l(r4, Constants.KEY_KEY);
        kotlin.jvm.internal.p.l(r5, "value");
        Map r02 = this.f180877a;
        Object r1 = r02.get(r3);
        if (r1 != null) goto L5;
        r1 = AbstractC11988o.a(2);
        r02.put(r3, r1);
    L5:
        ((Map) r1).put(r4, r5);
    }
}
