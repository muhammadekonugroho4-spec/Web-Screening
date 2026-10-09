package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C4125a;
import java.util.List;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final a f27615a;

    public interface a {
        C4125a.b a(int r1, int r2, int r3, Object r4);

        void b(C4125a.b r1);
    }

    public v(a r1) {
        this.f27615a = r1;
    }

    public final int a(List r6) {
        int r02 = r6.size() - 1;
        boolean r2 = false;
    L3:
        if (r02 < 0) goto L10;
        if (((C4125a.b) r6.get(r02)).f27376a != 8) goto L8;
        if (r2 == false) goto L9;
        return r02;
    L9:
        r02 = r02 - 1;
        goto L3
    L8:
        r2 = true;
        goto L9
    L10:
        return -1;
    }

    public void b(List r3) {
    L2:
        int r02 = a(r3);
        if (r02 == (-1)) goto L5;
        d(r3, r02, r02 + 1);
        goto L2
    }

    public final void c(List r5, int r6, C4125a.b r7, int r8, C4125a.b r9) {
        int r02 = r7.d;
        int r1 = r9.f27377b;
        if (r02 >= r1) goto L5;
        int r2 = -1;
    L6:
        int r3 = r7.f27377b;
        if (r3 >= r1) goto L9;
        r2 = r2 + 1;
    L9:
        if (r1 > r3) goto L11;
        r7.f27377b = r3 + r9.d;
    L11:
        int r12 = r9.f27377b;
        if (r12 > r02) goto L14;
        r7.d = r02 + r9.d;
    L14:
        r9.f27377b = r12 + r2;
        r5.set(r6, r9);
        r5.set(r8, r7);
        return;
    L5:
        r2 = 0;
        goto L6
    }

    public final void d(List r8, int r9, int r10) {
        C4125a.b r4 = (C4125a.b) r8.get(r9);
        C4125a.b r6 = (C4125a.b) r8.get(r10);
        int r02 = r6.f27376a;
        if (r02 != 1) goto L5;
        c(r8, r9, r4, r10, r6);
        return;
    L5:
        if (r02 != 2) goto L7;
        e(r8, r9, r4, r10, r6);
        return;
    L7:
        if (r02 == 4) goto L9;
        return;
    L9:
        f(r8, r9, r4, r10, r6);
    }

    public void e(List r10, int r11, C4125a.b r12, int r13, C4125a.b r14) {
        int r02 = r12.f27377b;
        int r1 = r12.d;
        boolean r3 = false;
        if (r02 >= r1) goto L11;
        if (r14.f27377b == r02) goto L7;
    L9:
        boolean r03 = false;
    L16:
        int r4 = r14.f27377b;
        if (r1 >= r4) goto L19;
        r14.f27377b = r4 - 1;
    L25:
        int r15 = r12.f27377b;
        int r42 = r14.f27377b;
        C4125a.b r6 = null;
        if (r15 > r42) goto L28;
        r14.f27377b = r42 + 1;
    L31:
        if (r3 == false) goto L34;
        r10.set(r11, r14);
        r10.remove(r13);
        this.f27615a.b(r12);
        return;
    L34:
        if (r03 == false) goto L48;
        if (r6 == null) goto L42;
        int r04 = r12.f27377b;
        if (r04 <= r6.f27377b) goto L39;
        r12.f27377b = r04 - r6.d;
    L39:
        int r05 = r12.d;
        if (r05 <= r6.f27377b) goto L42;
        r12.d = r05 - r6.d;
    L42:
        int r06 = r12.f27377b;
        if (r06 <= r14.f27377b) goto L45;
        r12.f27377b = r06 - r14.d;
    L45:
        int r07 = r12.d;
        if (r07 <= r14.f27377b) goto L61;
        r12.d = r07 - r14.d;
    L61:
        r10.set(r11, r14);
        if (r12.f27377b == r12.d) goto L64;
        r10.set(r13, r12);
    L65:
        if (r6 == null) goto L69;
        r10.add(r11, r6);
        return;
    L69:
        return;
    L64:
        r10.remove(r13);
        goto L65
    L48:
        if (r6 == null) goto L55;
        int r08 = r12.f27377b;
        if (r08 < r6.f27377b) goto L52;
        r12.f27377b = r08 - r6.d;
    L52:
        int r09 = r12.d;
        if (r09 < r6.f27377b) goto L55;
        r12.d = r09 - r6.d;
    L55:
        int r010 = r12.f27377b;
        if (r010 < r14.f27377b) goto L58;
        r12.f27377b = r010 - r14.d;
    L58:
        int r011 = r12.d;
        if (r011 < r14.f27377b) goto L61;
        r12.d = r011 - r14.d;
        goto L61
    L28:
        int r7 = r14.d;
        if (r15 >= (r42 + r7)) goto L31;
        r6 = this.f27615a.a(2, r15 + 1, (r42 + r7) - r15, null);
        r14.d = r12.f27377b - r14.f27377b;
        goto L31
    L19:
        int r62 = r14.d;
        if (r1 >= (r4 + r62)) goto L25;
        r14.d = r62 - 1;
        r12.f27376a = 2;
        r12.d = 1;
        if (r14.d != 0) goto L68;
        r10.remove(r13);
        this.f27615a.b(r14);
        return;
    L68:
        return;
    L7:
        if (r14.d != (r1 - r02)) goto L9;
        r03 = false;
        r3 = true;
        goto L16
    L11:
        if (r14.f27377b == (r1 + 1)) goto L13;
    L15:
        r03 = true;
        goto L16
    L13:
        if (r14.d != (r02 - r1)) goto L15;
        r03 = true;
        r3 = true;
        goto L16
    }

    public void f(List r9, int r10, C4125a.b r11, int r12, C4125a.b r13) {
        int r02 = r11.d;
        int r1 = r13.f27377b;
        C4125a.b r4 = null;
        if (r02 >= r1) goto L5;
        r13.f27377b = r1 - 1;
    L8:
        C4125a.b r03 = null;
    L9:
        int r14 = r11.f27377b;
        int r5 = r13.f27377b;
        if (r14 > r5) goto L12;
        r13.f27377b = r5 + 1;
    L15:
        r9.set(r12, r11);
        if (r13.d <= 0) goto L18;
        r9.set(r10, r13);
    L19:
        if (r03 == null) goto L21;
        r9.add(r10, r03);
    L21:
        if (r4 == null) goto L24;
        r9.add(r10, r4);
        return;
    L24:
        return;
    L18:
        r9.remove(r10);
        this.f27615a.b(r13);
        goto L19
    L12:
        int r6 = r13.d;
        if (r14 >= (r5 + r6)) goto L15;
        int r52 = (r5 + r6) - r14;
        r4 = this.f27615a.a(4, r14 + 1, r52, r13.f27378c);
        r13.d -= r52;
        goto L15
    L5:
        int r53 = r13.d;
        if (r02 >= (r1 + r53)) goto L8;
        r13.d = r53 - 1;
        r03 = this.f27615a.a(4, r11.f27377b, 1, r13.f27378c);
        goto L9
    }
}
