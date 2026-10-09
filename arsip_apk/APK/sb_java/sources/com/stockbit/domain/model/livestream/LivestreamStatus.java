package com.stockbit.domain.model.livestream;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lcom/stockbit/domain/model/livestream/LivestreamStatus;", "", NotificationCompat.CATEGORY_STATUS, "", "value", "titleFilter", "isActive", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getStatus", "()Ljava/lang/String;", "getValue", "getTitleFilter", "()Z", "setActive", "(Z)V", "UNSPECIFIED", "UPCOMING", "LIVE", "ENDED", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum LivestreamStatus extends Enum<LivestreamStatus> {
    public static final a Companion = null;
    public static final LivestreamStatus ENDED = null;
    public static final LivestreamStatus LIVE = null;
    public static final LivestreamStatus UNSPECIFIED = null;
    public static final LivestreamStatus UPCOMING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LivestreamStatus[] f84240a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f84241b = null;
    private boolean isActive;
    private final String status;
    private final String titleFilter;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final LivestreamStatus a(String r6) {
            LivestreamStatus[] r02 = LivestreamStatus.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            LivestreamStatus r3 = r02[r2];
            if (p.g(r3.getStatus(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return LivestreamStatus.UNSPECIFIED;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        String r1 = "UNSPECIFIED";
        int r2 = 0;
        String r3 = "EVENT_STATUS_UNSPECIFIED";
        String r4 = "Unspecified";
        String r5 = null;
        boolean r6 = false;
        UNSPECIFIED = new LivestreamStatus(r1, r2, r3, r4, r5, r6, 12, null);
        UPCOMING = new LivestreamStatus("UPCOMING", 1, "EVENT_STATUS_UPCOMING", "Upcoming", "Upcoming", true);
        String r32 = "LIVE";
        int r42 = 2;
        String r52 = "EVENT_STATUS_LIVE";
        String r62 = "Live";
        String r7 = null;
        boolean r8 = false;
        LIVE = new LivestreamStatus(r32, r42, r52, r62, r7, r8, 12, null);
        String r43 = "ENDED";
        int r53 = 3;
        String r63 = "EVENT_STATUS_ENDED";
        String r72 = "Ended";
        String r82 = "Recording";
        boolean r9 = false;
        ENDED = new LivestreamStatus(r43, r53, r63, r72, r82, r9, 8, null);
        LivestreamStatus[] r02 = a();
        f84240a = r02;
        f84241b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    LivestreamStatus(String r1, int r2, String r3, String r4, String r5, boolean r6) {
        this.status = r3;
        this.value = r4;
        this.titleFilter = r5;
        this.isActive = r6;
    }

    public static final /* synthetic */ LivestreamStatus[] a() {
        return new LivestreamStatus[]{UNSPECIFIED, UPCOMING, LIVE, ENDED};
    }

    public static kotlin.enums.a getEntries() {
        return f84241b;
    }

    public static LivestreamStatus valueOf(String r1) {
        return (LivestreamStatus) Enum.valueOf(LivestreamStatus.class, r1);
    }

    public static LivestreamStatus[] values() {
        return (LivestreamStatus[]) f84240a.clone();
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTitleFilter() {
        return this.titleFilter;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean r1) {
        this.isActive = r1;
    }

    /* synthetic */ LivestreamStatus(String r8, int r9, String r10, String r11, String r12, boolean r13, int r14, i r15) {
        if ((r14 & 4) == 0) goto L5;
        r12 = null;
    L5:
        String r5 = r12;
        if ((r14 & 8) == 0) goto L8;
        r13 = false;
    L8:
        this(r8, r9, r10, r11, r5, r13);
    }
}
