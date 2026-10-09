package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.company.CompanyEntryPoint;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f179235a;

        /* renamed from: b, reason: collision with root package name */
        public final String f179236b;

        public a(String r2, String r3) {
            p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
            p.l(r3, CompanyEntryPoint.EXTRA_DESC);
            super(null);
            this.f179235a = r2;
            this.f179236b = r3;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        public String a() {
            return c() + ':' + b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        public String b() {
            return this.f179236b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        public String c() {
            return this.f179235a;
        }

        public final String d() {
            return this.f179235a;
        }

        public final String e() {
            return this.f179236b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f179235a, r52.f179235a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f179236b, r52.f179236b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f179235a.hashCode() * 31) + this.f179236b.hashCode();
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f179237a;

        /* renamed from: b, reason: collision with root package name */
        public final String f179238b;

        public b(String r2, String r3) {
            p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
            p.l(r3, CompanyEntryPoint.EXTRA_DESC);
            super(null);
            this.f179237a = r2;
            this.f179238b = r3;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        public String a() {
            return c() + b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        public String b() {
            return this.f179238b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        public String c() {
            return this.f179237a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f179237a, r52.f179237a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f179238b, r52.f179238b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f179237a.hashCode() * 31) + this.f179238b.hashCode();
        }
    }

    public /* synthetic */ d(kotlin.jvm.internal.i r1) {
        this();
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return a();
    }

    public d() {
    }
}
