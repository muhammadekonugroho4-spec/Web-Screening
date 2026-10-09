package androidx.navigationevent;

import android.os.Build;
import android.window.BackEvent;
import androidx.activity.AbstractC2055b;
import androidx.activity.AbstractC2056c;
import androidx.activity.AbstractC2062d;
import androidx.activity.AbstractC2063e;
import androidx.activity.AbstractC2064f;

/* loaded from: classes4.dex */
public abstract class k {
    public static final b a(BackEvent r8) {
        kotlin.jvm.internal.p.l(r8, "backEvent");
        float r4 = AbstractC2055b.a(r8);
        float r5 = AbstractC2056c.a(r8);
        float r3 = AbstractC2062d.a(r8);
        int r2 = AbstractC2063e.a(r8);
        if (Build.VERSION.SDK_INT < 36) goto L6;
        long r02 = AbstractC2064f.a(r8);
    L8:
        return new b(r2, r3, r4, r5, r02);
    L6:
        r02 = 0;
        goto L8
    }
}
