package com.stockbit.component.dialog.option;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class e {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f70307a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f70308b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f70309c;

    static {
    }

    public e(String r2, Object r3, boolean r4) {
        p.l(r2, Constants.KEY_TITLE);
        this.f70307a = r2;
        this.f70308b = r3;
        this.f70309c = r4;
    }

    public final Object a() {
        return this.f70308b;
    }

    public final String b() {
        return this.f70307a;
    }

    public final boolean c() {
        return this.f70309c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f70307a, r52.f70307a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f70308b, r52.f70308b) == true) goto L15;
        return false;
    L15:
        if (this.f70309c == r52.f70309c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f70307a.hashCode() * 31;
        Object r1 = this.f70308b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Boolean.hashCode(this.f70309c);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "OptionUIState(title=" + this.f70307a + ", param=" + this.f70308b + ", isSelected=" + this.f70309c + ')';
    }
}
