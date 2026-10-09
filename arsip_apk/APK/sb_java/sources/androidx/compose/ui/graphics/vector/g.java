package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g {
    public static final void a(char r11, ArrayList r12, float[] r13, int r14) {
        int r1 = 0;
        switch(r11) {
            case 65: goto L65;
            case 67: goto L62;
            case 72: goto L59;
            case 76: goto L56;
            case 77: goto L54;
            case 81: goto L51;
            case 83: goto L48;
            case 84: goto L45;
            case 86: goto L42;
            case 90: goto L40;
            case 97: goto L29;
            case 99: goto L26;
            case 104: goto L23;
            case 108: goto L20;
            case 109: goto L18;
            case 113: goto L15;
            case 115: goto L12;
            case 116: goto L9;
            case 118: goto L6;
            case 122: goto L40;
            default: goto L5;
        };
    L6:
        int r142 = r14 - 1;
    L7:
        if (r1 > r142) goto L76;
        r12.add(new f.r(r13[r1]));
        r1 = r1 + 1;
        goto L7
    L76:
        return;
    L9:
        int r143 = r14 - 2;
    L10:
        if (r1 > r143) goto L97;
        r12.add(new f.q(r13[r1], r13[r1 + 1]));
        r1 = r1 + 2;
        goto L10
    L97:
        return;
    L12:
        int r144 = r14 - 4;
    L13:
        if (r1 > r144) goto L98;
        r12.add(new f.p(r13[r1], r13[r1 + 1], r13[r1 + 2], r13[r1 + 3]));
        r1 = r1 + 4;
        goto L13
    L98:
        return;
    L15:
        int r145 = r14 - 4;
    L16:
        if (r1 > r145) goto L99;
        r12.add(new f.o(r13[r1], r13[r1 + 1], r13[r1 + 2], r13[r1 + 3]));
        r1 = r1 + 4;
        goto L16
    L99:
        return;
    L18:
        c(r12, r13, r14);
        return;
    L20:
        int r146 = r14 - 2;
    L21:
        if (r1 > r146) goto L100;
        r12.add(new f.m(r13[r1], r13[r1 + 1]));
        r1 = r1 + 2;
        goto L21
    L100:
        return;
    L23:
        int r147 = r14 - 1;
    L24:
        if (r1 > r147) goto L101;
        r12.add(new f.l(r13[r1]));
        r1 = r1 + 1;
        goto L24
    L101:
        return;
    L26:
        int r148 = r14 - 6;
    L27:
        if (r1 > r148) goto L102;
        r12.add(new f.k(r13[r1], r13[r1 + 1], r13[r1 + 2], r13[r1 + 3], r13[r1 + 4], r13[r1 + 5]));
        r1 = r1 + 6;
        goto L27
    L102:
        return;
    L29:
        int r149 = r14 - 7;
        int r112 = 0;
    L30:
        if (r112 > r149) goto L103;
        float r4 = r13[r112];
        float r5 = r13[r112 + 1];
        float r6 = r13[r112 + 2];
        if (Float.compare(r13[r112 + 3], 0.0f) == 0) goto L34;
        boolean r7 = true;
    L36:
        if (Float.compare(r13[r112 + 4], 0.0f) == 0) goto L38;
        boolean r8 = true;
    L39:
        r12.add(new f.j(r4, r5, r6, r7, r8, r13[r112 + 5], r13[r112 + 6]));
        r112 = r112 + 7;
        goto L30
    L38:
        r8 = false;
        goto L39
    L34:
        r7 = false;
        goto L36
    L103:
        return;
    L40:
        r12.add(f.b.f17789c);
        return;
    L42:
        int r1410 = r14 - 1;
    L43:
        if (r1 > r1410) goto L104;
        r12.add(new f.s(r13[r1]));
        r1 = r1 + 1;
        goto L43
    L104:
        return;
    L45:
        int r1411 = r14 - 2;
    L46:
        if (r1 > r1411) goto L105;
        r12.add(new f.i(r13[r1], r13[r1 + 1]));
        r1 = r1 + 2;
        goto L46
    L105:
        return;
    L48:
        int r1412 = r14 - 4;
    L49:
        if (r1 > r1412) goto L106;
        r12.add(new f.h(r13[r1], r13[r1 + 1], r13[r1 + 2], r13[r1 + 3]));
        r1 = r1 + 4;
        goto L49
    L106:
        return;
    L51:
        int r1413 = r14 - 4;
    L52:
        if (r1 > r1413) goto L107;
        r12.add(new f.g(r13[r1], r13[r1 + 1], r13[r1 + 2], r13[r1 + 3]));
        r1 = r1 + 4;
        goto L52
    L107:
        return;
    L54:
        b(r12, r13, r14);
        return;
    L56:
        int r1414 = r14 - 2;
    L57:
        if (r1 > r1414) goto L108;
        r12.add(new f.e(r13[r1], r13[r1 + 1]));
        r1 = r1 + 2;
        goto L57
    L108:
        return;
    L59:
        int r1415 = r14 - 1;
    L60:
        if (r1 > r1415) goto L109;
        r12.add(new f.d(r13[r1]));
        r1 = r1 + 1;
        goto L60
    L109:
        return;
    L62:
        int r1416 = r14 - 6;
    L63:
        if (r1 > r1416) goto L110;
        r12.add(new f.c(r13[r1], r13[r1 + 1], r13[r1 + 2], r13[r1 + 3], r13[r1 + 4], r13[r1 + 5]));
        r1 = r1 + 6;
        goto L63
    L110:
        return;
    L65:
        int r1417 = r14 - 7;
        int r113 = 0;
    L66:
        if (r113 > r1417) goto L111;
        float r42 = r13[r113];
        float r52 = r13[r113 + 1];
        float r62 = r13[r113 + 2];
        if (Float.compare(r13[r113 + 3], 0.0f) == 0) goto L70;
        boolean r72 = true;
    L72:
        if (Float.compare(r13[r113 + 4], 0.0f) == 0) goto L74;
        boolean r82 = true;
    L75:
        r12.add(new f.a(r42, r52, r62, r72, r82, r13[r113 + 5], r13[r113 + 6]));
        r113 = r113 + 7;
        goto L66
    L74:
        r82 = false;
        goto L75
    L70:
        r72 = false;
        goto L72
    L111:
        return;
    L5:
        throw new IllegalArgumentException("Unknown command for: " + r11);
    }

    public static final void b(List r4, float[] r5, int r6) {
        int r02 = 2;
        int r62 = r6 - 2;
        if (r62 < 0) goto L7;
        r4.add(new f.C0124f(r5[0], r5[1]));
    L5:
        if (r02 > r62) goto L9;
        r4.add(new f.e(r5[r02], r5[r02 + 1]));
        r02 = r02 + 2;
        goto L5
    L9:
        return;
    }

    public static final void c(List r4, float[] r5, int r6) {
        int r02 = 2;
        int r62 = r6 - 2;
        if (r62 < 0) goto L7;
        r4.add(new f.n(r5[0], r5[1]));
    L5:
        if (r02 > r62) goto L9;
        r4.add(new f.m(r5[r02], r5[r02 + 1]));
        r02 = r02 + 2;
        goto L5
    L9:
        return;
    }
}
