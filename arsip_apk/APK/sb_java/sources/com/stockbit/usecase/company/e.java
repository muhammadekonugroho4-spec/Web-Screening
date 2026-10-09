package com.stockbit.usecase.company;

import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f156106a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f156107b;

    public e(String r2, HashMap r3) {
        p.l(r2, Constants.KEY_TEXT);
        this.f156106a = r2;
        this.f156107b = r3;
    }

    public final HashMap a() {
        return this.f156107b;
    }

    public final String b() {
        return this.f156106a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f156106a, r52.f156106a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156107b, r52.f156107b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f156106a.hashCode() * 31;
        HashMap r1 = this.f156107b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "MaskedTextUIState(text=" + this.f156106a + ", masks=" + this.f156107b + ")";
    }
}
