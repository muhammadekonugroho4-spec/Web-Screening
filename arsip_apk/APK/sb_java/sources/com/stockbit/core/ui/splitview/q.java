package com.stockbit.core.ui.splitview;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f79105a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f79106b;

    /* renamed from: c, reason: collision with root package name */
    public final int f79107c;

    static {
    }

    public q(boolean r1, boolean r2, int r3) {
        this.f79105a = r1;
        this.f79106b = r2;
        this.f79107c = r3;
    }

    public final int a() {
        return this.f79107c;
    }

    public final boolean b() {
        return this.f79106b;
    }

    public final boolean c() {
        return this.f79105a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (this.f79105a == r52.f79105a) goto L12;
        return false;
    L12:
        if (this.f79106b == r52.f79106b) goto L15;
        return false;
    L15:
        if (this.f79107c == r52.f79107c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f79105a) * 31) + Boolean.hashCode(this.f79106b)) * 31) + Integer.hashCode(this.f79107c);
    }

    public String toString() {
        return "SplitPoseUIState(isExpanded=" + this.f79105a + ", isCollapsed=" + this.f79106b + ", widthPx=" + this.f79107c + ')';
    }

    public /* synthetic */ q(boolean r2, boolean r3, int r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
