package com.huawei.agconnect;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f38818b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final b f38819c = null;
    public static final b d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final b f38820e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final b f38821f = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f38822a;

    static {
        f38818b = new b(0);
        f38819c = new b(1);
        d = new b(2);
        f38820e = new b(3);
        f38821f = new b(4);
    }

    public b(int r1) {
        this.f38822a = r1;
    }

    public String a() {
        int r02 = this.f38822a;
        if (r02 != 1) goto L5;
        return "CN";
    L5:
        if (r02 != 2) goto L7;
        return "DE";
    L7:
        if (r02 != 3) goto L9;
        return "RU";
    L9:
        if (r02 == 4) goto L12;
        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
    L12:
        return "SG";
    }

    public final int b(Object... r1) {
        return Arrays.hashCode(r1);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L13:
        return false;
    L8:
        if (b.class != r5.getClass()) goto L13;
        if (this.f38822a != ((b) r5).f38822a) goto L13;
        return true;
    }

    public int hashCode() {
        return b(new Object[]{Integer.valueOf(this.f38822a)});
    }
}
