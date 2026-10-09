package com.facebook;

import com.google.firebase.perf.FirebasePerformance;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/HttpMethod;", "", "(Ljava/lang/String;I)V", FirebasePerformance.HttpMethod.GET, FirebasePerformance.HttpMethod.POST, FirebasePerformance.HttpMethod.DELETE, "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum HttpMethod extends Enum<HttpMethod> {
    public static final HttpMethod DELETE = null;
    public static final HttpMethod GET = null;
    public static final HttpMethod POST = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ HttpMethod[] f35683a = null;

    static {
        GET = new HttpMethod(FirebasePerformance.HttpMethod.GET, 0);
        POST = new HttpMethod(FirebasePerformance.HttpMethod.POST, 1);
        DELETE = new HttpMethod(FirebasePerformance.HttpMethod.DELETE, 2);
        f35683a = a();
    }

    HttpMethod(String r1, int r2) {
    }

    public static final /* synthetic */ HttpMethod[] a() {
        return new HttpMethod[]{GET, POST, DELETE};
    }

    public static HttpMethod valueOf(String r1) {
        return (HttpMethod) Enum.valueOf(HttpMethod.class, r1);
    }

    public static HttpMethod[] values() {
        return (HttpMethod[]) f35683a.clone();
    }
}
