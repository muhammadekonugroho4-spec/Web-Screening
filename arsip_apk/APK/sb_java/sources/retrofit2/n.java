package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Class f183475a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f183476b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f183477c;
    public final List d;

    public n(Class r1, Object r2, Method r3, List r4) {
        this.f183475a = r1;
        this.f183476b = r2;
        this.f183477c = r3;
        this.d = Collections.unmodifiableList(r4);
    }

    public Method a() {
        return this.f183477c;
    }

    public Class b() {
        return this.f183475a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f183475a.getName(), this.f183477c.getName(), this.d});
    }
}
