package D0;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class a extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final ProgressBar f537a;

    public a(ProgressBar r2) {
        p.l(r2, NotificationCompat.CATEGORY_PROGRESS);
        this.f537a = r2;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView r1, int r2) {
        super.onProgressChanged(r1, r2);
        this.f537a.setProgress(r2);
    }
}
