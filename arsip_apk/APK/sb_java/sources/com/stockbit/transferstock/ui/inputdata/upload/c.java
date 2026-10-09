package com.stockbit.transferstock.ui.inputdata.upload;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f151021a = null;

        static {
            f151021a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final List f151022a;

        static {
        }

        public b(List r2) {
            p.l(r2, "listUrlToSubmit");
            super(null);
            this.f151022a = r2;
        }

        public final List a() {
            return this.f151022a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f151022a, ((b) r4).f151022a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f151022a.hashCode();
        }

        public String toString() {
            return "OnDoneUpload(listUrlToSubmit=" + this.f151022a + ')';
        }
    }

    /* renamed from: com.stockbit.transferstock.ui.inputdata.upload.c$c, reason: collision with other inner class name */
    public static final class C1372c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f151023a;

        static {
        }

        public C1372c(String r2) {
            p.l(r2, "image");
            super(null);
            this.f151023a = r2;
        }

        public final String a() {
            return this.f151023a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1372c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f151023a, ((C1372c) r4).f151023a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f151023a.hashCode();
        }

        public String toString() {
            return "OnImageClicked(image=" + this.f151023a + ')';
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f151024a = null;

        static {
            f151024a = new d();
        }

        public d() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
