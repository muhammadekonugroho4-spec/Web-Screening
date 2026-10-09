package androidx.compose.ui.window;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class o {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20843a = null;

        static {
            int[] r02 = new int[SecureFlagPolicy.values().length];
            r02[SecureFlagPolicy.SecureOff.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
        L11:
            r02[SecureFlagPolicy.SecureOn.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L15:
            r02[SecureFlagPolicy.Inherit.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
        L6:
            f20843a = r02;
        }
    }

    public static final boolean a(SecureFlagPolicy r2, boolean r3) {
        int r22 = a.f20843a[r2.ordinal()];
        if (r22 != 1) goto L5;
        return false;
    L5:
        if (r22 != 2) goto L7;
        return true;
    L7:
        if (r22 != 3) goto L10;
        return r3;
    L10:
        throw new NoWhenBranchMatchedException();
    }
}
