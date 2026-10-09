package w;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12269a extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: g, reason: collision with root package name */
    public static final C12269a f184417g = null;

    static {
        f184417g = new C12269a();
    }

    public C12269a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
