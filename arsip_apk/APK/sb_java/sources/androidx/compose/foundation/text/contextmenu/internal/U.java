package androidx.compose.foundation.text.contextmenu.internal;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.util.Log;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public static final U f9788a = null;

    static {
        f9788a = new U();
    }

    public U() {
    }

    public final void a(PendingIntent r4) {
        T.a(r4, S.a(ActivityOptions.makeBasic(), 1).toBundle());     // Catch: PendingIntent.CanceledException -> L4
        return;
    L4:
        e = move-exception;
        Log.e("TextClassification", "error sending pendingIntent: " + r4 + " error: " + e);
    }
}
