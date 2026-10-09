package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29552a = null;

    static {
        String r02 = androidx.work.r.i("WakeLocks");
        kotlin.jvm.internal.p.k(r02, "tagWithPrefix(\"WakeLocks\")");
        f29552a = r02;
    }

    public static final void a() {
        LinkedHashMap r02 = new LinkedHashMap();
        G r1 = G.f29559a;
        monitor-enter(r1);
        r02.putAll(r1.a());     // Catch: Throwable -> L15
        kotlin.w r2 = kotlin.w.f180450a;     // Catch: Throwable -> L15
        monitor-exit(r1);
        Iterator r03 = r02.entrySet().iterator();
    L8:
        if (r03.hasNext() == false) goto L14;
        Map.Entry r12 = (Map.Entry) r03.next();
        PowerManager.WakeLock r22 = (PowerManager.WakeLock) r12.getKey();
        String r13 = (String) r12.getValue();
        if (r22 == null) goto L8;
        if (r22.isHeld() != true) goto L8;
        androidx.work.r.e().k(f29552a, "WakeLock held for " + r13);
        goto L8
    L14:
        return;
    L15:
        th = move-exception;
        throw th;
    }

    public static final PowerManager.WakeLock b(Context r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "context");
        kotlin.jvm.internal.p.l(r3, "tag");
        Object r22 = r2.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.p.j(r22, "null cannot be cast to non-null type android.os.PowerManager");
        String r32 = "WorkManager: " + r3;
        PowerManager.WakeLock r23 = ((PowerManager) r22).newWakeLock(1, r32);
        G r02 = G.f29559a;
        monitor-enter(r02);
        String r33 = (String) r02.a().put(r23, r32);     // Catch: Throwable -> L8
        monitor-exit(r02);
        kotlin.jvm.internal.p.k(r23, "wakeLock");
        return r23;
    L8:
        th = move-exception;
        throw th;
    }
}
