package U;

/* loaded from: classes.dex */
public final class y implements dagger.internal.c {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.c f1306a;

    public y(u r1, dagger.internal.c r2) {
        this.f1306a = r2;
    }

    @Override // javax.inject.a
    public final Object get() {
        com.iab.digitalidentity.sdk.core.analytics.a r02 = (com.iab.digitalidentity.sdk.core.analytics.a) this.f1306a.get();
        kotlin.jvm.internal.p.l(r02, "externalEventTrackerProvider");
        return (com.iab.digitalidentity.sdk.core.analytics.a) dagger.internal.g.e(r02);
    }
}
