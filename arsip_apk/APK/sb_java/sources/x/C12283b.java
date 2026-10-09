package x;

import android.util.Log;
import kotlin.jvm.internal.p;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12283b {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC12282a f184475a;

    public C12283b(EnumC12282a r2) {
        p.l(r2, "logLevel");
        this.f184475a = r2;
    }

    public final void a(kotlin.jvm.functions.a r2) {
        p.l(r2, "message");
        if (this.f184475a.f184474a <= 0) goto L6;
        Log.d("ClickStream", (String) r2.invoke());
        return;
    }
}
