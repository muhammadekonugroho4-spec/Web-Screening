package com.appmattus.certificatetransparency.loglist;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.time.Instant;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final a f32345c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f32346a;

    /* renamed from: b, reason: collision with root package name */
    public final Instant f32347b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f32345c = new a(null);
    }

    public h(String r2, Instant r3) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "endDate");
        this.f32346a = r2;
        this.f32347b = r3;
    }

    public final Instant a() {
        return this.f32347b;
    }

    public final String b() {
        return this.f32346a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f32346a, r52.f32346a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f32347b, r52.f32347b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f32346a.hashCode() * 31) + this.f32347b.hashCode();
    }

    public String toString() {
        return "PreviousOperator(name=" + this.f32346a + ", endDate=" + this.f32347b + ')';
    }
}
