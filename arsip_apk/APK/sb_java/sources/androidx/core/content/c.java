package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import androidx.core.util.h;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f22738a;

    /* renamed from: b, reason: collision with root package name */
    public final LocusId f22739b;

    public static class a {
        public static LocusId a(String r1) {
            return new LocusId(r1);
        }

        public static String b(LocusId r02) {
            return r02.getId();
        }
    }

    public c(String r3) {
        this.f22738a = (String) h.k(r3, "id cannot be empty");
        if (Build.VERSION.SDK_INT < 29) goto L6;
        this.f22739b = a.a(r3);
        return;
    L6:
        this.f22739b = null;
    }

    public static c c(LocusId r2) {
        h.h(r2, "locusId cannot be null");
        return new c((String) h.k(a.b(r2), "id cannot be empty"));
    }

    public final String a() {
        return this.f22738a.length() + "_chars";
    }

    public LocusId b() {
        return this.f22739b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if (c.class == r5.getClass()) goto L11;
        return false;
    L11:
        c r52 = (c) r5;
        String r2 = this.f22738a;
        if (r2 != null) goto L18;
        if (r52.f22738a != null) goto L16;
        return true;
    L16:
        return false;
    L18:
        return r2.equals(r52.f22738a);
    }

    public int hashCode() {
        String r02 = this.f22738a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return 31 + r03;
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "LocusIdCompat[" + a() + Constants.AES_SUFFIX;
    }
}
