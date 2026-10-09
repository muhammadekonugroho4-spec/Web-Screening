package com.stockbit.component.facerecognition.ui.base;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public interface a {

    /* renamed from: com.stockbit.component.facerecognition.ui.base.a$a, reason: collision with other inner class name */
    public static final class C0707a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f71094a;

        /* renamed from: b, reason: collision with root package name */
        public final String f71095b;

        /* renamed from: c, reason: collision with root package name */
        public final String f71096c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f71097e;

        static {
        }

        public C0707a(String r2, String r3, String r4, String r5, String r6) {
            p.l(r2, "userId");
            p.l(r3, "username");
            p.l(r4, "userToken");
            p.l(r5, "correlationId");
            p.l(r6, "baseUrl");
            this.f71094a = r2;
            this.f71095b = r3;
            this.f71096c = r4;
            this.d = r5;
            this.f71097e = r6;
        }

        public final String a() {
            return this.f71097e;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.f71094a;
        }

        public final String d() {
            return this.f71096c;
        }

        public final String e() {
            return this.f71095b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0707a) == true) goto L8;
            return false;
        L8:
            C0707a r52 = (C0707a) r5;
            if (p.g(this.f71094a, r52.f71094a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f71095b, r52.f71095b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f71096c, r52.f71096c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f71097e, r52.f71097e) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.f71094a.hashCode() * 31) + this.f71095b.hashCode()) * 31) + this.f71096c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f71097e.hashCode();
        }

        public String toString() {
            return "LaunchFaceRecognitionSDK(userId=" + this.f71094a + ", username=" + this.f71095b + ", userToken=" + this.f71096c + ", correlationId=" + this.d + ", baseUrl=" + this.f71097e + ')';
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f71098a = null;

        static {
            f71098a = new b();
        }

        public b() {
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
            return 1014673830;
        }

        public String toString() {
            return "ShowExceedLimitErrorDialog";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f71099a = null;

        static {
            f71099a = new c();
        }

        public c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1649484068;
        }

        public String toString() {
            return "ShowInvalidSessionDialog";
        }
    }
}
