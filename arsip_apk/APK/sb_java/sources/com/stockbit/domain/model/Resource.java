package com.stockbit.domain.model;

import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class Resource {

    /* renamed from: e, reason: collision with root package name */
    public static final a f80498e = null;

    /* renamed from: a, reason: collision with root package name */
    public final Status f80499a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f80500b;

    /* renamed from: c, reason: collision with root package name */
    public final ErrorResponse f80501c;
    public final String d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/domain/model/Resource$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "LOADING", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum Status extends Enum<Status> {
        public static final Status ERROR = null;
        public static final Status LOADING = null;
        public static final Status SUCCESS = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Status[] f80502a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f80503b = null;

        static {
            SUCCESS = new Status("SUCCESS", 0);
            ERROR = new Status("ERROR", 1);
            LOADING = new Status("LOADING", 2);
            Status[] r02 = a();
            f80502a = r02;
            f80503b = kotlin.enums.b.a(r02);
        }

        Status(String r1, int r2) {
        }

        public static final /* synthetic */ Status[] a() {
            return new Status[]{SUCCESS, ERROR, LOADING};
        }

        public static kotlin.enums.a getEntries() {
            return f80503b;
        }

        public static Status valueOf(String r1) {
            return (Status) Enum.valueOf(Status.class, r1);
        }

        public static Status[] values() {
            return (Status[]) f80502a.clone();
        }
    }

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ Resource d(a r02, Object r1, String r2, int r3, Object r4) {
            if ((r3 & 2) == 0) goto L6;
            r2 = "";
        L6:
            return r02.c(r1, r2);
        }

        public final Resource a(ErrorResponse r9, Object r10) {
            p.l(r9, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            String r5 = null;
            return new Resource(Status.ERROR, r10, r9, r5, 8, null);
        }

        public final Resource b(Object r8) {
            ErrorResponse r3 = null;
            String r4 = null;
            return new Resource(Status.LOADING, r8, r3, r4, 8, null);
        }

        public final Resource c(Object r4, String r5) {
            return new Resource(Status.SUCCESS, r4, null, r5);
        }

        public a() {
        }
    }

    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80504a = null;

        static {
            int[] r02 = new int[Status.values().length];
            r02[Status.SUCCESS.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
        L11:
            r02[Status.ERROR.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L15:
            r02[Status.LOADING.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
        L6:
            f80504a = r02;
        }
    }

    static {
        f80498e = new a(null);
    }

    public Resource(Status r2, Object r3, ErrorResponse r4, String r5) {
        p.l(r2, NotificationCompat.CATEGORY_STATUS);
        this.f80499a = r2;
        this.f80500b = r3;
        this.f80501c = r4;
        this.d = r5;
    }

    public static /* synthetic */ Resource b(Resource r02, Status r1, Object r2, ErrorResponse r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f80499a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f80500b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f80501c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final Resource a(Status r2, Object r3, ErrorResponse r4, String r5) {
        p.l(r2, NotificationCompat.CATEGORY_STATUS);
        return new Resource(r2, r3, r4, r5);
    }

    public final Object c() {
        return this.f80500b;
    }

    public final ErrorResponse d() {
        return this.f80501c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Resource) == true) goto L8;
        return false;
    L8:
        Resource r52 = (Resource) r5;
        if (this.f80499a == r52.f80499a) goto L12;
        return false;
    L12:
        if (p.g(this.f80500b, r52.f80500b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80501c, r52.f80501c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final Status f() {
        return this.f80499a;
    }

    public final Object g() {
        if (this.f80499a == Status.SUCCESS) goto L5;
        return null;
    L5:
        return this.f80500b;
    }

    public int hashCode() {
        int r02 = this.f80499a.hashCode() * 31;
        Object r1 = this.f80500b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        ErrorResponse r13 = this.f80501c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "Resource(status=" + this.f80499a + ", data=" + this.f80500b + ", error=" + this.f80501c + ", message=" + this.d + ')';
    }

    public /* synthetic */ Resource(Status r1, Object r2, ErrorResponse r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = "";
    L5:
        this(r1, r2, r3, r4);
    }
}
