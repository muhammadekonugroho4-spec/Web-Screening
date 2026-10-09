package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f178079a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f178080b;

    public e0(String r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f178079a = r2;
        this.f178080b = r3;
    }

    public Integer a(e0 r2) {
        kotlin.jvm.internal.p.l(r2, "visibility");
        return d0.f178062a.a(this, r2);
    }

    public String b() {
        return this.f178079a;
    }

    public final boolean c() {
        return this.f178080b;
    }

    public e0 d() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
