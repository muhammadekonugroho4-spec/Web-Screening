package com.huawei.hms.hatool;

import java.util.Calendar;
import java.util.UUID;

/* loaded from: classes6.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    private long f39302a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f39303b;

    /* renamed from: c, reason: collision with root package name */
    private a f39304c;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        String f39305a;

        /* renamed from: b, reason: collision with root package name */
        boolean f39306b;

        /* renamed from: c, reason: collision with root package name */
        private long f39307c;
        final /* synthetic */ g0 d;

        public a(g0 r4, long r5) {
            this.d = r4;
            this.f39305a = UUID.randomUUID().toString().replace("-", "");
            this.f39305a += "_" + r5;
            this.f39307c = r5;
            this.f39306b = true;
            g0.a(r4, false);
        }

        private void b(long r4) {
            z.c("hmsSdk", "getNewSession() session is flush!");
            String r02 = UUID.randomUUID().toString();
            this.f39305a = r02;
            this.f39305a = r02.replace("-", "");
            this.f39305a += "_" + r4;
            this.f39307c = r4;
            this.f39306b = true;
        }

        public void a(long r5) {
            if (g0.a(this.d) == false) goto L7;
            g0.a(this.d, false);
            b(r5);
            return;
        L7:
            if (b(this.f39307c, r5) == false) goto L9;
        L13:
            b(r5);
            return;
        L9:
            if (a(this.f39307c, r5) == true) goto L13;
            this.f39307c = r5;
            this.f39306b = false;
        }

        private boolean a(long r2, long r4) {
            Calendar r02 = Calendar.getInstance();
            r02.setTimeInMillis(r2);
            Calendar r22 = Calendar.getInstance();
            r22.setTimeInMillis(r4);
            if (r02.get(1) == r22.get(1)) goto L5;
        L9:
            return true;
        L5:
            if (r02.get(6) != r22.get(6)) goto L9;
            return false;
        }

        private boolean b(long r1, long r3) {
            if ((r3 - r1) < g0.b(this.d)) goto L6;
            return true;
        L6:
            return false;
        }
    }

    public g0() {
        this.f39302a = 1800000;
        this.f39303b = false;
        this.f39304c = null;
    }

    public static /* synthetic */ long b(g0 r2) {
        return r2.f39302a;
    }

    public String a() {
        a r02 = this.f39304c;
        if (r02 != null) goto L7;
        z.f("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    L7:
        return r02.f39305a;
    }

    public void a(long r3) {
        a r02 = this.f39304c;
        if (r02 != null) goto L6;
        z.c("hmsSdk", "Session is first flush");
        this.f39304c = new a(this, r3);
        return;
    L6:
        r02.a(r3);
    }

    public boolean b() {
        a r02 = this.f39304c;
        if (r02 != null) goto L7;
        z.f("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    L7:
        return r02.f39306b;
    }

    public static /* synthetic */ boolean a(g0 r02) {
        return r02.f39303b;
    }

    public static /* synthetic */ boolean a(g0 r02, boolean r1) {
        r02.f39303b = r1;
        return r1;
    }
}
