package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3923m {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f23869b = true;

    /* renamed from: c, reason: collision with root package name */
    public static final Class f23870c = null;
    public static volatile C3923m d;

    /* renamed from: e, reason: collision with root package name */
    public static final C3923m f23871e = null;

    /* renamed from: a, reason: collision with root package name */
    public final Map f23872a;

    /* renamed from: androidx.datastore.preferences.protobuf.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f23873a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23874b;

        public a(Object r1, int r2) {
            this.f23873a = r1;
            this.f23874b = r2;
        }

        public boolean equals(Object r4) {
            if ((r4 instanceof a) == true) goto L5;
            return false;
        L5:
            a r42 = (a) r4;
            if (this.f23873a == r42.f23873a) goto L8;
        L11:
            return false;
        L8:
            if (this.f23874b != r42.f23874b) goto L11;
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f23873a) * 65535) + this.f23874b;
        }
    }

    static {
        f23870c = c();
        f23871e = new C3923m(true);
    }

    public C3923m(boolean r1) {
        this.f23872a = Collections.EMPTY_MAP;
    }

    public static C3923m b() {
        C3923m r02 = d;
        if (r02 == null) goto L5;
        return r02;
    L5:
        monitor-enter(C3923m.class);
        C3923m r03 = d;     // Catch: Throwable -> L11
        if (r03 == null) goto L9;
    L15:
        monitor-exit(C3923m.class);     // Catch: Throwable -> L11
        return r03;
    L9:
        if (f23869b == false) goto L13;
        r03 = AbstractC3922l.a();     // Catch: Throwable -> L11
    L14:
        d = r03;     // Catch: Throwable -> L11
        goto L15
    L13:
        r03 = f23871e;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    public static Class c() {
        return Class.forName("androidx.datastore.preferences.protobuf.Extension");
    L4:
        return null;
    }

    public GeneratedMessageLite.c a(H r3, int r4) {
        a.a.a.a.c.f.a(this.f23872a.get(new a(r3, r4)));
        return null;
    }
}
