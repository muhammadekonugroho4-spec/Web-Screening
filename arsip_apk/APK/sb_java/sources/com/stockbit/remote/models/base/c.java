package com.stockbit.remote.models.base;

import com.gojek.ojosdk.exif.ExifInterface;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stockbit/remote/models/base/NetworkResponse;", ExifInterface.GpsLatitudeRef.SOUTH, ExifInterface.GpsLongitudeRef.EAST, "", "<init>", "()V", "Success", "SuccessNoData", "ErrorApi", "ErrorNetwork", "ErrorUnknown", "Lcom/stockbit/remote/models/base/NetworkResponse$ErrorApi;", "Lcom/stockbit/remote/models/base/NetworkResponse$ErrorNetwork;", "Lcom/stockbit/remote/models/base/NetworkResponse$ErrorUnknown;", "Lcom/stockbit/remote/models/base/NetworkResponse$Success;", "Lcom/stockbit/remote/models/base/NetworkResponse$SuccessNoData;", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class c<S, E> {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public int f129489a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f129490b;

        public a(int r2, Object r3) {
            super(null);
            this.f129489a = r2;
            this.f129490b = r3;
        }

        public final int a() {
            return this.f129489a;
        }

        public final Object b() {
            return this.f129490b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f129489a == r52.f129489a) goto L12;
            return false;
        L12:
            if (p.g(this.f129490b, r52.f129490b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            int r02 = Integer.hashCode(this.f129489a) * 31;
            Object r1 = this.f129490b;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "ErrorApi(code=" + this.f129489a + ", error=" + this.f129490b + ')';
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f129491a;

        public b(Throwable r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f129491a = r2;
        }

        public final Throwable a() {
            return this.f129491a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f129491a, ((b) r4).f129491a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f129491a.hashCode();
        }

        public String toString() {
            return "ErrorNetwork(error=" + this.f129491a + ')';
        }
    }

    /* renamed from: com.stockbit.remote.models.base.c$c, reason: collision with other inner class name */
    public static final class C1169c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f129492a;

        public C1169c(Throwable r2) {
            super(null);
            this.f129492a = r2;
        }

        public final Throwable a() {
            return this.f129492a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1169c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f129492a, ((C1169c) r4).f129492a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Throwable r02 = this.f129492a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "ErrorUnknown(error=" + this.f129492a + ')';
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f129493a;

        public d(Object r2) {
            p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            super(null);
            this.f129493a = r2;
        }

        public final Object a() {
            return this.f129493a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f129493a, ((d) r4).f129493a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f129493a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f129493a + ')';
        }
    }

    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f129494a;

        public e(String r2) {
            p.l(r2, "message");
            super(null);
            this.f129494a = r2;
        }

        public final String a() {
            return this.f129494a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f129494a, ((e) r4).f129494a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f129494a.hashCode();
        }

        public String toString() {
            return "SuccessNoData(message=" + this.f129494a + ')';
        }
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    private c() {
    }
}
