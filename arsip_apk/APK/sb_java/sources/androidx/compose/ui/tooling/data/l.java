package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.s;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f20559a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20560b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20561c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20562e;

    /* renamed from: f, reason: collision with root package name */
    public final List f20563f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20564g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20565h;

    /* renamed from: i, reason: collision with root package name */
    public int f20566i;

    public l(String r1, String r2, int r3, List r4, int r5, List r6, boolean r7, boolean r8) {
        this.f20559a = r1;
        this.f20560b = r2;
        this.f20561c = r3;
        this.d = r4;
        this.f20562e = r5;
        this.f20563f = r6;
        this.f20564g = r7;
        this.f20565h = r8;
    }

    public final String a() {
        return this.f20559a;
    }

    public final int b() {
        return this.f20561c;
    }

    public final List c() {
        return this.f20563f;
    }

    public final String d() {
        return this.f20560b;
    }

    public final boolean e() {
        return this.f20564g;
    }

    public final boolean f() {
        return this.f20565h;
    }

    public final m g() {
        if (this.f20566i < this.d.size()) goto L8;
        int r02 = this.f20562e;
        if (r02 < 0) goto L8;
        this.f20566i = r02;
    L8:
        if (this.f20566i >= this.d.size()) goto L11;
        List r03 = this.d;
        int r1 = this.f20566i;
        this.f20566i = r1 + 1;
        s r04 = (s) r03.get(r1);
        return new m(r04.b(), r04.c(), r04.a(), this.f20560b, this.f20561c);
    L11:
        return null;
    }

    public final m h(int r9, l r10) {
        if (r9 < this.d.size()) goto L9;
        int r02 = this.f20562e;
        if (r02 < 0) goto L9;
        if (r02 >= this.d.size()) goto L9;
        int r92 = r9 - this.f20562e;
        int r03 = this.d.size();
        int r1 = this.f20562e;
        r9 = (r92 % (r03 - r1)) + r1;
    L9:
        Integer r12 = null;
        if (r9 >= this.d.size()) goto L28;
        s r93 = (s) this.d.get(r9);
        int r3 = r93.b();
        int r4 = r93.c();
        int r5 = r93.a();
        String r94 = this.f20560b;
        if (r94 != null) goto L16;
        if (r10 == null) goto L15;
        String r6 = r10.f20560b;
    L17:
        if (r94 != null) goto L21;
        if (r10 == null) goto L22;
        int r95 = r10.f20561c;
    L20:
        r12 = Integer.valueOf(r95);
    L22:
        if (r12 == null) goto L25;
        int r96 = r12.intValue();
    L27:
        return new m(r3, r4, r5, r6, r96);
    L25:
        r96 = -1;
        goto L27
    L21:
        r95 = this.f20561c;
        goto L20
    L15:
        r6 = null;
        goto L17
    L16:
        r6 = r94;
        goto L17
    L28:
        return null;
    }
}
