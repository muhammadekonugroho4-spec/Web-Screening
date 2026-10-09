package com.huawei.hms.hatool;

import android.util.Log;

/* loaded from: classes6.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f39281a;

    /* renamed from: b, reason: collision with root package name */
    private int f39282b;

    public a0() {
        this.f39281a = false;
        this.f39282b = 4;
    }

    private static String a() {
        return "FormalHASDK_2.2.0.313" + l1.a();
    }

    public void b(int r2, String r3, String r4) {
        a(r2, "FormalHASDK", r3 + "=> " + r4);
    }

    public void a(int r3) {
        Log.i("FormalHASDK", System.lineSeparator() + "======================================= " + System.lineSeparator() + a() + "" + System.lineSeparator() + "=======================================");
        this.f39282b = r3;
        this.f39281a = true;
    }

    public boolean b(int r2) {
        if (this.f39281a == true) goto L5;
        return false;
    L5:
        if (r2 < this.f39282b) goto L10;
        return true;
    L10:
        return false;
    }

    public void a(int r2, String r3, String r4) {
        if (r2 != 3) goto L5;
        Log.d(r3, r4);
        return;
    L5:
        if (r2 != 5) goto L7;
        Log.w(r3, r4);
        return;
    L7:
        if (r2 == 6) goto L10;
        Log.i(r3, r4);
        return;
    L10:
        Log.e(r3, r4);
    }
}
