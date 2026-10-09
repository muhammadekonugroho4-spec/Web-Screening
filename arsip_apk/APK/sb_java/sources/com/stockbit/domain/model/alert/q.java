package com.stockbit.domain.model.alert;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f80627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80628b;

    public q(int r1, int r2) {
        this.f80627a = r1;
        this.f80628b = r2;
    }

    public final int a() {
        return this.f80627a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (this.f80627a == r52.f80627a) goto L12;
        return false;
    L12:
        if (this.f80628b == r52.f80628b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f80627a) * 31) + Integer.hashCode(this.f80628b);
    }

    public String toString() {
        return "AlertSummaryEntity(unseenTriggeredCount=" + this.f80627a + ", activeAlertCount=" + this.f80628b + ")";
    }
}
