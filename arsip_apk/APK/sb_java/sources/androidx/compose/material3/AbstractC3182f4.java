package androidx.compose.material3;

import androidx.compose.ui.e;

/* renamed from: androidx.compose.material3.f4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3182f4 {

    /* renamed from: androidx.compose.material3.f4$a */
    public static final class a extends AbstractC3182f4 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13544a;

        /* renamed from: b, reason: collision with root package name */
        public final e.b f13545b;

        /* renamed from: c, reason: collision with root package name */
        public final e.b f13546c;

        static {
        }

        public /* synthetic */ a(boolean r1, e.b r2, e.b r3, int r4, kotlin.jvm.internal.i r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = false;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = androidx.compose.ui.e.f16938a.k();
        L9:
            if ((r4 & 4) == 0) goto L11;
            r3 = androidx.compose.ui.e.f16938a.k();
        L11:
            this(r1, r2, r3);
        }

        public final boolean a() {
            return this.f13544a;
        }

        public final e.b b() {
            return this.f13546c;
        }

        public final e.b c() {
            return this.f13545b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f13544a == r52.f13544a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f13545b, r52.f13545b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f13546c, r52.f13546c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f13544a) * 31) + this.f13545b.hashCode()) * 31) + this.f13546c.hashCode();
        }

        public String toString() {
            return "Attached(alwaysMinimize=" + this.f13544a + ", minimizedAlignment=" + this.f13545b + ", expandedAlignment=" + this.f13546c + ')';
        }

        public a(boolean r2, e.b r3, e.b r4) {
            super(null);
            this.f13544a = r2;
            this.f13545b = r3;
            this.f13546c = r4;
        }
    }

    static {
    }

    public /* synthetic */ AbstractC3182f4(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC3182f4() {
    }
}
