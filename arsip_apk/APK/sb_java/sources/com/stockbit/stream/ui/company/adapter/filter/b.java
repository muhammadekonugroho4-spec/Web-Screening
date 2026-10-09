package com.stockbit.stream.ui.company.adapter.filter;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f141950a;

        static {
        }

        public a(boolean r2) {
            super(null);
            this.f141950a = r2;
        }

        public final boolean a() {
            return this.f141950a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f141950a == ((a) r4).f141950a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f141950a);
        }

        public String toString() {
            return "FilterHasNotified(isNotified=" + this.f141950a + ')';
        }
    }

    /* renamed from: com.stockbit.stream.ui.company.adapter.filter.b$b, reason: collision with other inner class name */
    public static final class C1268b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f141951a;

        static {
        }

        public C1268b(String r2) {
            p.l(r2, Constants.KEY_TEXT);
            super(null);
            this.f141951a = r2;
        }

        public final String a() {
            return this.f141951a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1268b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f141951a, ((C1268b) r4).f141951a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f141951a.hashCode();
        }

        public String toString() {
            return "FilterRequestText(text=" + this.f141951a + ')';
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f141952a;

        static {
        }

        public c(boolean r2) {
            super(null);
            this.f141952a = r2;
        }

        public final boolean a() {
            return this.f141952a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f141952a == ((c) r4).f141952a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f141952a);
        }

        public String toString() {
            return "FilterSelection(isSelected=" + this.f141952a + ')';
        }
    }

    static {
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
