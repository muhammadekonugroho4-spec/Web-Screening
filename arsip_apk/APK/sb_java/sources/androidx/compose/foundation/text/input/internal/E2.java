package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class E2 {
    public static final int a(Locale r2) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        byte r22 = C2781d0.f10271a.a(r2);
    L7:
        if (r22 == 1) goto L14;
        if (r22 == 2) goto L14;
        return androidx.compose.ui.text.style.k.f20303b.d();
    L14:
        return androidx.compose.ui.text.style.k.f20303b.e();
    L5:
        r22 = C2773b0.f10265a.a(r2);
        goto L7
    }
}
