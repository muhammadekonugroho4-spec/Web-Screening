package retrofit2;

import java.util.Objects;

/* loaded from: classes3.dex */
public class HttpException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient v f183429a;
    private final int code;
    private final String message;

    public HttpException(v r2) {
        super(b(r2));
        this.code = r2.b();
        this.message = r2.h();
        this.f183429a = r2;
    }

    public static String b(v r2) {
        Objects.requireNonNull(r2, "response == null");
        return "HTTP " + r2.b() + " " + r2.h();
    }

    public int a() {
        return this.code;
    }

    public String c() {
        return this.message;
    }

    public v d() {
        return this.f183429a;
    }
}
