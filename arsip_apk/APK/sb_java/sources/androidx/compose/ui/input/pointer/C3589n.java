package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* renamed from: androidx.compose.ui.input.pointer.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3589n {

    /* renamed from: a, reason: collision with root package name */
    public final List f18144a;

    /* renamed from: b, reason: collision with root package name */
    public final C3579d f18145b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18146c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18147e;

    /* renamed from: f, reason: collision with root package name */
    public int f18148f;

    static {
    }

    public C3589n(List r2, C3579d r3) {
        this.f18144a = r2;
        this.f18145b = r3;
        int r02 = 0;
        if (Build.VERSION.SDK_INT < 29) goto L7;
        MotionEvent r22 = g();
        if (r22 == null) goto L7;
        int r23 = AbstractC3588m.a(r22);
    L8:
        this.f18146c = r23;
        MotionEvent r24 = g();
        if (r24 == null) goto L11;
        int r25 = r24.getButtonState();
    L12:
        this.d = AbstractC3587l.a(r25);
        MotionEvent r26 = g();
        if (r26 == null) goto L15;
        r02 = r26.getMetaState();
    L15:
        this.f18147e = I.b(r02);
        this.f18148f = a();
        return;
    L11:
        r25 = 0;
    L7:
        r23 = 0;
        goto L8
    }

    public final int a() {
        MotionEvent r02 = g();
        if (r02 == null) goto L25;
        int r03 = r02.getActionMasked();
        if (r03 == 0) goto L24;
        if (r03 == 1) goto L22;
        if (r03 == 2) goto L20;
        switch(r03) {
            case 5: goto L24;
            case 6: goto L22;
            case 7: goto L20;
            case 8: goto L18;
            case 9: goto L16;
            case 10: goto L14;
            default: goto L12;
        };
    L12:
        return AbstractC3591p.f18149a.g();
    L14:
        return AbstractC3591p.f18149a.b();
    L16:
        return AbstractC3591p.f18149a.a();
    L18:
        return AbstractC3591p.f18149a.f();
    L20:
        return AbstractC3591p.f18149a.c();
    L22:
        return AbstractC3591p.f18149a.e();
    L24:
        return AbstractC3591p.f18149a.d();
    L25:
        List r04 = this.f18144a;
        int r1 = r04.size();
        int r2 = 0;
    L26:
        if (r2 >= r1) goto L37;
        y r3 = (y) r04.get(r2);
        if (AbstractC3590o.d(r3) == true) goto L30;
        if (AbstractC3590o.b(r3) == true) goto L34;
        r2 = r2 + 1;
        goto L26
    L34:
        return AbstractC3591p.f18149a.d();
    L30:
        return AbstractC3591p.f18149a.e();
    L37:
        return AbstractC3591p.f18149a.c();
    }

    public final int b() {
        return this.d;
    }

    public final List c() {
        return this.f18144a;
    }

    public final int d() {
        return this.f18146c;
    }

    public final C3579d e() {
        return this.f18145b;
    }

    public final int f() {
        return this.f18147e;
    }

    public final MotionEvent g() {
        C3579d r02 = this.f18145b;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.c();
    }

    public final int h() {
        return this.f18148f;
    }

    public final void i(int r1) {
        this.f18148f = r1;
    }

    public C3589n(List r2) {
        this(r2, null);
    }
}
