package com.stockbit.component.facerecognition.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f71017a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71018b;

    static {
    }

    public a(int r2, String r3) {
        p.l(r3, "description");
        this.f71017a = r2;
        this.f71018b = r3;
    }

    public final String a() {
        return this.f71018b;
    }

    public final int b() {
        return this.f71017a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f71017a == r52.f71017a) goto L12;
        return false;
    L12:
        if (p.g(this.f71018b, r52.f71018b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f71017a) * 31) + this.f71018b.hashCode();
    }

    public String toString() {
        return "FaceRecognitionOnboardingGuidelineUIState(icon=" + this.f71017a + ", description=" + this.f71018b + ')';
    }
}
