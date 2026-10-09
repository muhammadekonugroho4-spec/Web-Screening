package androidx.customview.widget;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes4.dex */
public abstract class b {

    public interface a {
        void a(Object r1, Rect r2);
    }

    /* renamed from: androidx.customview.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC0186b {
        Object a(Object r1, int r2);

        int b(Object r1);
    }

    public static class c implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f23550a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f23551b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f23552c;
        public final a d;

        public c(boolean r2, a r3) {
            this.f23550a = new Rect();
            this.f23551b = new Rect();
            this.f23552c = r2;
            this.d = r3;
        }

        @Override // java.util.Comparator
        public int compare(Object r5, Object r6) {
            Rect r02 = this.f23550a;
            Rect r1 = this.f23551b;
            this.d.a(r5, r02);
            this.d.a(r6, r1);
            int r52 = r02.top;
            int r62 = r1.top;
            if (r52 >= r62) goto L6;
            return -1;
        L6:
            if (r52 <= r62) goto L8;
            return 1;
        L8:
            int r53 = r02.left;
            int r63 = r1.left;
            if (r53 < r63) goto L11;
            if (r53 > r63) goto L16;
            int r54 = r02.bottom;
            int r64 = r1.bottom;
            if (r54 >= r64) goto L22;
            return -1;
        L22:
            if (r54 <= r64) goto L24;
            return 1;
        L24:
            int r55 = r02.right;
            int r65 = r1.right;
            if (r55 < r65) goto L27;
            if (r55 > r65) goto L32;
            return 0;
        L32:
            if (this.f23552c == false) goto L34;
            return -1;
        L34:
            return 1;
        L27:
            if (this.f23552c == false) goto L29;
            return 1;
        L29:
            return -1;
        L16:
            if (this.f23552c == false) goto L18;
            return -1;
        L18:
            return 1;
        L11:
            if (this.f23552c == false) goto L13;
            return 1;
        L13:
            return -1;
        }
    }

    public static boolean a(int r3, Rect r4, Rect r5, Rect r6) {
        boolean r02 = b(r3, r4, r5);
        if (b(r3, r4, r6) == true) goto L19;
        if (r02 == false) goto L19;
        if (j(r3, r4, r6) == true) goto L10;
        return true;
    L10:
        if (r3 != 17) goto L12;
    L18:
        return true;
    L12:
        if (r3 == 66) goto L18;
        if (k(r3, r4, r5) >= m(r3, r4, r6)) goto L17;
        return true;
    L17:
        return false;
    L19:
        return false;
    }

    public static boolean b(int r3, Rect r4, Rect r5) {
        if (r3 == 17) goto L20;
        if (r3 == 33) goto L14;
        if (r3 == 66) goto L20;
        if (r3 == 130) goto L14;
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L14:
        if (r5.right >= r4.left) goto L16;
    L18:
        return false;
    L16:
        if (r5.left > r4.right) goto L18;
        return true;
    L20:
        if (r5.bottom >= r4.top) goto L22;
    L24:
        return false;
    L22:
        if (r5.top > r4.bottom) goto L24;
        return true;
    }

    public static Object c(Object r7, InterfaceC0186b r8, a r9, Object r10, Rect r11, int r12) {
        Rect r02 = new Rect(r11);
        int r2 = 0;
        if (r12 != 17) goto L5;
        r02.offset(r11.width() + 1, 0);
    L16:
        int r1 = r8.b(r7);
        Rect r3 = new Rect();
        Object r4 = null;
    L17:
        if (r2 >= r1) goto L25;
        Object r5 = r8.a(r7, r2);
        if (r5 == r10) goto L24;
        r9.a(r5, r3);
        if (h(r12, r11, r3, r02) == false) goto L24;
        r02.set(r3);
        r4 = r5;
    L24:
        r2 = r2 + 1;
        goto L17
    L25:
        return r4;
    L5:
        if (r12 != 33) goto L7;
        r02.offset(0, r11.height() + 1);
        goto L16
    L7:
        if (r12 != 66) goto L9;
        r02.offset(-(r11.width() + 1), 0);
        goto L16
    L9:
        if (r12 != 130) goto L12;
        r02.offset(0, -(r11.height() + 1));
        goto L16
    L12:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    public static Object d(Object r4, InterfaceC0186b r5, a r6, Object r7, int r8, boolean r9, boolean r10) {
        int r02 = r5.b(r4);
        ArrayList r1 = new ArrayList(r02);
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r1.add(r5.a(r4, r2));
        r2 = r2 + 1;
        goto L3
    L5:
        Collections.sort(r1, new c(r9, r6));
        if (r8 == 1) goto L14;
        if (r8 != 2) goto L12;
        return e(r7, r1, r10);
    L12:
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    L14:
        return f(r7, r1, r10);
    }

    public static Object e(Object r1, ArrayList r2, boolean r3) {
        int r02 = r2.size();
        if (r1 != null) goto L5;
        int r12 = -1;
    L6:
        int r13 = r12 + 1;
        if (r13 < r02) goto L9;
        if (r3 == false) goto L14;
        if (r02 > 0) goto L13;
        return null;
    L13:
        return r2.get(0);
    L14:
        return null;
    L9:
        return r2.get(r13);
    L5:
        r12 = r2.lastIndexOf(r1);
        goto L6
    }

    public static Object f(Object r1, ArrayList r2, boolean r3) {
        int r02 = r2.size();
        if (r1 != null) goto L5;
        int r12 = r02;
    L6:
        int r13 = r12 - 1;
        if (r13 >= 0) goto L9;
        if (r3 == false) goto L14;
        if (r02 > 0) goto L13;
        return null;
    L13:
        return r2.get(r02 - 1);
    L14:
        return null;
    L9:
        return r2.get(r13);
    L5:
        r12 = r2.indexOf(r1);
        goto L6
    }

    public static int g(int r1, int r2) {
        return ((r1 * 13) * r1) + (r2 * r2);
    }

    public static boolean h(int r3, Rect r4, Rect r5, Rect r6) {
        if (i(r4, r5, r3) == true) goto L6;
        return false;
    L6:
        if (i(r4, r6, r3) == true) goto L9;
        return true;
    L9:
        if (a(r3, r4, r5, r6) == false) goto L12;
        return true;
    L12:
        if (a(r3, r4, r6, r5) == false) goto L15;
        return false;
    L15:
        if (g(k(r3, r4, r5), o(r3, r4, r5)) >= g(k(r3, r4, r6), o(r3, r4, r6))) goto L17;
        return true;
    L17:
        return false;
    }

    public static boolean i(Rect r3, Rect r4, int r5) {
        if (r5 != 17) goto L5;
        int r52 = r3.right;
        int r02 = r4.right;
        if (r52 > r02) goto L41;
        if (r3.left >= r02) goto L41;
    L43:
        return false;
    L41:
        if (r3.left <= r4.left) goto L43;
        return true;
    L5:
        if (r5 != 33) goto L7;
        int r53 = r3.bottom;
        int r03 = r4.bottom;
        if (r53 > r03) goto L33;
        if (r3.top >= r03) goto L33;
    L35:
        return false;
    L33:
        if (r3.top <= r4.top) goto L35;
        return true;
    L7:
        if (r5 != 66) goto L9;
        int r54 = r3.left;
        int r04 = r4.left;
        if (r54 < r04) goto L25;
        if (r3.right <= r04) goto L25;
    L27:
        return false;
    L25:
        if (r3.right >= r4.right) goto L27;
        return true;
    L9:
        if (r5 != 130) goto L19;
        int r55 = r3.top;
        int r05 = r4.top;
        if (r55 < r05) goto L15;
        if (r3.bottom <= r05) goto L15;
    L17:
        return false;
    L15:
        if (r3.bottom >= r4.bottom) goto L17;
        return true;
    L19:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    public static boolean j(int r3, Rect r4, Rect r5) {
        if (r3 == 17) goto L25;
        if (r3 == 33) goto L21;
        if (r3 == 66) goto L17;
        if (r3 != 130) goto L15;
        if (r4.bottom > r5.top) goto L13;
        return true;
    L13:
        return false;
    L15:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L17:
        if (r4.right > r5.left) goto L19;
        return true;
    L19:
        return false;
    L21:
        if (r4.top < r5.bottom) goto L23;
        return true;
    L23:
        return false;
    L25:
        if (r4.left < r5.right) goto L27;
        return true;
    L27:
        return false;
    }

    public static int k(int r1, Rect r2, Rect r3) {
        return Math.max(0, l(r1, r2, r3));
    }

    public static int l(int r1, Rect r2, Rect r3) {
        if (r1 != 17) goto L5;
        int r12 = r2.left;
        int r22 = r3.right;
    L12:
        return r12 - r22;
    L5:
        if (r1 != 33) goto L7;
        r12 = r2.top;
        r22 = r3.bottom;
        goto L12
    L7:
        if (r1 != 66) goto L9;
        r12 = r3.left;
        r22 = r2.right;
        goto L12
    L9:
        if (r1 != 130) goto L14;
        r12 = r3.top;
        r22 = r2.bottom;
        goto L12
    L14:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    public static int m(int r1, Rect r2, Rect r3) {
        return Math.max(1, n(r1, r2, r3));
    }

    public static int n(int r1, Rect r2, Rect r3) {
        if (r1 != 17) goto L5;
        int r12 = r2.left;
        int r22 = r3.left;
    L12:
        return r12 - r22;
    L5:
        if (r1 != 33) goto L7;
        r12 = r2.top;
        r22 = r3.top;
        goto L12
    L7:
        if (r1 != 66) goto L9;
        r12 = r3.right;
        r22 = r2.right;
        goto L12
    L9:
        if (r1 != 130) goto L14;
        r12 = r3.bottom;
        r22 = r2.bottom;
        goto L12
    L14:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    public static int o(int r1, Rect r2, Rect r3) {
        if (r1 == 17) goto L16;
        if (r1 == 33) goto L14;
        if (r1 == 66) goto L16;
        if (r1 == 130) goto L14;
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L14:
        return Math.abs((r2.left + (r2.width() / 2)) - (r3.left + (r3.width() / 2)));
    L16:
        return Math.abs((r2.top + (r2.height() / 2)) - (r3.top + (r3.height() / 2)));
    }
}
