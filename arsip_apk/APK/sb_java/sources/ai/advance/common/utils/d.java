package ai.advance.common.utils;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f1744a;

    /* renamed from: b, reason: collision with root package name */
    public long f1745b;

    /* renamed from: c, reason: collision with root package name */
    public float f1746c;

    public d() {
        this.f1744a = new AtomicLong(0);
    }

    public void a(int r7) {
        if (this.f1745b <= 9223372036854765807L) goto L6;
        this.f1744a.incrementAndGet();
        return;
    L6:
        if (r7 < 0) goto L16;
        float r02 = 1000.0f / r7;
        float r2 = this.f1746c;
        if (r2 != 0.0f) goto L11;
    L14:
        this.f1745b += r7;
        this.f1746c = 1000.0f / (this.f1745b / this.f1744a.incrementAndGet());
        return;
    L11:
        if (Math.abs(r02 - r2) < (this.f1746c * 10.0f)) goto L14;
        return;
    }
}
