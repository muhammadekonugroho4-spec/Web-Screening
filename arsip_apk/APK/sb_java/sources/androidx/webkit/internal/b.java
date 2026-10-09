package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public abstract class b {
    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }
}
