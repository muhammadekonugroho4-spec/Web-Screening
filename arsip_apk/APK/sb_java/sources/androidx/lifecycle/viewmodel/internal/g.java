package androidx.lifecycle.viewmodel.internal;

import androidx.activity.S;
import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.p;
import kotlin.w;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f25745a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f25746b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f25747c;
    public volatile boolean d;

    public g() {
        this.f25745a = new f();
        this.f25746b = new LinkedHashMap();
        this.f25747c = new LinkedHashSet();
    }

    public static final /* synthetic */ void a(g r02, AutoCloseable r1) {
        r02.g(r1);
    }

    public static final /* synthetic */ Set b(g r02) {
        return r02.f25747c;
    }

    public static final /* synthetic */ Map c(g r02) {
        return r02.f25746b;
    }

    public final void d(AutoCloseable r3) {
        p.l(r3, "closeable");
        if (this.d == false) goto L6;
        g(r3);
        return;
    L6:
        f r02 = this.f25745a;
        monitor-enter(r02);
        b(this).add(r3);     // Catch: Throwable -> L11
        w r32 = w.f180450a;     // Catch: Throwable -> L11
        monitor-exit(r02);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public final void e(String r3, AutoCloseable r4) {
        p.l(r3, Constants.KEY_KEY);
        p.l(r4, "closeable");
        if (this.d == false) goto L6;
        g(r4);
        return;
    L6:
        f r02 = this.f25745a;
        monitor-enter(r02);
        AutoCloseable r32 = (AutoCloseable) c(this).put(r3, r4);     // Catch: Throwable -> L12
        monitor-exit(r02);
        g(r32);
        return;
    L12:
        th = move-exception;
        throw th;
    }

    public final void f() {
        if (this.d == false) goto L5;
        return;
    L5:
        this.d = true;
        f r02 = this.f25745a;
        monitor-enter(r02);
        Iterator r1 = c(this).values().iterator();     // Catch: Throwable -> L11
    L9:
        if (r1.hasNext() == false) goto L13;
        a(this, (AutoCloseable) r1.next());     // Catch: Throwable -> L11
        goto L9
    L13:
        Iterator r12 = b(this).iterator();     // Catch: Throwable -> L11
    L15:
        if (r12.hasNext() == false) goto L17;
        a(this, (AutoCloseable) r12.next());     // Catch: Throwable -> L11
        goto L15
    L17:
        b(this).clear();     // Catch: Throwable -> L11
        w r13 = w.f180450a;     // Catch: Throwable -> L11
        monitor-exit(r02);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public final void g(AutoCloseable r2) {
        if (r2 != null) goto L9;
        return;
    L9:
        S.a(r2);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }

    public final AutoCloseable h(String r3) {
        p.l(r3, Constants.KEY_KEY);
        f r02 = this.f25745a;
        monitor-enter(r02);
        AutoCloseable r32 = (AutoCloseable) c(this).get(r3);     // Catch: Throwable -> L7
        monitor-exit(r02);
        return r32;
    L7:
        th = move-exception;
        throw th;
    }
}
