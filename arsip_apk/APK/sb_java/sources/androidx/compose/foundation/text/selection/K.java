package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.L;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.x1;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: g, reason: collision with root package name */
    public static final int f10816g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f10817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10818b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10819c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10820e;

    /* renamed from: f, reason: collision with root package name */
    public final x1 f10821f;

    static {
        f10816g = x1.f20364g;
    }

    public K(long r1, int r3, int r4, int r5, int r6, x1 r7) {
        this.f10817a = r1;
        this.f10818b = r3;
        this.f10819c = r4;
        this.d = r5;
        this.f10820e = r6;
        this.f10821f = r7;
    }

    public final L.a a(int r5) {
        return new L.a(AbstractC2931e0.a(this.f10821f, r5), r5, this.f10817a);
    }

    public final ResolvedTextDirection b() {
        return AbstractC2931e0.a(this.f10821f, this.d);
    }

    public final String c() {
        return this.f10821f.l().j().k();
    }

    public final CrossStatus d() {
        int r02 = this.f10819c;
        int r1 = this.d;
        if (r02 < r1) goto L5;
        if (r02 <= r1) goto L10;
        return CrossStatus.CROSSED;
    L10:
        return CrossStatus.COLLAPSED;
    L5:
        return CrossStatus.NOT_CROSSED;
    }

    public final int e() {
        return this.d;
    }

    public final int f() {
        return this.f10820e;
    }

    public final int g() {
        return this.f10819c;
    }

    public final long h() {
        return this.f10817a;
    }

    public final int i() {
        return this.f10818b;
    }

    public final ResolvedTextDirection j() {
        return AbstractC2931e0.a(this.f10821f, this.f10819c);
    }

    public final x1 k() {
        return this.f10821f;
    }

    public final int l() {
        return c().length();
    }

    public final boolean m(K r5) {
        if (this.f10817a == r5.f10817a) goto L5;
        return true;
    L5:
        if (this.f10819c == r5.f10819c) goto L7;
        return true;
    L7:
        if (this.d != r5.d) goto L14;
        return false;
    L14:
        return true;
    }

    public String toString() {
        return "SelectionInfo(id=" + this.f10817a + ", range=(" + this.f10819c + '-' + j() + ',' + this.d + '-' + b() + "), prevOffset=" + this.f10820e + ')';
    }
}
