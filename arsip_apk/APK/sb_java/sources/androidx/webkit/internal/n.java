package androidx.webkit.internal;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes4.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final WebkitToCompatConverterBoundaryInterface f28860a;

    public n(WebkitToCompatConverterBoundaryInterface r1) {
        this.f28860a = r1;
    }

    public h a(WebSettings r3) {
        return new h((WebSettingsBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebSettingsBoundaryInterface.class, this.f28860a.convertSettings(r3)));
    }
}
