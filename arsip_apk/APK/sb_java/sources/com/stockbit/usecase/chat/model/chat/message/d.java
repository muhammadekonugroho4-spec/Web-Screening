package com.stockbit.usecase.chat.model.chat.message;

import com.clevertap.android.sdk.Constants;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f155258a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f155259b;

    public d(String r2, HashMap r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TEXT);
        this.f155258a = r2;
        this.f155259b = r3;
    }

    public final HashMap a() {
        return this.f155259b;
    }

    public final String b() {
        return this.f155258a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f155258a, r52.f155258a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f155259b, r52.f155259b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f155258a.hashCode() * 31;
        HashMap r1 = this.f155259b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "MaskedTextUIState(text=" + this.f155258a + ", masks=" + this.f155259b + ")";
    }

    public /* synthetic */ d(String r1, HashMap r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        this(r1, r2);
    }
}
