package androidx.lifecycle.viewmodel;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0208a f25731b = null;

    /* renamed from: a, reason: collision with root package name */
    public final Map f25732a;

    /* renamed from: androidx.lifecycle.viewmodel.a$a, reason: collision with other inner class name */
    public static final class C0208a {
        public /* synthetic */ C0208a(i r1) {
            this();
        }

        public C0208a() {
        }
    }

    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final b f25733c = null;

        static {
            f25733c = new b();
        }

        public b() {
        }

        @Override // androidx.lifecycle.viewmodel.a
        public Object a(c r2) {
            p.l(r2, Constants.KEY_KEY);
            return null;
        }
    }

    public interface c {
    }

    static {
        f25731b = new C0208a(null);
    }

    public a() {
        this.f25732a = new LinkedHashMap();
    }

    public abstract Object a(c r1);

    public final Map b() {
        return this.f25732a;
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof a) == true) goto L5;
        return false;
    L5:
        if (p.g(this.f25732a, ((a) r2).f25732a) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public int hashCode() {
        return this.f25732a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.f25732a + ')';
    }
}
