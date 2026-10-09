package androidx.datastore.preferences.core;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.collections.S;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: androidx.datastore.preferences.core.a$a, reason: collision with other inner class name */
    public static final class C0190a {

        /* renamed from: a, reason: collision with root package name */
        public final String f23696a;

        public C0190a(String r2) {
            p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.f23696a = r2;
        }

        public final String a() {
            return this.f23696a;
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof C0190a) == true) goto L5;
            return false;
        L5:
            return p.g(this.f23696a, ((C0190a) r2).f23696a);
        }

        public int hashCode() {
            return this.f23696a.hashCode();
        }

        public String toString() {
            return this.f23696a;
        }
    }

    public static final class b {
    }

    public a() {
    }

    public abstract Map a();

    public abstract boolean b(C0190a r1);

    public abstract Object c(C0190a r1);

    public final MutablePreferences d() {
        return new MutablePreferences(S.E(a()), false);
    }

    public final a e() {
        return new MutablePreferences(S.E(a()), true);
    }
}
