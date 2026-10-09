package B0;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class a extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f410g = null;

    static {
        f410g = new a();
    }

    public a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
