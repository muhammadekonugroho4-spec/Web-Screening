package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.F1;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final a f10823a;

    /* renamed from: b, reason: collision with root package name */
    public final a f10824b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10825c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ResolvedTextDirection f10826a;

        /* renamed from: b, reason: collision with root package name */
        public final int f10827b;

        /* renamed from: c, reason: collision with root package name */
        public final long f10828c;

        static {
        }

        public a(ResolvedTextDirection r1, int r2, long r3) {
            this.f10826a = r1;
            this.f10827b = r2;
            this.f10828c = r3;
        }

        public static /* synthetic */ a b(a r02, ResolvedTextDirection r1, int r2, long r3, int r5, Object r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = r02.f10826a;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r2 = r02.f10827b;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r3 = r02.f10828c;
        L12:
            return r02.a(r1, r2, r3);
        }

        public final a a(ResolvedTextDirection r2, int r3, long r4) {
            return new a(r2, r3, r4);
        }

        public final int c() {
            return this.f10827b;
        }

        public final long d() {
            return this.f10828c;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof a) == true) goto L8;
            return false;
        L8:
            a r82 = (a) r8;
            if (this.f10826a == r82.f10826a) goto L12;
            return false;
        L12:
            if (this.f10827b == r82.f10827b) goto L15;
            return false;
        L15:
            if (this.f10828c == r82.f10828c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f10826a.hashCode() * 31) + Integer.hashCode(this.f10827b)) * 31) + Long.hashCode(this.f10828c);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.f10826a + ", offset=" + this.f10827b + ", selectableId=" + this.f10828c + ')';
        }
    }

    static {
    }

    public L(a r1, a r2, boolean r3) {
        this.f10823a = r1;
        this.f10824b = r2;
        this.f10825c = r3;
    }

    public static /* synthetic */ L b(L r02, a r1, a r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f10823a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f10824b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f10825c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final L a(a r2, a r3, boolean r4) {
        return new L(r2, r3, r4);
    }

    public final a c() {
        return this.f10824b;
    }

    public final boolean d() {
        return this.f10825c;
    }

    public final a e() {
        return this.f10823a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof L) == true) goto L8;
        return false;
    L8:
        L r52 = (L) r5;
        if (kotlin.jvm.internal.p.g(this.f10823a, r52.f10823a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f10824b, r52.f10824b) == true) goto L15;
        return false;
    L15:
        if (this.f10825c == r52.f10825c) goto L17;
        return false;
    L17:
        return true;
    }

    public final long f() {
        return F1.b(this.f10823a.c(), this.f10824b.c());
    }

    public int hashCode() {
        return (((this.f10823a.hashCode() * 31) + this.f10824b.hashCode()) * 31) + Boolean.hashCode(this.f10825c);
    }

    public String toString() {
        return "Selection(start=" + this.f10823a + ", end=" + this.f10824b + ", handlesCrossed=" + this.f10825c + ')';
    }
}
