package androidx.room.util;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f27986a = null;

    static {
        f27986a = new String[0];
    }

    public static final void a(StringBuilder r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "builder");
        int r02 = 0;
    L3:
        if (r02 >= r3) goto L8;
        r2.append("?");
        if (r02 >= (r3 - 1)) goto L7;
        r2.append(Constants.SEPARATOR_COMMA);
    L7:
        r02 = r02 + 1;
        goto L3
    }

    public static final StringBuilder b() {
        return new StringBuilder();
    }
}
