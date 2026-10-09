package androidx.sqlite.util;

import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0256a f28122e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final Map f28123f = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28124a;

    /* renamed from: b, reason: collision with root package name */
    public final File f28125b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f28126c;
    public FileChannel d;

    /* renamed from: androidx.sqlite.util.a$a, reason: collision with other inner class name */
    public static final class C0256a {
        public /* synthetic */ C0256a(i r1) {
            this();
        }

        public static final /* synthetic */ Lock a(C0256a r02, String r1) {
            return r02.b(r1);
        }

        public final Lock b(String r4) {
            Map r02 = a.a();
            monitor-enter(r02);
            Map r1 = a.a();     // Catch: Throwable -> L7
            Object r2 = r1.get(r4);     // Catch: Throwable -> L7
            if (r2 != null) goto L9;
            r2 = new ReentrantLock();     // Catch: Throwable -> L7
            r1.put(r4, r2);     // Catch: Throwable -> L7
        L9:
            Lock r22 = (Lock) r2;     // Catch: Throwable -> L7
            monitor-exit(r02);
            return r22;
        L7:
            th = move-exception;
            throw th;
        }

        public C0256a() {
        }
    }

    static {
        f28122e = new C0256a(null);
        f28123f = new HashMap();
    }

    public a(String r3, File r4, boolean r5) {
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f28124a = r5;
        if (r4 == null) goto L5;
        File r52 = new File(r4, r3 + ".lck");
    L6:
        this.f28125b = r52;
        this.f28126c = C0256a.a(f28122e, r3);
        return;
    L5:
        r52 = null;
        goto L6
    }

    public static final /* synthetic */ Map a() {
        return f28123f;
    }

    public static /* synthetic */ void c(a r02, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = r02.f28124a;
    L5:
        r02.b(r1);
    }

    public final void b(boolean r3) {
        this.f28126c.lock();
        if (r3 == false) goto L18;
        File r32 = this.f28125b;     // Catch: IOException -> L9
        if (r32 == null) goto L14;
        File r33 = r32.getParentFile();     // Catch: IOException -> L9
        if (r33 == null) goto L11;
        r33.mkdirs();     // Catch: IOException -> L9
    L11:
        FileChannel r34 = new FileOutputStream(this.f28125b).getChannel();     // Catch: IOException -> L9
        r34.lock();     // Catch: IOException -> L9
        this.d = r34;     // Catch: IOException -> L9
        return;
    L14:
        throw new IOException("No lock directory was provided.");     // Catch: IOException -> L9
    L9:
        e = move-exception;
        this.d = null;
        Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
        return;
    }

    public final void d() {
        FileChannel r02 = this.d;     // Catch: IOException -> L7
        if (r02 == null) goto L5;
        r02.close();     // Catch: IOException -> L7
    L5:
        this.f28126c.unlock();
    }
}
