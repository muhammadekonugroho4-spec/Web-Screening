package com.stockbit.domain.model.type;

import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f86276a;

    /* renamed from: b, reason: collision with root package name */
    public final List f86277b;

    /* renamed from: com.stockbit.domain.model.type.a$a, reason: collision with other inner class name */
    public static final class C0794a extends a {

        /* renamed from: c, reason: collision with root package name */
        public final String f86278c;
        public final List d;

        public C0794a(String r3, List r4) {
            p.l(r3, "query");
            p.l(r4, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super("$", r4, null);
            this.f86278c = r3;
            this.d = r4;
        }

        @Override // com.stockbit.domain.model.type.a
        public List a() {
            return this.d;
        }

        public final String c() {
            return this.f86278c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0794a) == true) goto L8;
            return false;
        L8:
            C0794a r52 = (C0794a) r5;
            if (p.g(this.f86278c, r52.f86278c) == true) goto L12;
            return false;
        L12:
            if (p.g(this.d, r52.d) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86278c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            return "CompanyFilter(query=" + this.f86278c + ", data=" + this.d + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        public final String f86279c;
        public final List d;

        public b(String r3, List r4) {
            p.l(r3, "query");
            p.l(r4, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super("@", r4, null);
            this.f86279c = r3;
            this.d = r4;
        }

        @Override // com.stockbit.domain.model.type.a
        public List a() {
            return this.d;
        }

        public final String c() {
            return this.f86279c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f86279c, r52.f86279c) == true) goto L12;
            return false;
        L12:
            if (p.g(this.d, r52.d) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86279c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            return "PeopleFilter(query=" + this.f86279c + ", data=" + this.d + ')';
        }
    }

    public /* synthetic */ a(String r1, List r2, i r3) {
        this(r1, r2);
    }

    public abstract List a();

    public final String b() {
        return this.f86276a;
    }

    public a(String r1, List r2) {
        this.f86276a = r1;
        this.f86277b = r2;
    }
}
