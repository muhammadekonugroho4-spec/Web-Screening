package com.stockbit.stream.ui.attachmentedit;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f141752a;

        static {
        }

        public a(String r2) {
            p.l(r2, "attachment");
            super(null);
            this.f141752a = r2;
        }

        public final String a() {
            return this.f141752a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f141752a, ((a) r4).f141752a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f141752a.hashCode();
        }

        public String toString() {
            return "AttachmentDelete(attachment=" + this.f141752a + ')';
        }
    }

    static {
    }

    public /* synthetic */ d(i r1) {
        this();
    }

    public d() {
    }
}
