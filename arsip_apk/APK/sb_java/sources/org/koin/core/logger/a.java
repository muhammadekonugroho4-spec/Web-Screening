package org.koin.core.logger;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class a extends b {
    public a() {
        super(Level.NONE);
    }

    @Override // org.koin.core.logger.b
    public void a(Level r2, String r3) {
        p.l(r2, FirebaseAnalytics.Param.LEVEL);
        p.l(r3, "msg");
    }
}
