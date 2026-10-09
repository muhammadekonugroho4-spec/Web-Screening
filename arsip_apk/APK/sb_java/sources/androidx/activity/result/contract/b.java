package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.a;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public class b extends a {
    public b() {
    }

    @Override // androidx.activity.result.contract.a
    public /* bridge */ /* synthetic */ Intent a(Context r1, Object r2) {
        return d(r1, (String) r2);
    }

    @Override // androidx.activity.result.contract.a
    public /* bridge */ /* synthetic */ a.C0023a b(Context r1, Object r2) {
        return e(r1, (String) r2);
    }

    @Override // androidx.activity.result.contract.a
    public /* bridge */ /* synthetic */ Object c(int r1, Intent r2) {
        return f(r1, r2);
    }

    public Intent d(Context r2, String r3) {
        p.l(r2, "context");
        p.l(r3, "input");
        Intent r22 = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(r3);
        p.k(r22, "setType(...)");
        return r22;
    }

    public final a.C0023a e(Context r2, String r3) {
        p.l(r2, "context");
        p.l(r3, "input");
        return null;
    }

    public final Uri f(int r3, Intent r4) {
        if (r3 == (-1)) goto L6;
        r4 = null;
    L6:
        if (r4 != null) goto L8;
        return null;
    L8:
        return r4.getData();
    }
}
