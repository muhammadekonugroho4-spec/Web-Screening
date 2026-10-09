package com.stockbit.feature.cryptohistory.ui.detail.state;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface e {

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.feature.cryptohistory.ui.detail.state.b f93790a;

        static {
        }

        public a(com.stockbit.feature.cryptohistory.ui.detail.state.b r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.f93790a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f93790a, ((a) r4).f93790a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f93790a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f93790a + ')';
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f93791a = null;

        static {
            f93791a = new b();
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
            return -707402940;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final d f93792a;

        static {
        }

        public c(d r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f93792a = r2;
        }

        public final d a() {
            return this.f93792a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f93792a, ((c) r4).f93792a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f93792a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f93792a + ')';
        }
    }
}
