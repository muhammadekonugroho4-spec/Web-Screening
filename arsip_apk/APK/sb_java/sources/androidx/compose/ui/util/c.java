package androidx.compose.ui.util;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.l;

/* loaded from: classes.dex */
public abstract class c {
    public static final void a(Appendable r02, Object r1, l r2) {
        if (r2 == null) goto L5;
        r02.append((CharSequence) r2.invoke(r1));
        return;
    L5:
        if (r1 != null) goto L7;
        boolean r22 = true;
    L8:
        if (r22 == false) goto L12;
        r02.append((CharSequence) r1);
        return;
    L12:
        if ((r1 instanceof Character) == false) goto L15;
        r02.append(((Character) r1).charValue());
        return;
    L15:
        r02.append(r1.toString());
        return;
    L7:
        r22 = r1 instanceof CharSequence;
        goto L8
    }

    public static final List b(List r4) {
        ArrayList r02 = new ArrayList(r4.size());
        int r1 = r4.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        Object r3 = r4.get(r2);
        if (r3 == null) goto L7;
        r02.add(r3);
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r02;
    }

    public static final Appendable c(List r4, Appendable r5, CharSequence r6, CharSequence r7, CharSequence r8, int r9, CharSequence r10, l r11) {
        r5.append(r7);
        int r72 = r4.size();
        int r02 = 0;
        int r1 = 0;
    L3:
        if (r02 >= r72) goto L10;
        Object r2 = r4.get(r02);
        r1 = r1 + 1;
        if (r1 <= 1) goto L7;
        r5.append(r6);
    L7:
        if (r9 < 0) goto L9;
        if (r1 > r9) goto L10;
    L9:
        a(r5, r2, r11);
        r02 = r02 + 1;
    L10:
        if (r9 < 0) goto L13;
        if (r1 <= r9) goto L13;
        r5.append(r10);
    L13:
        r5.append(r8);
        return r5;
    }

    public static final String d(List r8, CharSequence r9, CharSequence r10, CharSequence r11, int r12, CharSequence r13, l r14) {
        return ((StringBuilder) c(r8, new StringBuilder(), r9, r10, r11, r12, r13, r14)).toString();
    }

    public static /* synthetic */ String e(List r1, CharSequence r2, CharSequence r3, CharSequence r4, int r5, CharSequence r6, l r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = ", ";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = -1;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = "...";
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = null;
    L20:
        CharSequence r82 = r6;
        l r92 = r7;
        CharSequence r62 = r4;
        int r72 = r5;
        return d(r1, r2, r3, r62, r72, r82, r92);
    }

    public static final Void f(String r1) {
        throw new NoSuchElementException(r1);
    }

    public static final void g(String r1) {
        throw new UnsupportedOperationException(r1);
    }
}
