package com.stockbit.domain.model.facerecognition;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f83993a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83994b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83995c;

    public a(String r2, String r3, String r4) {
        p.l(r2, NotificationCompat.CATEGORY_STATUS);
        p.l(r3, "purpose");
        p.l(r4, "purposeLabel");
        this.f83993a = r2;
        this.f83994b = r3;
        this.f83995c = r4;
    }

    public final String a() {
        return this.f83994b;
    }

    public final String b() {
        return this.f83995c;
    }

    public final String c() {
        return this.f83993a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f83993a, r52.f83993a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83994b, r52.f83994b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83995c, r52.f83995c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f83993a.hashCode() * 31) + this.f83994b.hashCode()) * 31) + this.f83995c.hashCode();
    }

    public String toString() {
        return "FaceRecognitionRedirectionStatusEntity(status=" + this.f83993a + ", purpose=" + this.f83994b + ", purposeLabel=" + this.f83995c + ")";
    }
}
