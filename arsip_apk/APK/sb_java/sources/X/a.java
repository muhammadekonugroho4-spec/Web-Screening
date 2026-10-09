package X;

import android.content.Context;
import com.iab.digitalidentity.sdk.core.extra.SInitializer;

/* loaded from: classes.dex */
public final class a extends x {

    /* renamed from: c, reason: collision with root package name */
    public final Context f1321c;

    public a(Context r2) {
        kotlin.jvm.internal.p.l(r2, "context");
        this.f1321c = r2;
    }

    @Override // X.x
    public final boolean a() {
        return y.a(this, SInitializer.INSTANCE.h(this.f1321c));
    }

    @Override // X.x
    public final String b() {
        return "AC";
    }
}
