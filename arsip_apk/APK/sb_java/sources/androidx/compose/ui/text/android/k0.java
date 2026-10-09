package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f19781a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final long f19782b = 0;

    static {
        f19781a = new ThreadLocal();
        f19782b = a(0, 0);
    }

    public static final long a(int r4, int r5) {
        return l0.a((r5 & 4294967295L) | (r4 << 32));
    }

    public static final /* synthetic */ Paint.FontMetricsInt b(i0 r02, TextPaint r1, TextDirectionHeuristic r2, androidx.compose.ui.text.android.style.h[] r3) {
        return g(r02, r1, r2, r3);
    }

    public static final /* synthetic */ long c(androidx.compose.ui.text.android.style.h[] r2) {
        return h(r2);
    }

    public static final /* synthetic */ androidx.compose.ui.text.android.style.h[] d(i0 r02) {
        return i(r02);
    }

    public static final /* synthetic */ long e(i0 r2) {
        return l(r2);
    }

    public static final /* synthetic */ long f() {
        return f19782b;
    }

    public static final Paint.FontMetricsInt g(i0 r27, TextPaint r28, TextDirectionHeuristic r29, androidx.compose.ui.text.android.style.h[] r30) {
        int r1 = r27.m() - 1;
        if (r27.i().getLineStart(r1) != r27.i().getLineEnd(r1)) goto L16;
        if (r30 != null) goto L6;
        return null;
    L6:
        if (r30.length == 0) goto L19;
        SpannableString r4 = new SpannableString("\u200b");
        androidx.compose.ui.text.android.style.h r02 = (androidx.compose.ui.text.android.style.h) kotlin.collections.r.r0(r30);
        int r2 = r4.length();
        if (r1 != 0) goto L11;
    L13:
        boolean r12 = r02.g();
    L14:
        r4.setSpan(r02.b(0, r2, r12), 0, r4.length(), 33);
        StaticLayout r13 = d0.b(d0.f19732a, r4, r28, Integer.MAX_VALUE, 0, r4.length(), r29, null, 0, null, 0, 0.0f, 0.0f, 0, r27.h(), r27.e(), 0, 0, 0, 0, null, null, 2072512, null);
        Paint.FontMetricsInt r22 = new Paint.FontMetricsInt();
        r22.ascent = r13.getLineAscent(0);
        r22.descent = r13.getLineDescent(0);
        r22.top = r13.getLineTop(0);
        r22.bottom = r13.getLineBottom(0);
        return r22;
    L11:
        if (r02.g() == false) goto L13;
        r12 = false;
        goto L14
    L19:
        return null;
    L16:
        return null;
    }

    public static final long h(androidx.compose.ui.text.android.style.h[] r6) {
        int r02 = r6.length;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r1 >= r02) goto L11;
        androidx.compose.ui.text.android.style.h r4 = r6[r1];
        if (r4.c() >= 0) goto L8;
        r2 = Math.max(r2, Math.abs(r4.c()));
    L8:
        if (r4.d() >= 0) goto L10;
        r3 = Math.max(r2, Math.abs(r4.d()));
    L10:
        r1 = r1 + 1;
        goto L3
    L11:
        if (r2 != 0) goto L16;
        if (r3 != 0) goto L16;
        return f19782b;
    L16:
        return a(r2, r3);
    }

    public static final androidx.compose.ui.text.android.style.h[] i(i0 r4) {
        if ((r4.G() instanceof Spanned) == true) goto L5;
        return null;
    L5:
        CharSequence r02 = r4.G();
        kotlin.jvm.internal.p.j(r02, "null cannot be cast to non-null type android.text.Spanned");
        if (O.a((Spanned) r02, androidx.compose.ui.text.android.style.h.class) == false) goto L8;
    L10:
        CharSequence r03 = r4.G();
        kotlin.jvm.internal.p.j(r03, "null cannot be cast to non-null type android.text.Spanned");
        return (androidx.compose.ui.text.android.style.h[]) ((Spanned) r03).getSpans(0, r4.G().length(), androidx.compose.ui.text.android.style.h.class);
    L8:
        if (r4.G().length() <= 0) goto L10;
        return null;
    }

    public static final ThreadLocal j() {
        return f19781a;
    }

    public static final TextDirectionHeuristic k(int r1) {
        if (r1 == 0) goto L26;
        if (r1 == 1) goto L24;
        if (r1 == 2) goto L22;
        if (r1 == 3) goto L20;
        if (r1 == 4) goto L18;
        if (r1 == 5) goto L16;
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    L16:
        return TextDirectionHeuristics.LOCALE;
    L18:
        return TextDirectionHeuristics.ANYRTL_LTR;
    L20:
        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
    L22:
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    L24:
        return TextDirectionHeuristics.RTL;
    L26:
        return TextDirectionHeuristics.LTR;
    }

    public static final long l(i0 r7) {
        if (r7.h() == true) goto L26;
        if (r7.J() == true) goto L26;
        TextPaint r02 = r7.i().getPaint();
        CharSequence r1 = r7.i().getText();
        Rect r2 = N.c(r02, r1, r7.i().getLineStart(0), r7.i().getLineEnd(0));
        int r3 = r7.i().getLineAscent(0);
        int r4 = r2.top;
        if (r4 >= r3) goto L10;
        int r32 = r3 - r4;
    L12:
        if (r7.m() == 1) goto L15;
        int r22 = r7.m() - 1;
        r2 = N.c(r02, r1, r7.i().getLineStart(r22), r7.i().getLineEnd(r22));
    L15:
        int r03 = r7.i().getLineDescent(r7.m() - 1);
        int r12 = r2.bottom;
        if (r12 <= r03) goto L18;
        int r13 = r12 - r03;
    L19:
        if (r32 != 0) goto L24;
        if (r13 != 0) goto L24;
        return f19782b;
    L24:
        return a(r32, r13);
    L18:
        r13 = r7.i().getBottomPadding();
        goto L19
    L10:
        r32 = r7.i().getTopPadding();
    L26:
        return f19782b;
    }

    public static final boolean m(Layout r02, int r1) {
        if (r02.getEllipsisCount(r1) <= 0) goto L6;
        return true;
    L6:
        return false;
    }
}
