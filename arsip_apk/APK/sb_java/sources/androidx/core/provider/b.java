package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class b {
    public static Handler a() {
        if (Looper.myLooper() != null) goto L7;
        return new Handler(Looper.getMainLooper());
    L7:
        return new Handler();
    }
}
