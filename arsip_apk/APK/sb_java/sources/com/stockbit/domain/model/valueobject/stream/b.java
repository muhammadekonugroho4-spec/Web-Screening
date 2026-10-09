package com.stockbit.domain.model.valueobject.stream;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f87133a;

    /* renamed from: b, reason: collision with root package name */
    public final List f87134b;

    public b(Integer r1, List r2) {
        this.f87133a = r1;
        this.f87134b = r2;
    }

    public final List a() {
        return this.f87134b;
    }

    public final Integer b() {
        return this.f87133a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f87133a, r52.f87133a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87134b, r52.f87134b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f87133a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List r2 = this.f87134b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "PdfPreviewBitmap(page=" + this.f87133a + ", bitmapList=" + this.f87134b + ')';
    }
}
