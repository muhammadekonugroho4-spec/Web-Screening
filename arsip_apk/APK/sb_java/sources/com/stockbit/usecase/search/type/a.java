package com.stockbit.usecase.search.type;

import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f160160a;

    /* renamed from: b, reason: collision with root package name */
    public final List f160161b;

    /* renamed from: com.stockbit.usecase.search.type.a$a, reason: collision with other inner class name */
    public static final class C1608a extends a {

        /* renamed from: c, reason: collision with root package name */
        public final String f160162c;
        public final List d;

        public C1608a(String r3, List r4) {
            p.l(r3, "query");
            p.l(r4, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super("$", r4, null);
            this.f160162c = r3;
            this.d = r4;
        }

        public final String a() {
            return this.f160162c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1608a) == true) goto L8;
            return false;
        L8:
            C1608a r52 = (C1608a) r5;
            if (p.g(this.f160162c, r52.f160162c) == true) goto L12;
            return false;
        L12:
            if (p.g(this.d, r52.d) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f160162c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            return "CompanyFilter(query=" + this.f160162c + ", data=" + this.d + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        public final String f160163c;
        public final List d;

        public b(String r3, List r4) {
            p.l(r3, "query");
            p.l(r4, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super("@", r4, null);
            this.f160163c = r3;
            this.d = r4;
        }

        public final String a() {
            return this.f160163c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f160163c, r52.f160163c) == true) goto L12;
            return false;
        L12:
            if (p.g(this.d, r52.d) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f160163c.hashCode() * 31) + this.d.hashCode();
        }

        public String toString() {
            return "PeopleFilter(query=" + this.f160163c + ", data=" + this.d + ")";
        }
    }

    public /* synthetic */ a(String r1, List r2, i r3) {
        this(r1, r2);
    }

    public a(String r1, List r2) {
        this.f160160a = r1;
        this.f160161b = r2;
    }
}
