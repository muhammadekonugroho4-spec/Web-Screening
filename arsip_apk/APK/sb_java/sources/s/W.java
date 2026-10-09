package s;

import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class W extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f183761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f183762b;

    public W(String r1, Throwable r2) {
        this.f183761a = r1;
        this.f183762b = r2;
        super(0);
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        return "CSNetworkRepositoryImpl#sendEventsHttp#onFailure - " + this.f183761a + ' ' + this.f183762b.getMessage();
    }
}
