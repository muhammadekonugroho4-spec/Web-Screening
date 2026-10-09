package androidx.compose.foundation.lazy.layout;

/* renamed from: androidx.compose.foundation.lazy.layout.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2628l {

    /* renamed from: androidx.compose.foundation.lazy.layout.l$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8786a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8787b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f8788c;

        static {
        }

        public a(int r2, int r3, Object r4) {
            this.f8786a = r2;
            this.f8787b = r3;
            this.f8788c = r4;
            boolean r42 = false;
            if (r2 < 0) goto L5;
            boolean r22 = true;
        L6:
            if (r22 == true) goto L8;
            androidx.compose.foundation.internal.e.a("startIndex should be >= 0");
        L8:
            if (r3 <= 0) goto L10;
            r42 = true;
        L10:
            if (r42 == true) goto L13;
            androidx.compose.foundation.internal.e.a("size should be > 0");
            return;
        L13:
            return;
        L5:
            r22 = false;
            goto L6
        }

        public final int a() {
            return this.f8787b;
        }

        public final int b() {
            return this.f8786a;
        }

        public final Object c() {
            return this.f8788c;
        }
    }

    void a(int r1, int r2, kotlin.jvm.functions.l r3);

    a get(int r1);

    int getSize();
}
