package com.stockbit.domain.model.stream.notes;

import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f85851a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f85852b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85853c;

    public c(String r2, Map r3, String r4) {
        p.l(r2, "maskedText");
        p.l(r3, "masks");
        p.l(r4, Constants.KEY_TEXT);
        this.f85851a = r2;
        this.f85852b = r3;
        this.f85853c = r4;
    }

    public final String a() {
        return this.f85851a;
    }

    public final Map b() {
        return this.f85852b;
    }

    public final String c() {
        return this.f85853c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f85851a, r52.f85851a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85852b, r52.f85852b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85853c, r52.f85853c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85851a.hashCode() * 31) + this.f85852b.hashCode()) * 31) + this.f85853c.hashCode();
    }

    public String toString() {
        return "CompanyNoteContentEntity(maskedText=" + this.f85851a + ", masks=" + this.f85852b + ", text=" + this.f85853c + ")";
    }
}
