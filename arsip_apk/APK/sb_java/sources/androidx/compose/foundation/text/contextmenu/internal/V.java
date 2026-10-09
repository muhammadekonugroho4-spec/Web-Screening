package androidx.compose.foundation.text.contextmenu.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassification;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public static final V f9789a = null;

    static {
        f9789a = new V();
    }

    public V() {
    }

    public final void a(Context r3, TextClassification r4) {
        String r02 = r4.getText();
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L6:
        b(PendingIntent.getActivity(r3, r03, r4.getIntent(), 201326592));
        return;
    L5:
        r03 = 0;
        goto L6
    }

    public final void b(PendingIntent r3) {
        if (Build.VERSION.SDK_INT < 34) goto L6;
        U.f9788a.a(r3);
        return;
    L6:
        r3.send();
    }
}
