package com.stockbit.domain.model.valueobject.stream;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f87179a;

    /* renamed from: b, reason: collision with root package name */
    public String f87180b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f87181c;
    public final Integer d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87182e;

    public n(String r1, String r2, Integer r3, Integer r4, String r5) {
        this.f87179a = r1;
        this.f87180b = r2;
        this.f87181c = r3;
        this.d = r4;
        this.f87182e = r5;
    }

    public final String a() {
        return this.f87180b;
    }

    public final String b() {
        return this.f87182e;
    }

    public final String c() {
        return this.f87179a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (p.g(this.f87179a, r52.f87179a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87180b, r52.f87180b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87181c, r52.f87181c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f87182e, r52.f87182e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        String r02 = this.f87179a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f87180b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.f87181c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f87182e;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return r07 + r1;
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "YoutubeMeta(title=" + this.f87179a + ", providerUrl=" + this.f87180b + ", thumbnailHeight=" + this.f87181c + ", thumbnailWidth=" + this.d + ", thumbnailUrl=" + this.f87182e + ')';
    }
}
