package androidx.collection.internal;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6451a;

    public c(int r3, float r4) {
        this.f6451a = new LinkedHashMap(r3, r4, true);
    }

    public final Object a(Object r2) {
        p.l(r2, Constants.KEY_KEY);
        return this.f6451a.get(r2);
    }

    public final Set b() {
        Set r02 = this.f6451a.entrySet();
        p.k(r02, "<get-entries>(...)");
        return r02;
    }

    public final boolean c() {
        return this.f6451a.isEmpty();
    }

    public final Object d(Object r2, Object r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        return this.f6451a.put(r2, r3);
    }

    public final Object e(Object r2) {
        p.l(r2, Constants.KEY_KEY);
        return this.f6451a.remove(r2);
    }
}
