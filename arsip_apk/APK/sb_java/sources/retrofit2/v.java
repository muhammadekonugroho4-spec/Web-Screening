package retrofit2;

import java.util.Objects;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.o;

/* loaded from: classes3.dex */
public final class v<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Response f183586a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f183587b;

    /* renamed from: c, reason: collision with root package name */
    public final ResponseBody f183588c;

    public v(Response r1, Object r2, ResponseBody r3) {
        this.f183586a = r1;
        this.f183587b = r2;
        this.f183588c = r3;
    }

    public static v c(int r5, ResponseBody r6) {
        Objects.requireNonNull(r6, "body == null");
        if (r5 < 400) goto L7;
        return d(r6, new Response.Builder().b(new o.c(r6.n(), r6.l())).f(r5).l("Response.error()").o(Protocol.HTTP_1_1).q(new Request.Builder().t("http://localhost/").b()).c());
    L7:
        throw new IllegalArgumentException("code < 400: " + r5);
    }

    public static v d(ResponseBody r2, Response r3) {
        Objects.requireNonNull(r2, "body == null");
        Objects.requireNonNull(r3, "rawResponse == null");
        if (r3.a1() == true) goto L7;
        return new v(r3, null, r2);
    L7:
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static v j(Object r3) {
        return k(r3, new Response.Builder().f(200).l("OK").o(Protocol.HTTP_1_1).q(new Request.Builder().t("http://localhost/").b()).c());
    }

    public static v k(Object r2, Response r3) {
        Objects.requireNonNull(r3, "rawResponse == null");
        if (r3.a1() == false) goto L7;
        return new v(r3, r2, null);
    L7:
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public Object a() {
        return this.f183587b;
    }

    public int b() {
        return this.f183586a.n();
    }

    public ResponseBody e() {
        return this.f183588c;
    }

    public Headers f() {
        return this.f183586a.E();
    }

    public boolean g() {
        return this.f183586a.a1();
    }

    public String h() {
        return this.f183586a.M();
    }

    public Response i() {
        return this.f183586a;
    }

    public String toString() {
        return this.f183586a.toString();
    }
}
