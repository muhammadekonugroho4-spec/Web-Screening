package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes4.dex */
public class s {
    public static final ThreadLocal d = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f24121a;

    /* renamed from: b, reason: collision with root package name */
    public final q f24122b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f24123c;

    static {
        d = new ThreadLocal();
    }

    public s(q r2, int r3) {
        this.f24123c = 0;
        this.f24122b = r2;
        this.f24121a = r3;
    }

    public void a(Canvas r10, float r11, float r12, Paint r13) {
        Typeface r02 = this.f24122b.h();
        Typeface r1 = r13.getTypeface();
        r13.setTypeface(r02);
        int r4 = this.f24121a * 2;
        r10.drawText(this.f24122b.d(), r4, 2, r11, r12, r13);
        r13.setTypeface(r1);
    }

    public int b(int r2) {
        return g().h(r2);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f24123c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public final androidx.emoji2.text.flatbuffer.a g() {
        ThreadLocal r02 = d;
        androidx.emoji2.text.flatbuffer.a r1 = (androidx.emoji2.text.flatbuffer.a) r02.get();
        if (r1 != null) goto L5;
        r1 = new androidx.emoji2.text.flatbuffer.a();
        r02.set(r1);
    L5:
        this.f24122b.e().j(r1, this.f24121a);
        return r1;
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        if ((this.f24123c & 4) <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public void l(boolean r2) {
        int r02 = d();
        if (r2 == false) goto L6;
        this.f24123c = r02 | 4;
        return;
    L6:
        this.f24123c = r02;
    }

    public void m(boolean r2) {
        int r02 = this.f24123c & 4;
        if (r2 == false) goto L5;
        int r22 = r02 | 2;
    L6:
        this.f24123c = r22;
        return;
    L5:
        r22 = r02 | 1;
        goto L6
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(super.toString());
        r02.append(", id:");
        r02.append(Integer.toHexString(f()));
        r02.append(", codepoints:");
        int r1 = c();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        r02.append(Integer.toHexString(b(r2)));
        r02.append(" ");
        r2 = r2 + 1;
        goto L3
    L6:
        return r02.toString();
    }
}
