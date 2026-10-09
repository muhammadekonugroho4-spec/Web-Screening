package com.stockbit.userauth.util;

import android.os.CountDownTimer;
import com.clevertap.android.sdk.Constants;
import com.stockbit.userauth.ui.event.a;
import kotlin.jvm.functions.l;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f165580a = null;

    /* renamed from: b, reason: collision with root package name */
    public static l f165581b;

    /* renamed from: c, reason: collision with root package name */
    public static final CountDownTimerC1745a f165582c = null;
    public static final int d = 0;

    /* renamed from: com.stockbit.userauth.util.a$a, reason: collision with other inner class name */
    public static final class CountDownTimerC1745a extends CountDownTimer {
        public CountDownTimerC1745a() {
            super(Constants.ONE_MIN_IN_MILLIS, 1000);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            l r02 = a.f165580a.b();
            if (r02 == null) goto L6;
            r02.invoke(new a.C1741a());
            return;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r6) {
            if (r6 == 0) goto L17;
            long r62 = r6 / 1000;
            if (r62 <= 9) goto L11;
            l r02 = a.f165580a.b();
            if (r02 == null) goto L15;
            r02.invoke(new a.b("(00:" + r62 + ')'));
            return;
        L15:
            return;
        L11:
            l r03 = a.f165580a.b();
            if (r03 == null) goto L16;
            r03.invoke(new a.b("(00:0" + r62 + ')'));
            return;
        L16:
            return;
        }
    }

    static {
        f165580a = new a();
        f165582c = new CountDownTimerC1745a();
        d = 8;
    }

    public a() {
    }

    public final void a() {
        f165582c.cancel();
    }

    public final l b() {
        return f165581b;
    }

    public final void c(l r1) {
        f165581b = r1;
    }

    public final void d() {
        f165582c.start();
    }
}
