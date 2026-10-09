package g0;

import android.content.SharedPreferences;
import kotlin.jvm.internal.p;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11452e implements InterfaceC11451d {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f174323a;

    public C11452e(SharedPreferences r2) {
        p.l(r2, "preferences");
        this.f174323a = r2;
    }

    public final void a(String r3) {
        p.l(r3, "path");
        this.f174323a.edit().putString("ml_models_path", r3).apply();
    }

    public final void b(boolean r3) {
        this.f174323a.edit().putBoolean("ml_models_download_retry", r3).apply();
    }
}
