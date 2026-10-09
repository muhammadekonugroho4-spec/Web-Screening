package com.stockbit.profiletrading.ui.account.upload;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes10.dex */
public abstract class w {

    public static final class a extends w {

        /* renamed from: a, reason: collision with root package name */
        public final String f128449a;

        /* renamed from: b, reason: collision with root package name */
        public final String f128450b;

        static {
        }

        public a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
            kotlin.jvm.internal.p.l(r3, "message");
            super(null);
            this.f128449a = r2;
            this.f128450b = r3;
        }

        public final String a() {
            return this.f128449a;
        }

        public final String b() {
            return this.f128450b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f128449a, r52.f128449a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f128450b, r52.f128450b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f128449a.hashCode() * 31) + this.f128450b.hashCode();
        }

        public String toString() {
            return "Error(key=" + this.f128449a + ", message=" + this.f128450b + ')';
        }
    }

    public static final class b extends w {

        /* renamed from: a, reason: collision with root package name */
        public static final b f128451a = null;

        static {
            f128451a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1989277422;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c extends w {

        /* renamed from: a, reason: collision with root package name */
        public final String f128452a;

        /* renamed from: b, reason: collision with root package name */
        public final String f128453b;

        /* renamed from: c, reason: collision with root package name */
        public final com.stockbit.profiletrading.ui.account.webview.model.a f128454c;

        static {
        }

        public c(String r2, String r3, com.stockbit.profiletrading.ui.account.webview.model.a r4) {
            kotlin.jvm.internal.p.l(r2, "fileUrl");
            kotlin.jvm.internal.p.l(r3, "viewUrl");
            kotlin.jvm.internal.p.l(r4, "metaData");
            super(null);
            this.f128452a = r2;
            this.f128453b = r3;
            this.f128454c = r4;
        }

        public final String a() {
            return this.f128452a;
        }

        public final com.stockbit.profiletrading.ui.account.webview.model.a b() {
            return this.f128454c;
        }

        public final String c() {
            return this.f128453b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f128452a, r52.f128452a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f128453b, r52.f128453b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f128454c, r52.f128454c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f128452a.hashCode() * 31) + this.f128453b.hashCode()) * 31) + this.f128454c.hashCode();
        }

        public String toString() {
            return "Uploaded(fileUrl=" + this.f128452a + ", viewUrl=" + this.f128453b + ", metaData=" + this.f128454c + ')';
        }
    }

    static {
    }

    public /* synthetic */ w(kotlin.jvm.internal.i r1) {
        this();
    }

    public w() {
    }
}
