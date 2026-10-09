package com.stockbit.usecase.social.subscription;

import com.stockbit.usecase.globalsetting.GlobalSettingFeatureConfig;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final GlobalSettingFeatureConfig f162965a;

    public a(GlobalSettingFeatureConfig r2) {
        p.l(r2, "globalSettingFeatureConfig");
        this.f162965a = r2;
    }

    public final boolean a() {
        return this.f162965a.s();
    }
}
