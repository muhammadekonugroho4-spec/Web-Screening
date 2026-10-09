package g;

import a.AbstractC2049c;
import b.AbstractC4230a;
import b.AbstractC4231b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11426e {

    /* renamed from: a, reason: collision with root package name */
    public final int f174276a;

    /* renamed from: b, reason: collision with root package name */
    public final String f174277b;

    /* renamed from: c, reason: collision with root package name */
    public final String f174278c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f174279e;

    /* renamed from: f, reason: collision with root package name */
    public final String f174280f;

    /* renamed from: g, reason: collision with root package name */
    public final String f174281g;

    /* renamed from: h, reason: collision with root package name */
    public final String f174282h;

    /* renamed from: i, reason: collision with root package name */
    public final int f174283i;

    /* renamed from: j, reason: collision with root package name */
    public final String f174284j;

    /* renamed from: k, reason: collision with root package name */
    public final long f174285k;

    /* renamed from: l, reason: collision with root package name */
    public final long f174286l;

    /* renamed from: m, reason: collision with root package name */
    public final String f174287m;

    /* renamed from: n, reason: collision with root package name */
    public final long f174288n;

    /* renamed from: o, reason: collision with root package name */
    public final String f174289o;

    public C11426e(int r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, int r14, String r15, long r16, long r18, String r20, long r21, String r23) {
        kotlin.jvm.internal.p.l(r7, "eventName");
        kotlin.jvm.internal.p.l(r8, "eventType");
        kotlin.jvm.internal.p.l(r9, "timestamp");
        kotlin.jvm.internal.p.l(r10, "eventId");
        kotlin.jvm.internal.p.l(r11, "eventBatchId");
        kotlin.jvm.internal.p.l(r12, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        kotlin.jvm.internal.p.l(r13, "sessionId");
        kotlin.jvm.internal.p.l(r15, "networkType");
        kotlin.jvm.internal.p.l(r20, "bucketType");
        kotlin.jvm.internal.p.l(r23, RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        this.f174276a = r6;
        this.f174277b = r7;
        this.f174278c = r8;
        this.d = r9;
        this.f174279e = r10;
        this.f174280f = r11;
        this.f174281g = r12;
        this.f174282h = r13;
        this.f174283i = r14;
        this.f174284j = r15;
        this.f174285k = r16;
        this.f174286l = r18;
        this.f174287m = r20;
        this.f174288n = r21;
        this.f174289o = r23;
    }

    public static C11426e a(C11426e r21, String r22, String r23, String r24, String r25, int r26, long r27, String r29, int r30) {
        int r2 = r21.f174276a;
        String r28 = r21.f174277b;
        String r3 = r21.f174278c;
        if ((r30 & 8) == 0) goto L5;
        String r5 = r21.d;
    L7:
        if ((r30 & 16) == 0) goto L9;
        String r6 = r21.f174279e;
    L11:
        if ((r30 & 32) == 0) goto L13;
        String r7 = r21.f174280f;
    L14:
        String r8 = r21.f174281g;
        if ((r30 & 128) == 0) goto L17;
        String r9 = r21.f174282h;
    L19:
        if ((r30 & 256) == 0) goto L21;
        int r10 = r21.f174283i;
    L22:
        String r11 = r21.f174284j;
        long r12 = r21.f174285k;
        long r13 = r21.f174286l;
        String r15 = r21.f174287m;
        if ((r30 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L25;
        long r122 = r21.f174288n;
    L27:
        if ((r30 & 16384) == 0) goto L29;
        String r02 = r21.f174289o;
    L30:
        kotlin.jvm.internal.p.l(r28, "eventName");
        kotlin.jvm.internal.p.l(r3, "eventType");
        kotlin.jvm.internal.p.l(r5, "timestamp");
        kotlin.jvm.internal.p.l(r6, "eventId");
        kotlin.jvm.internal.p.l(r7, "eventBatchId");
        kotlin.jvm.internal.p.l(r8, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        kotlin.jvm.internal.p.l(r9, "sessionId");
        kotlin.jvm.internal.p.l(r11, "networkType");
        kotlin.jvm.internal.p.l(r15, "bucketType");
        kotlin.jvm.internal.p.l(r02, RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        String r4 = r5;
        String r52 = r6;
        String r62 = r7;
        String r82 = r9;
        int r92 = r10;
        long r19 = r122;
        return new C11426e(r2, r28, r3, r4, r52, r62, r8, r82, r92, r11, r12, r13, r15, r19, r02);
    L29:
        r02 = r29;
        goto L30
    L25:
        r122 = r27;
        goto L27
    L21:
        r10 = r26;
        goto L22
    L17:
        r9 = r25;
        goto L19
    L13:
        r7 = r24;
        goto L14
    L9:
        r6 = r23;
        goto L11
    L5:
        r5 = r22;
        goto L7
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C11426e) == true) goto L8;
        return false;
    L8:
        C11426e r82 = (C11426e) r8;
        if (this.f174276a == r82.f174276a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f174277b, r82.f174277b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f174278c, r82.f174278c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f174279e, r82.f174279e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f174280f, r82.f174280f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f174281g, r82.f174281g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f174282h, r82.f174282h) == true) goto L33;
        return false;
    L33:
        if (this.f174283i == r82.f174283i) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f174284j, r82.f174284j) == true) goto L39;
        return false;
    L39:
        if (this.f174285k == r82.f174285k) goto L42;
        return false;
    L42:
        if (this.f174286l == r82.f174286l) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.f174287m, r82.f174287m) == true) goto L48;
        return false;
    L48:
        if (this.f174288n == r82.f174288n) goto L51;
        return false;
    L51:
        if (kotlin.jvm.internal.p.g(this.f174289o, r82.f174289o) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final int hashCode() {
        int r02 = Integer.hashCode(this.f174276a) * 31;
        int r03 = AbstractC2049c.a(this.f174277b, r02, 31);
        int r04 = AbstractC2049c.a(this.f174278c, r03, 31);
        int r05 = AbstractC2049c.a(this.d, r04, 31);
        int r06 = AbstractC2049c.a(this.f174279e, r05, 31);
        int r07 = AbstractC2049c.a(this.f174280f, r06, 31);
        int r08 = AbstractC2049c.a(this.f174281g, r07, 31);
        int r09 = AbstractC2049c.a(this.f174282h, r08, 31);
        int r010 = AbstractC4230a.a(this.f174283i, r09, 31);
        int r011 = AbstractC2049c.a(this.f174284j, r010, 31);
        int r012 = AbstractC4231b.a(this.f174285k, r011, 31);
        int r013 = AbstractC4231b.a(this.f174286l, r012, 31);
        int r014 = AbstractC2049c.a(this.f174287m, r013, 31);
        int r015 = AbstractC4231b.a(this.f174288n, r014, 31);
        return this.f174289o.hashCode() + r015;
    }

    public final String toString() {
        return "CSHealthEvent(healthEventID=" + this.f174276a + ", eventName=" + this.f174277b + ", eventType=" + this.f174278c + ", timestamp=" + this.d + ", eventId=" + this.f174279e + ", eventBatchId=" + this.f174280f + ", error=" + this.f174281g + ", sessionId=" + this.f174282h + ", count=" + this.f174283i + ", networkType=" + this.f174284j + ", startTime=" + this.f174285k + ", stopTime=" + this.f174286l + ", bucketType=" + this.f174287m + ", batchSize=" + this.f174288n + ", appVersion=" + this.f174289o + ')';
    }

    public /* synthetic */ C11426e(String r23, String r24, String r25, String r26, String r27, int r28, String r29, int r30) {
        if ((r30 & 16) == 0) goto L5;
        String r8 = "";
    L7:
        if ((r30 & 32) == 0) goto L9;
        String r9 = "";
    L11:
        if ((r30 & 64) == 0) goto L13;
        String r10 = "";
    L15:
        if ((r30 & 256) == 0) goto L17;
        int r12 = 0;
    L18:
        this(0, r23, r24, "", r8, r9, r10, "", r12, "", 0, 0, "", 0, r29);
        return;
    L17:
        r12 = r28;
        goto L18
    L13:
        r10 = r27;
        goto L15
    L9:
        r9 = r26;
        goto L11
    L5:
        r8 = r25;
        goto L7
    }
}
