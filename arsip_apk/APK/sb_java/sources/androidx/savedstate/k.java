package androidx.savedstate;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class k {
    public static Bundle a(Bundle r1) {
        p.l(r1, "source");
        return r1;
    }

    public static final void b(Bundle r1, Bundle r2) {
        p.l(r2, Constants.MessagePayloadKeys.FROM);
        r1.putAll(r2);
    }

    public static final void c(Bundle r1, String r2, boolean r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        r1.putBoolean(r2, r3);
    }

    public static final void d(Bundle r1, String r2, boolean[] r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r3, "value");
        r1.putBooleanArray(r2, r3);
    }

    public static final void e(Bundle r1, String r2, double r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        r1.putDouble(r2, r3);
    }

    public static final void f(Bundle r1, String r2, double[] r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r3, "value");
        r1.putDoubleArray(r2, r3);
    }

    public static final void g(Bundle r1, String r2, float r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        r1.putFloat(r2, r3);
    }

    public static final void h(Bundle r1, String r2, float[] r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r3, "value");
        r1.putFloatArray(r2, r3);
    }

    public static final void i(Bundle r1, String r2, int r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        r1.putInt(r2, r3);
    }

    public static final void j(Bundle r1, String r2, int[] r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r3, "value");
        r1.putIntArray(r2, r3);
    }

    public static final void k(Bundle r1, String r2, long r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        r1.putLong(r2, r3);
    }

    public static final void l(Bundle r1, String r2, long[] r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r3, "value");
        r1.putLongArray(r2, r3);
    }

    public static final void m(Bundle r1, String r2) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        r1.putString(r2, null);
    }

    public static final void n(Bundle r1, String r2, Parcelable r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r3, "value");
        r1.putParcelable(r2, r3);
    }

    public static final void o(Bundle r1, String r2, List r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r3, "value");
        r1.putParcelableArrayList(r2, l.a(r3));
    }

    public static final void p(Bundle r1, String r2, Bundle r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r3, "value");
        r1.putBundle(r2, r3);
    }

    public static final void q(Bundle r1, String r2, List r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r3, "value");
        o(r1, r2, r3);
    }

    public static final void r(Bundle r1, String r2, String r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r3, "value");
        r1.putString(r2, r3);
    }

    public static final void s(Bundle r1, String r2, String[] r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r3, "value");
        r1.putStringArray(r2, r3);
    }

    public static final void t(Bundle r1, String r2, List r3) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        p.l(r3, "value");
        r1.putStringArrayList(r2, l.a(r3));
    }

    public static final void u(Bundle r1, String r2) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_KEY);
        r1.remove(r2);
    }
}
