package s;

import kotlin.jvm.internal.Lambda;

/* renamed from: s.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12148a0 extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f183773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f183774b;

    public C12148a0(String r1, Throwable r2) {
        this.f183773a = r1;
        this.f183774b = r2;
        super(0);
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        return "CSNetworkRepositoryImpl#sendEvents#onFailure - " + this.f183773a + ' ' + this.f183774b.getMessage();
    }
}
