package io.reactivex.schedulers;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f174664a;

    /* renamed from: b, reason: collision with root package name */
    public final long f174665b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f174666c;

    public b(Object r1, long r2, TimeUnit r4) {
        this.f174664a = r1;
        this.f174665b = r2;
        this.f174666c = (TimeUnit) io.reactivex.internal.functions.b.d(r4, "unit is null");
    }

    public long a() {
        return this.f174665b;
    }

    public Object b() {
        return this.f174664a;
    }

    public boolean equals(Object r7) {
        if ((r7 instanceof b) == false) goto L12;
        b r72 = (b) r7;
        if (io.reactivex.internal.functions.b.c(this.f174664a, r72.f174664a) == false) goto L12;
        if (this.f174665b != r72.f174665b) goto L12;
        if (io.reactivex.internal.functions.b.c(this.f174666c, r72.f174666c) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public int hashCode() {
        Object r02 = this.f174664a;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L6:
        long r2 = this.f174665b;
        return (((r03 * 31) + ((int) (r2 ^ (r2 >>> 31)))) * 31) + this.f174666c.hashCode();
    L5:
        r03 = 0;
        goto L6
    }

    public String toString() {
        return "Timed[time=" + this.f174665b + ", unit=" + this.f174666c + ", value=" + this.f174664a + Constants.AES_SUFFIX;
    }
}
