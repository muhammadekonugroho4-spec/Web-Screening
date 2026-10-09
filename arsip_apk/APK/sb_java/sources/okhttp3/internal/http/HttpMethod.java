package okhttp3.internal.http;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.FirebasePerformance;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "<init>", "()V", "", FirebaseAnalytics.Param.METHOD, "", "a", "(Ljava/lang/String;)Z", "e", "b", Constants.INAPP_DATA_TAG, "c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpMethod {

    /* renamed from: a, reason: collision with root package name */
    public static final HttpMethod f181913a = null;

    static {
        f181913a = new HttpMethod();
    }

    private HttpMethod() {
    }

    public static final boolean a(String r1) {
        p.l(r1, FirebaseAnalytics.Param.METHOD);
        if (p.g(r1, FirebasePerformance.HttpMethod.POST) == false) goto L5;
        return true;
    L5:
        if (p.g(r1, FirebasePerformance.HttpMethod.PATCH) == false) goto L7;
        return true;
    L7:
        if (p.g(r1, FirebasePerformance.HttpMethod.PUT) == false) goto L9;
        return true;
    L9:
        if (p.g(r1, FirebasePerformance.HttpMethod.DELETE) == false) goto L11;
        return true;
    L11:
        if (p.g(r1, "MOVE") == true) goto L20;
        return false;
    L20:
        return true;
    }

    public static final boolean b(String r1) {
        p.l(r1, FirebaseAnalytics.Param.METHOD);
        if (p.g(r1, FirebasePerformance.HttpMethod.GET) == false) goto L5;
        return false;
    L5:
        if (p.g(r1, FirebasePerformance.HttpMethod.HEAD) == true) goto L10;
        return true;
    L10:
        return false;
    }

    public static final boolean e(String r1) {
        p.l(r1, FirebaseAnalytics.Param.METHOD);
        if (p.g(r1, FirebasePerformance.HttpMethod.POST) == false) goto L5;
        return true;
    L5:
        if (p.g(r1, FirebasePerformance.HttpMethod.PUT) == false) goto L7;
        return true;
    L7:
        if (p.g(r1, FirebasePerformance.HttpMethod.PATCH) == false) goto L9;
        return true;
    L9:
        if (p.g(r1, "PROPPATCH") == false) goto L11;
        return true;
    L11:
        if (p.g(r1, "REPORT") == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final boolean c(String r2) {
        p.l(r2, FirebaseAnalytics.Param.METHOD);
        return !p.g(r2, "PROPFIND");
    }

    public final boolean d(String r2) {
        p.l(r2, FirebaseAnalytics.Param.METHOD);
        return p.g(r2, "PROPFIND");
    }
}
