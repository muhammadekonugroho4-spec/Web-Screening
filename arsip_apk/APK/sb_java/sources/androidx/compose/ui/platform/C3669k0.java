package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;

/* renamed from: androidx.compose.ui.platform.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3669k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3669k0 f19356a = null;

    static {
        f19356a = new C3669k0();
    }

    public C3669k0() {
    }

    public final boolean a(Context r4) {
        if (Build.VERSION.SDK_INT >= 31) goto L5;
        return false;
    L5:
        if (AbstractC3667j0.a((Vibrator) r4.getSystemService(Vibrator.class), new int[]{1, 7, 2}) == false) goto L9;
        return true;
    L9:
        return false;
    }
}
