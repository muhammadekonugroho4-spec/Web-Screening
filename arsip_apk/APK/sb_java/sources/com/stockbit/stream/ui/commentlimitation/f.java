package com.stockbit.stream.ui.commentlimitation;

import com.stockbit.domain.model.type.stream.CommentLimitationType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class f {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final CommentLimitationType f141783a;

        static {
        }

        public a(CommentLimitationType r2) {
            p.l(r2, "type");
            super(null);
            this.f141783a = r2;
        }

        public final CommentLimitationType a() {
            return this.f141783a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f141783a == ((a) r4).f141783a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f141783a.hashCode();
        }

        public String toString() {
            return "ClickSettingLimitation(type=" + this.f141783a + ')';
        }
    }

    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f141784a = null;

        static {
            f141784a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends f {

        /* renamed from: a, reason: collision with root package name */
        public final String f141785a;

        static {
        }

        public c(String r2) {
            p.l(r2, "type");
            super(null);
            this.f141785a = r2;
        }

        public final String a() {
            return this.f141785a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f141785a, ((c) r4).f141785a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f141785a.hashCode();
        }

        public String toString() {
            return "SuccessChangeSettingComment(type=" + this.f141785a + ')';
        }
    }

    static {
    }

    public /* synthetic */ f(i r1) {
        this();
    }

    public f() {
    }
}
