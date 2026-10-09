package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final String f174746a;

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f174747b;

    public D(String r4) {
        this.f174746a = r4;
        Pattern r42 = Pattern.compile(r4);     // Catch: Throwable -> L5
    L6:
        this.f174747b = r42;
        return;
    L5:
        V1.q().i().getLogger().c(SentryLevel.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", new Object[]{r4});
        r42 = null;
        goto L6
    }

    public String a() {
        return this.f174746a;
    }

    public boolean b(String r2) {
        Pattern r02 = this.f174747b;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.matcher(r2).matches();
    }

    public boolean equals(Object r3) {
        if (r3 != null) goto L4;
        return false;
    L4:
        if (D.class == r3.getClass()) goto L7;
        return false;
    L7:
        return Objects.equals(this.f174746a, ((D) r3).f174746a);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f174746a});
    }
}
