package org.koin.android.logger;

import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;
import org.koin.core.logger.Level;
import org.koin.core.logger.b;

/* loaded from: classes3.dex */
public final class a extends b {

    /* renamed from: org.koin.android.logger.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1932a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f182538a = null;

        static {
            int[] r02 = new int[Level.values().length];
            r02[Level.DEBUG.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
        L13:
            r02[Level.INFO.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
        L19:
            r02[Level.WARNING.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L15:
            r02[Level.ERROR.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
        L7:
            f182538a = r02;
        }
    }

    public a(Level r2) {
        p.l(r2, FirebaseAnalytics.Param.LEVEL);
        super(r2);
    }

    @Override // org.koin.core.logger.b
    public void a(Level r3, String r4) {
        p.l(r3, FirebaseAnalytics.Param.LEVEL);
        p.l(r4, "msg");
        int r32 = C1932a.f182538a[r3.ordinal()];
        if (r32 != 1) goto L5;
        Log.d("[Koin]", r4);
        return;
    L5:
        if (r32 != 2) goto L7;
        Log.i("[Koin]", r4);
        return;
    L7:
        if (r32 != 3) goto L9;
        Log.w("[Koin]", r4);
        return;
    L9:
        if (r32 == 4) goto L12;
        Log.e("[Koin]", r4);
        return;
    L12:
        Log.e("[Koin]", r4);
    }
}
