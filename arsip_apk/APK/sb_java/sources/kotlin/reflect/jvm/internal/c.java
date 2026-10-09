package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.l f177698a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f177699b;

    public c(kotlin.jvm.functions.l r2) {
        kotlin.jvm.internal.p.l(r2, "compute");
        this.f177698a = r2;
        this.f177699b = new ConcurrentHashMap();
    }

    @Override // kotlin.reflect.jvm.internal.a
    public Object a(Class r3) {
        kotlin.jvm.internal.p.l(r3, Constants.KEY_KEY);
        ConcurrentHashMap r02 = this.f177699b;
        Object r1 = r02.get(r3);
        if (r1 != null) goto L8;
        Object r12 = this.f177698a.invoke(r3);
        Object r32 = r02.putIfAbsent(r3, r12);
        if (r32 != null) goto L7;
        return r12;
    L7:
        return r32;
    L8:
        return r1;
    }
}
