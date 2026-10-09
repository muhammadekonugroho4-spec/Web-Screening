package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f175424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f175425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f175426c;
    public int d;

    public b(ArrayList r2) {
        this.f175424a = r2;
        this.f175425b = 0;
        this.f175426c = r2.size();
    }

    public static b c(BufferedReader r4) {
        ArrayList r02 = new ArrayList();
        int r1 = 0;
    L3:
        String r2 = r4.readLine();
        if (r2 == null) goto L7;
        r1 = r1 + 1;
        r02.add(new a(r1, r2));
        goto L3
    L7:
        return new b(r02);
    }

    public boolean a() {
        if (this.d >= this.f175426c) goto L6;
        return true;
    L6:
        return false;
    }

    public a b() {
        int r02 = this.d;
        if (r02 >= this.f175425b) goto L5;
        return null;
    L5:
        if (r02 >= this.f175426c) goto L10;
        ArrayList r1 = this.f175424a;
        this.d = r02 + 1;
        return (a) r1.get(r02);
    L10:
        return null;
    }

    public void d() {
        this.d--;
    }
}
