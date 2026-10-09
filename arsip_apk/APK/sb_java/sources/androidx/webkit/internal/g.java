package androidx.webkit.internal;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f28786c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f28787a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28788b;

    public static class a extends g {
        public a(String r1, String r2) {
            super(r1, r2);
        }
    }

    public static class b extends g {
        public b(String r1, String r2) {
            super(r1, r2);
        }
    }

    static {
        f28786c = new HashSet();
    }

    public g(String r1, String r2) {
        this.f28787a = r1;
        this.f28788b = r2;
        f28786c.add(this);
    }
}
