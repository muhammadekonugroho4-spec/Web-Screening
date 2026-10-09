package com.stockbit.stream.ui.research.adapter;

import com.stockbit.domain.model.type.stream.HeaderStatus;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class n {

    public static final class a extends n {

        /* renamed from: a, reason: collision with root package name */
        public final String f144736a;

        static {
        }

        public a(String r2) {
            p.l(r2, "keyword");
            super(null);
            this.f144736a = r2;
        }

        public final String a() {
            return this.f144736a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f144736a, ((a) r4).f144736a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f144736a.hashCode();
        }

        public String toString() {
            return "HeaderSearchBar(keyword=" + this.f144736a + ')';
        }
    }

    public static final class b extends n {

        /* renamed from: a, reason: collision with root package name */
        public final HeaderStatus f144737a;

        static {
        }

        public b(HeaderStatus r2) {
            p.l(r2, "headerStatus");
            super(null);
            this.f144737a = r2;
        }

        public final HeaderStatus a() {
            return this.f144737a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f144737a == ((b) r4).f144737a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f144737a.hashCode();
        }

        public String toString() {
            return "HeaderUpdateNetworkStatus(headerStatus=" + this.f144737a + ')';
        }
    }

    static {
    }

    public /* synthetic */ n(kotlin.jvm.internal.i r1) {
        this();
    }

    public n() {
    }
}
