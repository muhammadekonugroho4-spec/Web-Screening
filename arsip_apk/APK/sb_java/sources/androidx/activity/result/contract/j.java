package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class j extends androidx.activity.result.contract.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2240a = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f2240a = new a(null);
    }

    public j() {
    }

    @Override // androidx.activity.result.contract.a
    public /* bridge */ /* synthetic */ Intent a(Context r1, Object r2) {
        return d(r1, (Intent) r2);
    }

    @Override // androidx.activity.result.contract.a
    public /* bridge */ /* synthetic */ Object c(int r1, Intent r2) {
        return e(r1, r2);
    }

    public Intent d(Context r2, Intent r3) {
        p.l(r2, "context");
        p.l(r3, "input");
        return r3;
    }

    public ActivityResult e(int r2, Intent r3) {
        return new ActivityResult(r2, r3);
    }
}
