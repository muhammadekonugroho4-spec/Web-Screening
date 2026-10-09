package org.koin.core.logger;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public Level f182581a;

    public b(Level r2) {
        p.l(r2, FirebaseAnalytics.Param.LEVEL);
        this.f182581a = r2;
    }

    public abstract void a(Level r1, String r2);

    public final boolean b(Level r2) {
        p.l(r2, "lvl");
        if (this.f182581a.compareTo(r2) > 0) goto L6;
        return true;
    L6:
        return false;
    }
}
