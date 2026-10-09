package com.clevertap.android.sdk.inapp.customtemplates;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f34107a;

    /* renamed from: b, reason: collision with root package name */
    public final TemplateArgumentType f34108b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34109c;

    public g(String r2, TemplateArgumentType r3, Object r4) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "type");
        this.f34107a = r2;
        this.f34108b = r3;
        this.f34109c = r4;
    }

    public final Object a() {
        return this.f34109c;
    }

    public final String b() {
        return this.f34107a;
    }

    public final TemplateArgumentType c() {
        return this.f34108b;
    }
}
