package androidx.work.impl.constraints;

import kotlin.jvm.internal.i;

/* loaded from: classes4.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29350a = null;

        static {
            f29350a = new a();
        }

        public a() {
            super(null);
        }
    }

    /* renamed from: androidx.work.impl.constraints.b$b, reason: collision with other inner class name */
    public static final class C0276b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final int f29351a;

        public C0276b(int r2) {
            super(null);
            this.f29351a = r2;
        }

        public final int a() {
            return this.f29351a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0276b) == true) goto L9;
            return false;
        L9:
            if (this.f29351a == ((C0276b) r4).f29351a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f29351a);
        }

        public String toString() {
            return "ConstraintsNotMet(reason=" + this.f29351a + ')';
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
