package retrofit2;

import java.util.concurrent.Executor;
import retrofit2.c;
import retrofit2.s;

/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f183534a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final s f183535b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final c f183536c = null;

    static {
        String r02 = System.getProperty("java.vm.name");
        r02.getClass();
        if (r02.equals("RoboVM") == false) goto L5;
        f183534a = null;
        f183535b = new s();
        f183536c = new c();
        return;
    L5:
        if (r02.equals("Dalvik") == true) goto L8;
        f183534a = null;
        f183535b = new s.b();
        f183536c = new c.a();
        return;
    L8:
        f183534a = new ExecutorC12128a();
        f183535b = new s.a();
        f183536c = new c.a();
    }
}
