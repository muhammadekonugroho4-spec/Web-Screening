package kotlin.ranges;

import java.util.Iterator;
import kotlin.collections.AbstractC11775t;

/* loaded from: classes3.dex */
public abstract class a implements Iterable, kotlin.jvm.internal.markers.a {
    public static final C1868a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final char f177535a;

    /* renamed from: b, reason: collision with root package name */
    public final char f177536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f177537c;

    /* renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    public static final class C1868a {
        public /* synthetic */ C1868a(kotlin.jvm.internal.i r1) {
            this();
        }

        public C1868a() {
        }
    }

    static {
        d = new C1868a(null);
    }

    public a(char r2, char r3, int r4) {
        if (r4 == 0) goto L11;
        if (r4 == Integer.MIN_VALUE) goto L9;
        this.f177535a = r2;
        this.f177536b = (char) kotlin.internal.c.c(r2, r3, r4);
        this.f177537c = r4;
        return;
    L9:
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    L11:
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final char e() {
        return this.f177535a;
    }

    public final char f() {
        return this.f177536b;
    }

    public AbstractC11775t g() {
        return new b(this.f177535a, this.f177536b, this.f177537c);
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return g();
    }
}
