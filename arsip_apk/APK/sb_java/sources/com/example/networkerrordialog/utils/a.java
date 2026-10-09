package com.example.networkerrordialog.utils;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.example.networkerrordialog.utils.a$a, reason: collision with other inner class name */
    public static final class C0364a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0364a f35513a = null;

        static {
            f35513a = new C0364a();
        }

        public C0364a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0364a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -125414580;
        }

        public String toString() {
            return "ShowGeneralErrorBottomSheet";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final kotlin.jvm.functions.a f35514a;

        static {
        }

        public b(kotlin.jvm.functions.a r1) {
            this.f35514a = r1;
        }

        public final kotlin.jvm.functions.a a() {
            return this.f35514a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f35514a, ((b) r4).f35514a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            kotlin.jvm.functions.a r02 = this.f35514a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "ShowNetworkErrorBottomSheet(onRetry=" + this.f35514a + ')';
        }
    }
}
