package com.google.android.play.integrity.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f38352a;

    public s(String r5) {
        this.f38352a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(r5);
    }

    private static String f(String r3, String r4, Object... r5) {
        if (r5.length <= 0) goto L9;
        r4 = String.format(Locale.US, r4, r5);     // Catch: IllegalFormatException -> L6
    L6:
        e = move-exception;
        Log.e("PlayCore", "Unable to format ".concat(r4), e);
        r4 = r4 + " [" + TextUtils.join(", ", r5) + Constants.AES_SUFFIX;
    L9:
        return r3 + " : " + r4;
    }

    public final int a(String r3, Object... r4) {
        if (Log.isLoggable("PlayCore", 3) == true) goto L5;
        return 0;
    L5:
        return Log.d("PlayCore", f(this.f38352a, r3, r4));
    }

    public final int b(String r3, Object... r4) {
        if (Log.isLoggable("PlayCore", 6) == true) goto L5;
        return 0;
    L5:
        return Log.e("PlayCore", f(this.f38352a, r3, r4));
    }

    public final int c(Throwable r3, String r4, Object... r5) {
        if (Log.isLoggable("PlayCore", 6) == true) goto L5;
        return 0;
    L5:
        return Log.e("PlayCore", f(this.f38352a, r4, r5), r3);
    }

    public final int d(String r3, Object... r4) {
        if (Log.isLoggable("PlayCore", 4) == true) goto L5;
        return 0;
    L5:
        return Log.i("PlayCore", f(this.f38352a, r3, r4));
    }

    public final int e(String r3, Object... r4) {
        if (Log.isLoggable("PlayCore", 5) == true) goto L5;
        return 0;
    L5:
        return Log.w("PlayCore", f(this.f38352a, r3, r4));
    }
}
