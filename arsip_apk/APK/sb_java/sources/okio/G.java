package okio;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public static final G f182323a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f182324b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final F f182325c = null;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReference[] f182326e = null;

    static {
        f182323a = new G();
        f182324b = 65536;
        int r02 = 0;
        f182325c = new F(new byte[0], 0, 0, false, false);
        int r1 = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        d = r1;
        AtomicReference[] r2 = new AtomicReference[r1];
    L3:
        if (r02 >= r1) goto L5;
        r2[r02] = new AtomicReference();
        r02 = r02 + 1;
        goto L3
    L5:
        f182326e = r2;
    }

    public G() {
    }

    public static final void b(F r5) {
        kotlin.jvm.internal.p.l(r5, "segment");
        if (r5.f182321f != null) goto L23;
        if (r5.f182322g != null) goto L23;
        if (r5.d == true) goto L24;
        AtomicReference r02 = f182323a.a();
        F r1 = f182325c;
        F r2 = (F) r02.getAndSet(r1);
        if (r2 != r1) goto L13;
        return;
    L13:
        if (r2 == null) goto L15;
        int r3 = r2.f182319c;
    L17:
        if (r3 < f182324b) goto L20;
        r02.set(r2);
        return;
    L20:
        r5.f182321f = r2;
        r5.f182318b = 0;
        r5.f182319c = r3 + UserMetadata.MAX_INTERNAL_KEY_SIZE;
        r02.set(r5);
        return;
    L15:
        r3 = 0;
        goto L17
    L24:
        return;
    L23:
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final F c() {
        AtomicReference r02 = f182323a.a();
        F r1 = f182325c;
        F r2 = (F) r02.getAndSet(r1);
        if (r2 != r1) goto L7;
        return new F();
    L7:
        if (r2 != null) goto L10;
        r02.set(null);
        return new F();
    L10:
        r02.set(r2.f182321f);
        r2.f182321f = null;
        r2.f182319c = 0;
        return r2;
    }

    public final AtomicReference a() {
        return f182326e[(int) (Thread.currentThread().getId() & (d - 1))];
    }
}
