package androidx.glance.appwidget.protobuf;

import androidx.glance.appwidget.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.glance.appwidget.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3990m {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C3990m f25105b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3990m f25106c = null;

    /* renamed from: a, reason: collision with root package name */
    public final Map f25107a;

    /* renamed from: androidx.glance.appwidget.protobuf.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f25108a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25109b;

        public a(Object r1, int r2) {
            this.f25108a = r1;
            this.f25109b = r2;
        }

        public boolean equals(Object r4) {
            if ((r4 instanceof a) == true) goto L5;
            return false;
        L5:
            a r42 = (a) r4;
            if (this.f25108a == r42.f25108a) goto L8;
        L11:
            return false;
        L8:
            if (this.f25109b != r42.f25109b) goto L11;
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f25108a) * 65535) + this.f25109b;
        }
    }

    static {
        f25106c = new C3990m(true);
    }

    public C3990m(boolean r1) {
        this.f25107a = Collections.EMPTY_MAP;
    }

    public static C3990m b() {
        if (S.d == true) goto L5;
        C3990m r02 = f25105b;
        if (r02 == null) goto L9;
        return r02;
    L9:
        monitor-enter(C3990m.class);
        C3990m r03 = f25105b;     // Catch: Throwable -> L13
        if (r03 != null) goto L15;
        r03 = AbstractC3989l.a();     // Catch: Throwable -> L13
        f25105b = r03;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C3990m.class);     // Catch: Throwable -> L13
        return r03;
    L13:
        th = move-exception;
        throw th;
    L5:
        return f25106c;
    }

    public GeneratedMessageLite.c a(H r3, int r4) {
        a.a.a.a.c.f.a(this.f25107a.get(new a(r3, r4)));
        return null;
    }
}
