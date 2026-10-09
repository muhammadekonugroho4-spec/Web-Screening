package androidx.compose.ui.text.style;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20299b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final j f20300c = null;
    public static final j d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final j f20301e = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f20302a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final j a(List r5) {
            int r02 = 0;
            Integer r1 = 0;
            int r2 = r5.size();
        L3:
            if (r02 >= r2) goto L6;
            j r3 = (j) r5.get(r02);
            r1 = Integer.valueOf(r1.intValue() | r3.e());
            r02 = r02 + 1;
            goto L3
        L6:
            return new j(r1.intValue());
        }

        public final j b() {
            return j.a();
        }

        public final j c() {
            return j.b();
        }

        public final j d() {
            return j.c();
        }

        public a() {
        }
    }

    static {
        f20299b = new a(null);
        f20300c = new j(0);
        d = new j(1);
        f20301e = new j(2);
    }

    public j(int r1) {
        this.f20302a = r1;
    }

    public static final /* synthetic */ j a() {
        return f20301e;
    }

    public static final /* synthetic */ j b() {
        return f20300c;
    }

    public static final /* synthetic */ j c() {
        return d;
    }

    public final boolean d(j r2) {
        int r02 = this.f20302a;
        if ((r2.f20302a | r02) != r02) goto L6;
        return true;
    L6:
        return false;
    }

    public final int e() {
        return this.f20302a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof j) == true) goto L9;
        return false;
    L9:
        if (this.f20302a == ((j) r4).f20302a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f20302a;
    }

    public String toString() {
        if (this.f20302a != 0) goto L6;
        return "TextDecoration.None";
    L6:
        ArrayList r1 = new ArrayList();
        if ((this.f20302a & d.f20302a) == 0) goto L10;
        r1.add("Underline");
    L10:
        if ((this.f20302a & f20301e.f20302a) == 0) goto L13;
        r1.add("LineThrough");
    L13:
        if (r1.size() != 1) goto L17;
        return "TextDecoration." + ((String) r1.get(0));
    L17:
        return "TextDecoration[" + androidx.compose.ui.util.c.e(r1, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
