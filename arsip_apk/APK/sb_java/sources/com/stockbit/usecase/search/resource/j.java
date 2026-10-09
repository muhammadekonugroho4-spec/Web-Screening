package com.stockbit.usecase.search.resource;

import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class j {

    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final a f160142a = null;

        static {
            f160142a = new a();
        }

        public a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1608981017;
        }

        public String toString() {
            return "Error";
        }
    }

    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public final List f160143a;

        public b(List r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f160143a = r2;
        }

        public final List a() {
            return this.f160143a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f160143a, ((b) r4).f160143a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f160143a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f160143a + ")";
        }
    }

    public /* synthetic */ j(kotlin.jvm.internal.i r1) {
        this();
    }

    public j() {
    }
}
