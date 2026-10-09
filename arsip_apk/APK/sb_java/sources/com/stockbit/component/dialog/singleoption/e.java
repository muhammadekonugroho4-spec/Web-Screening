package com.stockbit.component.dialog.singleoption;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class e {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f70841a;

    /* renamed from: b, reason: collision with root package name */
    public final a f70842b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70843c;

    static {
    }

    public e(List r2, a r3, String r4) {
        p.l(r2, "options");
        p.l(r4, Constants.KEY_TITLE);
        this.f70841a = r2;
        this.f70842b = r3;
        this.f70843c = r4;
    }

    public final List a() {
        return this.f70841a;
    }

    public final a b() {
        return this.f70842b;
    }

    public final String c() {
        return this.f70843c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f70841a, r52.f70841a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f70842b, r52.f70842b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f70843c, r52.f70843c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f70841a.hashCode() * 31;
        a r1 = this.f70842b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.f70843c.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "DialogSingleOptionUIState(options=" + this.f70841a + ", selectedOption=" + this.f70842b + ", title=" + this.f70843c + ')';
    }
}
