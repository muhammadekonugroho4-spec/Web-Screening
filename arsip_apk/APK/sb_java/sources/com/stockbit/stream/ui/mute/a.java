package com.stockbit.stream.ui.mute;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.stream.ui.mute.a$a, reason: collision with other inner class name */
    public static final class C1304a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1304a f144311a = null;

        static {
            f144311a = new C1304a();
        }

        public C1304a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final StreamMutePickerType f144312a;

        static {
        }

        public b(StreamMutePickerType r2) {
            p.l(r2, "type");
            super(null);
            this.f144312a = r2;
        }

        public final StreamMutePickerType a() {
            return this.f144312a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f144312a == ((b) r4).f144312a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f144312a.hashCode();
        }

        public String toString() {
            return "ShowPicker(type=" + this.f144312a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f144313a;

        static {
        }

        public c(String r2) {
            p.l(r2, "message");
            super(null);
            this.f144313a = r2;
        }

        public final String a() {
            return this.f144313a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f144313a, ((c) r4).f144313a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f144313a.hashCode();
        }

        public String toString() {
            return "SuccessMutePost(message=" + this.f144313a + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
