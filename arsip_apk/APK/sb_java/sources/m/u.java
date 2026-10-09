package m;

import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class u extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f180960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f180961b;

    public u(String r1, String r2) {
        this.f180960a = r1;
        this.f180961b = r2;
        super(0);
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        return "Header -> " + this.f180960a + " : " + this.f180961b;
    }
}
