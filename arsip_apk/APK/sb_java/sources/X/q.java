package X;

import android.content.Context;
import com.iab.digitalidentity.sdk.core.extra.SInitializer;

/* loaded from: classes.dex */
public final class q extends x {

    /* renamed from: c, reason: collision with root package name */
    public final Context f1325c;

    public q(Context r2) {
        kotlin.jvm.internal.p.l(r2, "context");
        this.f1325c = r2;
    }

    @Override // X.x
    public final boolean a() {
        return y.a(this, SInitializer.INSTANCE.a(this.f1325c));
    }

    @Override // X.x
    public final String b() {
        return "RD";
    }
}
