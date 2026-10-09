package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public final class K3 implements Q {
    public K3() {
    }

    @Override // io.sentry.Q
    public void a(SentryLevel r3, String r4, Throwable r5) {
        if (r5 != null) goto L5;
        c(r3, r4, new Object[0]);
        return;
    L5:
        System.out.println(String.format("%s: %s\n%s", new Object[]{r3, String.format(r4, new Object[]{r5.toString()}), e(r5)}));
    }

    @Override // io.sentry.Q
    public void b(SentryLevel r2, Throwable r3, String r4, Object... r5) {
        if (r3 != null) goto L5;
        c(r2, r4, r5);
        return;
    L5:
        System.out.println(String.format("%s: %s \n %s\n%s", new Object[]{r2, String.format(r4, r5), r3.toString(), e(r3)}));
    }

    @Override // io.sentry.Q
    public void c(SentryLevel r2, String r3, Object... r4) {
        System.out.println(String.format("%s: %s", new Object[]{r2, String.format(r3, r4)}));
    }

    @Override // io.sentry.Q
    public boolean d(SentryLevel r1) {
        return true;
    }

    public final String e(Throwable r3) {
        StringWriter r02 = new StringWriter();
        r3.printStackTrace(new PrintWriter(r02));
        return r02.toString();
    }
}
