package X;

import android.content.Context;
import com.iab.digitalidentity.sdk.core.extra.SInitializer;

/* loaded from: classes.dex */
public final class n extends x {

    /* renamed from: c, reason: collision with root package name */
    public final Context f1324c;

    public n(Context r2) {
        kotlin.jvm.internal.p.l(r2, "context");
        this.f1324c = r2;
    }

    @Override // X.x
    public final boolean a() {
        String r02 = this.f1324c.getFilesDir().getAbsolutePath();
        SInitializer r1 = SInitializer.INSTANCE;
        kotlin.jvm.internal.p.k(r02, "path");
        if (r1.f(r02) != (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // X.x
    public final String b() {
        return "NDR";
    }
}
