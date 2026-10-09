package kotlin.text;

import com.clevertap.android.sdk.Constants;
import java.util.Comparator;
import kotlin.collections.AbstractC11760d;

/* loaded from: classes3.dex */
public abstract class y extends x {
    public static String B(char[] r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return new String(r1);
    }

    public static String C(char[] r2, int r3, int r4) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        AbstractC11760d.f177382a.a(r3, r4, r2.length);
        return new String(r2, r3, r4 - r3);
    }

    public static boolean D(CharSequence r1, CharSequence r2) {
        if ((r1 instanceof String) == false) goto L8;
        if (r2 == null) goto L8;
        return ((String) r1).contentEquals(r2);
    L8:
        return B.i0(r1, r2);
    }

    public static boolean E(CharSequence r02, CharSequence r1, boolean r2) {
        if (r2 == false) goto L6;
        return B.h0(r02, r1);
    L6:
        return D(r02, r1);
    }

    public static String F(byte[] r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        return new String(r2, C11850c.f180362b);
    }

    public static byte[] G(String r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        byte[] r12 = r1.getBytes(C11850c.f180362b);
        kotlin.jvm.internal.p.k(r12, "getBytes(...)");
        return r12;
    }

    public static boolean H(String r7, String r8, boolean r9) {
        kotlin.jvm.internal.p.l(r7, "<this>");
        kotlin.jvm.internal.p.l(r8, "suffix");
        if (r9 == true) goto L7;
        return r7.endsWith(r8);
    L7:
        return M(r7, r7.length() - r8.length(), r8, 0, r8.length(), true);
    }

    public static /* synthetic */ boolean I(String r02, String r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return H(r02, r1, r2);
    }

    public static boolean J(String r02, String r1, boolean r2) {
        if (r02 != null) goto L8;
        if (r1 != null) goto L6;
        return true;
    L6:
        return false;
    L8:
        if (r2 == true) goto L12;
        return r02.equals(r1);
    L12:
        return r02.equalsIgnoreCase(r1);
    }

    public static /* synthetic */ boolean K(String r02, String r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return J(r02, r1, r2);
    }

    public static Comparator L(kotlin.jvm.internal.y r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        Comparator r02 = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.p.k(r02, "CASE_INSENSITIVE_ORDER");
        return r02;
    }

    public static boolean M(String r6, int r7, String r8, int r9, int r10, boolean r11) {
        kotlin.jvm.internal.p.l(r6, "<this>");
        kotlin.jvm.internal.p.l(r8, "other");
        if (r11 == true) goto L7;
        return r6.regionMatches(r7, r8, r9, r10);
    L7:
        return r6.regionMatches(r11, r7, r8, r9, r10);
    }

    public static /* synthetic */ boolean N(String r6, int r7, String r8, int r9, int r10, boolean r11, int r12, Object r13) {
        if ((r12 & 16) == 0) goto L6;
        r11 = false;
    L6:
        return M(r6, r7, r8, r9, r10, r11);
    }

    public static String O(CharSequence r3, int r4) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        if (r4 < 0) goto L28;
        if (r4 == 0) goto L26;
        int r1 = 1;
        if (r4 == 1) goto L25;
        int r2 = r3.length();
        if (r2 == 0) goto L23;
        if (r2 == 1) goto L18;
        StringBuilder r02 = new StringBuilder(r3.length() * r4);
        if (1 > r4) goto L16;
    L13:
        r02.append(r3);
        if (r1 == r4) goto L16;
        r1 = r1 + 1;
    L16:
        String r32 = r02.toString();
        kotlin.jvm.internal.p.i(r32);
        return r32;
    L18:
        int r03 = 0;
        char r33 = r3.charAt(0);
        char[] r12 = new char[r4];
    L19:
        if (r03 >= r4) goto L22;
        r12[r03] = r33;
        r03 = r03 + 1;
        goto L19
    L22:
        return new String(r12);
    L23:
        return "";
    L25:
        return r3.toString();
    L26:
        return "";
    L28:
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + r4 + '.').toString());
    }

    public static final String P(String r4, char r5, char r6, boolean r7) {
        kotlin.jvm.internal.p.l(r4, "<this>");
        if (r7 == true) goto L6;
        String r42 = r4.replace(r5, r6);
        kotlin.jvm.internal.p.k(r42, "replace(...)");
        return r42;
    L6:
        StringBuilder r1 = new StringBuilder(r4.length());
        int r02 = 0;
    L8:
        if (r02 >= r4.length()) goto L14;
        char r2 = r4.charAt(r02);
        if (AbstractC11849b.g(r2, r5, r7) == false) goto L12;
        r2 = r6;
    L12:
        r1.append(r2);
        r02 = r02 + 1;
        goto L8
    L14:
        return r1.toString();
    }

    public static String Q(String r6, String r7, String r8, boolean r9) {
        kotlin.jvm.internal.p.l(r6, "<this>");
        kotlin.jvm.internal.p.l(r7, Constants.KEY_OLD_VALUE);
        kotlin.jvm.internal.p.l(r8, Constants.KEY_NEW_VALUE);
        int r02 = 0;
        int r1 = B.r0(r6, r7, 0, r9);
        if (r1 >= 0) goto L5;
        return r6;
    L5:
        int r2 = r7.length();
        int r3 = kotlin.ranges.q.g(r2, 1);
        int r4 = (r6.length() - r2) + r8.length();
        if (r4 < 0) goto L15;
        StringBuilder r5 = new StringBuilder(r4);
    L8:
        r5.append(r6, r02, r1);
        r5.append(r8);
        r02 = r1 + r2;
        if (r1 >= r6.length()) goto L12;
        r1 = B.r0(r6, r7, r1 + r3, r9);
        if (r1 > 0) goto L8;
    L12:
        r5.append(r6, r02, r6.length());
        String r62 = r5.toString();
        kotlin.jvm.internal.p.k(r62, "toString(...)");
        return r62;
    L15:
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String R(String r02, char r1, char r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return P(r02, r1, r2, r3);
    }

    public static /* synthetic */ String S(String r02, String r1, String r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return Q(r02, r1, r2, r3);
    }

    public static final String T(String r7, char r8, char r9, boolean r10) {
        kotlin.jvm.internal.p.l(r7, "<this>");
        int r72 = B.u0(r7, r8, 0, r10, 2, null);
        if (r72 >= 0) goto L6;
        return r7;
    L6:
        return B.Y0(r7, r72, r72 + 1, String.valueOf(r9)).toString();
    }

    public static final String U(String r7, String r8, String r9, boolean r10) {
        kotlin.jvm.internal.p.l(r7, "<this>");
        kotlin.jvm.internal.p.l(r8, Constants.KEY_OLD_VALUE);
        kotlin.jvm.internal.p.l(r9, Constants.KEY_NEW_VALUE);
        int r72 = B.v0(r7, r8, 0, r10, 2, null);
        if (r72 >= 0) goto L6;
        return r7;
    L6:
        return B.Y0(r7, r72, r8.length() + r72, r9).toString();
    }

    public static /* synthetic */ String V(String r02, char r1, char r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return T(r02, r1, r2, r3);
    }

    public static /* synthetic */ String W(String r02, String r1, String r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return U(r02, r1, r2, r3);
    }

    public static boolean X(String r6, String r7, int r8, boolean r9) {
        kotlin.jvm.internal.p.l(r6, "<this>");
        kotlin.jvm.internal.p.l(r7, "prefix");
        if (r9 == true) goto L7;
        return r6.startsWith(r7, r8);
    L7:
        return M(r6, r8, r7, 0, r7.length(), r9);
    }

    public static boolean Y(String r6, String r7, boolean r8) {
        kotlin.jvm.internal.p.l(r6, "<this>");
        kotlin.jvm.internal.p.l(r7, "prefix");
        if (r8 == true) goto L7;
        return r6.startsWith(r7);
    L7:
        return M(r6, 0, r7, 0, r7.length(), r8);
    }

    public static /* synthetic */ boolean Z(String r02, String r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return X(r02, r1, r2, r3);
    }

    public static /* synthetic */ boolean a0(String r02, String r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return Y(r02, r1, r2);
    }
}
