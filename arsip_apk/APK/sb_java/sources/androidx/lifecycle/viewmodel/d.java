package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.a;
import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class d extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.lifecycle.viewmodel.a
    public Object a(a.c r2) {
        p.l(r2, Constants.KEY_KEY);
        return b().get(r2);
    }

    public final void c(a.c r2, Object r3) {
        p.l(r2, Constants.KEY_KEY);
        b().put(r2, r3);
    }

    public d(Map r2) {
        p.l(r2, "initialExtras");
        b().putAll(r2);
    }

    public d(a r2) {
        p.l(r2, "initialExtras");
        this(r2.b());
    }

    public /* synthetic */ d(a r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = a.b.f25733c;
    L5:
        this(r1);
    }
}
