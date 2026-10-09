package com.iab.digitalidentity.sdk.core.analytics;

import java.util.Map;

/* loaded from: classes6.dex */
public interface a {

    /* renamed from: com.iab.digitalidentity.sdk.core.analytics.a$a, reason: collision with other inner class name */
    public static final class C0436a {
        public static /* synthetic */ void a(a r02, String r1, Map r2, String r3, int r4, Object r5) {
            if (r5 != null) goto L9;
            if ((r4 & 4) == 0) goto L6;
            r3 = null;
        L6:
            r02.a(r1, r2, r3);
            return;
        L9:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
    }

    void a(String r1, Map r2, String r3);
}
