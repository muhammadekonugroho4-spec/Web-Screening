package D0;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final ProgressBar f538a;

    public b(ProgressBar r2) {
        p.l(r2, NotificationCompat.CATEGORY_PROGRESS);
        this.f538a = r2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView r1, String r2) {
        super.onPageFinished(r1, r2);
        this.f538a.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView r1, String r2, Bitmap r3) {
        super.onPageStarted(r1, r2, r3);
        this.f538a.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView r2, WebResourceRequest r3, WebResourceError r4) {
        this.f538a.setVisibility(8);
        if (r2 == null) goto L9;
        if (r4 == null) goto L6;
        CharSequence r32 = r4.getDescription();
    L7:
        r2.loadData("ERROR " + r32, "text/html", "UTF-8");
        return;
    L6:
        r32 = null;
        goto L7
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView r2, SslErrorHandler r3, SslError r4) {
        super.onReceivedSslError(r2, r3, r4);
        if (r3 == null) goto L5;
        r3.cancel();
    L5:
        if (r2 == null) goto L8;
        r2.loadData("ERROR", "text/html", "UTF-8");
        return;
    }
}
