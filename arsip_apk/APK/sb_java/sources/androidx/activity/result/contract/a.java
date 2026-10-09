package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.activity.result.contract.a$a, reason: collision with other inner class name */
    public static final class C0023a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2230a;

        public C0023a(Object r1) {
            this.f2230a = r1;
        }

        public final Object a() {
            return this.f2230a;
        }
    }

    public a() {
    }

    public abstract Intent a(Context r1, Object r2);

    public C0023a b(Context r1, Object r2) {
        p.l(r1, "context");
        return null;
    }

    public abstract Object c(int r1, Intent r2);
}
