package androidx.glance.appwidget.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public final class S {

    /* renamed from: c, reason: collision with root package name */
    public static final S f25024c = null;
    public static boolean d;

    /* renamed from: a, reason: collision with root package name */
    public final X f25025a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f25026b;

    static {
        f25024c = new S();
        d = false;
    }

    public S() {
        this.f25026b = new ConcurrentHashMap();
        this.f25025a = new A();
    }

    public static S a() {
        return f25024c;
    }

    public W b(Class r2, W r3) {
        AbstractC3997u.b(r2, "messageType");
        AbstractC3997u.b(r3, "schema");
        return (W) this.f25026b.putIfAbsent(r2, r3);
    }

    public W c(Class r2) {
        AbstractC3997u.b(r2, "messageType");
        W r02 = (W) this.f25026b.get(r2);
        if (r02 != null) goto L7;
        r02 = this.f25025a.createSchema(r2);
        W r22 = b(r2, r02);
        if (r22 == null) goto L7;
        return r22;
    L7:
        return r02;
    }

    public W d(Object r1) {
        return c(r1.getClass());
    }
}
