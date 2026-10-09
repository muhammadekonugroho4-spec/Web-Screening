package com.clevertap.android.sdk.utils;

import com.clevertap.android.sdk.Constants;
import java.util.UUID;
import kotlin.text.C11850c;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f34959a = null;

    static {
        f34959a = new t();
    }

    public t() {
    }

    public static /* synthetic */ String a(String r02) {
        return c(r02);
    }

    public static final String c(String r2) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
        byte[] r02 = r2.getBytes(C11850c.f180362b);     // Catch: InternalError -> L5
        kotlin.jvm.internal.p.k(r02, "getBytes(...)");     // Catch: InternalError -> L5
        UUID r03 = UUID.nameUUIDFromBytes(r02);     // Catch: InternalError -> L5
    L6:
        if (r03 == null) goto L10;
        String r04 = r03.toString();
        if (r04 == null) goto L10;
        return r04;
    L10:
        return String.valueOf(r2.hashCode());
    L5:
        String.valueOf(r2.hashCode());
        r03 = null;
        goto L6
    }

    public final kotlin.jvm.functions.l b() {
        return new s();
    }
}
