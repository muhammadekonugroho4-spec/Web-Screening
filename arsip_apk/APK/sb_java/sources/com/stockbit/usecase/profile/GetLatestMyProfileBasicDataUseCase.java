package com.stockbit.usecase.profile;

import com.stockbit.repository.S;
import kotlin.coroutines.e;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes2.dex */
public final class GetLatestMyProfileBasicDataUseCase {

    /* renamed from: a, reason: collision with root package name */
    public final S f159352a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.features.model.a f159353b;

    public GetLatestMyProfileBasicDataUseCase(S r2, com.stockbit.features.model.a r3) {
        p.l(r2, "myProfileRepository");
        p.l(r3, "appDispatchers");
        this.f159352a = r2;
        this.f159353b = r3;
    }

    public static final /* synthetic */ com.stockbit.features.model.a a(GetLatestMyProfileBasicDataUseCase r02) {
        return r02.f159353b;
    }

    public static final /* synthetic */ S b(GetLatestMyProfileBasicDataUseCase r02) {
        return r02.f159352a;
    }

    public final Object c(e r4) {
        return BuildersKt.withContext(this.f159353b.a(), new GetLatestMyProfileBasicDataUseCase$invoke$2(this, null), r4);
    }
}
