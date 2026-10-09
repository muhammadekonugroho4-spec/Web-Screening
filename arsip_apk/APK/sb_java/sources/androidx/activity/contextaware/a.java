package androidx.activity.contextaware;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Set f2194a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Context f2195b;

    public a() {
        this.f2194a = new CopyOnWriteArraySet();
    }

    public final void a(b r2) {
        p.l(r2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Context r02 = this.f2195b;
        if (r02 == null) goto L5;
        r2.a(r02);
    L5:
        this.f2194a.add(r2);
    }

    public final void b() {
        this.f2195b = null;
    }

    public final void c(Context r3) {
        p.l(r3, "context");
        this.f2195b = r3;
        Iterator r02 = this.f2194a.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((b) r02.next()).a(r3);
        goto L4
    }

    public final Context d() {
        return this.f2195b;
    }

    public final void e(b r2) {
        p.l(r2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f2194a.remove(r2);
    }
}
