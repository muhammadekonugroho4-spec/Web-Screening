package I0;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;

/* renamed from: I0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2032d extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: g, reason: collision with root package name */
    public static final C2032d f869g = null;

    static {
        f869g = new C2032d();
    }

    public C2032d() {
        super(0);
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
