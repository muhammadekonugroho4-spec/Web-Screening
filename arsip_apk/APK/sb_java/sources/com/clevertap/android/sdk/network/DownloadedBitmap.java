package com.clevertap.android.sdk.network;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class DownloadedBitmap {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f34634a;

    /* renamed from: b, reason: collision with root package name */
    public final Status f34635b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34636c;
    public final byte[] d;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/clevertap/android/sdk/network/DownloadedBitmap$Status;", "", "statusValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatusValue", "()Ljava/lang/String;", "NO_IMAGE", "SUCCESS", "DOWNLOAD_FAILED", "NO_NETWORK", "INIT_ERROR", "SIZE_LIMIT_EXCEEDED", "GIF_SUCCESS", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Status extends Enum<Status> {
        public static final Status DOWNLOAD_FAILED = null;
        public static final Status GIF_SUCCESS = null;
        public static final Status INIT_ERROR = null;
        public static final Status NO_IMAGE = null;
        public static final Status NO_NETWORK = null;
        public static final Status SIZE_LIMIT_EXCEEDED = null;
        public static final Status SUCCESS = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Status[] f34637a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f34638b = null;
        private final String statusValue;

        static {
            NO_IMAGE = new Status("NO_IMAGE", 0, "NO_IMAGE");
            SUCCESS = new Status("SUCCESS", 1, "SUCCESS");
            DOWNLOAD_FAILED = new Status("DOWNLOAD_FAILED", 2, "DOWNLOAD_FAILED");
            NO_NETWORK = new Status("NO_NETWORK", 3, "NO_NETWORK");
            INIT_ERROR = new Status("INIT_ERROR", 4, "INIT_ERROR");
            SIZE_LIMIT_EXCEEDED = new Status("SIZE_LIMIT_EXCEEDED", 5, "SIZE_LIMIT_EXCEEDED");
            GIF_SUCCESS = new Status("GIF_SUCCESS", 6, "GIF_SUCCESS");
            Status[] r02 = a();
            f34637a = r02;
            f34638b = kotlin.enums.b.a(r02);
        }

        Status(String r1, int r2, String r3) {
            this.statusValue = r3;
        }

        public static final /* synthetic */ Status[] a() {
            return new Status[]{NO_IMAGE, SUCCESS, DOWNLOAD_FAILED, NO_NETWORK, INIT_ERROR, SIZE_LIMIT_EXCEEDED, GIF_SUCCESS};
        }

        public static kotlin.enums.a getEntries() {
            return f34638b;
        }

        public static Status valueOf(String r1) {
            return (Status) Enum.valueOf(Status.class, r1);
        }

        public static Status[] values() {
            return (Status[]) f34637a.clone();
        }

        public final String getStatusValue() {
            return this.statusValue;
        }
    }

    public DownloadedBitmap(Bitmap r2, Status r3, long r4, byte[] r6) {
        p.l(r3, NotificationCompat.CATEGORY_STATUS);
        this.f34634a = r2;
        this.f34635b = r3;
        this.f34636c = r4;
        this.d = r6;
    }

    public final Bitmap a() {
        return this.f34634a;
    }

    public final byte[] b() {
        return this.d;
    }

    public final long c() {
        return this.f34636c;
    }

    public final Status d() {
        return this.f34635b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L5;
        return true;
    L5:
        if (r8 == null) goto L7;
        Class<?> r1 = r8.getClass();
    L9:
        if (p.g(DownloadedBitmap.class, r1) == true) goto L11;
        return false;
    L11:
        p.j(r8, "null cannot be cast to non-null type com.clevertap.android.sdk.network.DownloadedBitmap");
        DownloadedBitmap r82 = (DownloadedBitmap) r8;
        if (p.g(this.f34634a, r82.f34634a) == true) goto L15;
        return false;
    L15:
        if (this.f34635b == r82.f34635b) goto L18;
        return false;
    L18:
        if (this.f34636c == r82.f34636c) goto L21;
        return false;
    L21:
        if (Arrays.equals(this.d, r82.d) == true) goto L23;
        return false;
    L23:
        return true;
    L7:
        r1 = null;
        goto L9
    }

    public int hashCode() {
        Bitmap r02 = this.f34634a;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L7:
        return (((((r03 * 31) + this.f34635b.hashCode()) * 31) + Long.hashCode(this.f34636c)) * 31) + Arrays.hashCode(this.d);
    L5:
        r03 = 0;
        goto L7
    }

    public String toString() {
        return "DownloadedBitmap(bitmap=" + this.f34634a + ", status=" + this.f34635b + ", downloadTime=" + this.f34636c + ", bytes=" + Arrays.toString(this.d) + ')';
    }

    public /* synthetic */ DownloadedBitmap(Bitmap r7, Status r8, long r9, byte[] r11, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 8) == 0) goto L5;
        r11 = null;
    L5:
        this(r7, r8, r9, r11);
    }
}
