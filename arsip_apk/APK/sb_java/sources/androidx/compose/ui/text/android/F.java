package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f19708a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f19709b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final TextDirectionHeuristic f19710c = null;
    public static final int d = 0;

    static {
        f19708a = new F();
        f19709b = Layout.Alignment.ALIGN_NORMAL;
        f19710c = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        d = 8;
    }

    public F() {
    }

    public final Layout.Alignment a() {
        return f19709b;
    }

    public final TextDirectionHeuristic b() {
        return f19710c;
    }
}
