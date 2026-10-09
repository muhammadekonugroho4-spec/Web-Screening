package androidx.compose.ui.platform;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class E {
    public static final /* synthetic */ boolean a() {
        return b();
    }

    public static final boolean b() {
        if (Looper.myLooper() != Looper.getMainLooper()) goto L6;
        return true;
    L6:
        return false;
    }
}
