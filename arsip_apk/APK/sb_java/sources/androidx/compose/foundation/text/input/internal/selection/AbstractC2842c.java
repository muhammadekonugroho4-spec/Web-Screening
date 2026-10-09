package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: androidx.compose.foundation.text.input.internal.selection.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2842c {

    /* renamed from: androidx.compose.foundation.text.input.internal.selection.c$a */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10446a = null;

        static {
            int[] r02 = new int[WedgeAffinity.values().length];
            r02[WedgeAffinity.Start.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L9:
            r02[WedgeAffinity.End.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L5:
            f10446a = r02;
        }
    }

    public static final int a(long r02) {
        return f(r02);
    }

    public static final WedgeAffinity b(long r02) {
        return g(r02);
    }

    public static long c(int r6) {
        return e((r6 << 32) | ((-1) & 4294967295L));
    }

    public static long d(int r4, WedgeAffinity r5) {
        int r02 = -1;
        if (r5 != null) goto L5;
        int r52 = -1;
    L6:
        if (r52 == (-1)) goto L16;
        r02 = 1;
        if (r52 != 1) goto L10;
        r02 = 0;
        goto L16
    L10:
        if (r52 == 2) goto L16;
        throw new NoWhenBranchMatchedException();
    L16:
        return e((r4 << 32) | (r02 & 4294967295L));
    L5:
        r52 = a.f10446a[r5.ordinal()];
        goto L6
    }

    public static long e(long r02) {
        return r02;
    }

    public static final int f(long r1) {
        return (int) (r1 >> 32);
    }

    public static final WedgeAffinity g(long r2) {
        int r22 = (int) (r2 & 4294967295L);
        if (r22 >= 0) goto L6;
        return null;
    L6:
        if (r22 != 0) goto L10;
        return WedgeAffinity.Start;
    L10:
        return WedgeAffinity.End;
    }
}
