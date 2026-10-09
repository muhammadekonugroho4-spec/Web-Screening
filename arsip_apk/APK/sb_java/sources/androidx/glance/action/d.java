package androidx.glance.action;

import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class d {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f24650a;

        static {
        }

        public a(String r1) {
            this.f24650a = r1;
        }

        public final String a() {
            return this.f24650a;
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof a) == true) goto L5;
            return false;
        L5:
            if (p.g(this.f24650a, ((a) r2).f24650a) == false) goto L10;
            return true;
        L10:
            return false;
        }

        public int hashCode() {
            return this.f24650a.hashCode();
        }

        public String toString() {
            return this.f24650a;
        }
    }

    public static final class b {
    }

    static {
    }

    public d() {
    }

    public abstract Map a();
}
