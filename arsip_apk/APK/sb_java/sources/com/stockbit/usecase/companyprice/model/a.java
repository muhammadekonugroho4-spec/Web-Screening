package com.stockbit.usecase.companyprice.model;

import kotlin.jvm.internal.i;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.companyprice.model.a$a, reason: collision with other inner class name */
    public static final class C1443a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1443a f156927a = null;

        static {
            f156927a = new C1443a();
        }

        public C1443a() {
            super("Default", null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1443a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 584802100;
        }

        public String toString() {
            return "Default";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f156928a = null;

        static {
            f156928a = new b();
        }

        public b() {
            super("Green", null);
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
            return 1523316918;
        }

        public String toString() {
            return "Green";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f156929a = null;

        static {
            f156929a = new c();
        }

        public c() {
            super("Red", null);
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
            return -1795050748;
        }

        public String toString() {
            return "Red";
        }
    }

    public /* synthetic */ a(String r1, i r2) {
        this(r1);
    }

    public a(String r1) {
    }
}
