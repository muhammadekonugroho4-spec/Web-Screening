package com.stockbit.usecase.trading.community.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/stockbit/usecase/trading/community/model/CommunityLeaderDashboardMemberStatus;", "", FirebaseAnalytics.Param.INDEX, "", "value", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getIndex", "()I", "getValue", "()Ljava/lang/String;", "MEMBER_STATUS_UNSPECIFIED", "MEMBER_STATUS_ACTIVE", "MEMBER_STATUS_INACTIVE", "Companion", "usecase-trading-community"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CommunityLeaderDashboardMemberStatus extends Enum<CommunityLeaderDashboardMemberStatus> {
    public static final a Companion = null;
    public static final CommunityLeaderDashboardMemberStatus MEMBER_STATUS_ACTIVE = null;
    public static final CommunityLeaderDashboardMemberStatus MEMBER_STATUS_INACTIVE = null;
    public static final CommunityLeaderDashboardMemberStatus MEMBER_STATUS_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CommunityLeaderDashboardMemberStatus[] f163239a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163240b = null;
    private final int index;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CommunityLeaderDashboardMemberStatus a(Integer r7) {
            CommunityLeaderDashboardMemberStatus[] r02 = CommunityLeaderDashboardMemberStatus.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            CommunityLeaderDashboardMemberStatus r3 = r02[r2];
            int r4 = r3.getIndex();
            if (r7 == null) goto L10;
            if (r4 != r7.intValue()) goto L10;
        L12:
            if (r3 == null) goto L14;
            return r3;
        L14:
            return CommunityLeaderDashboardMemberStatus.MEMBER_STATUS_UNSPECIFIED;
        L10:
            r2 = r2 + 1;
            goto L3
        L11:
            r3 = null;
            goto L12
        }

        public final CommunityLeaderDashboardMemberStatus b(String r6) {
            CommunityLeaderDashboardMemberStatus[] r02 = CommunityLeaderDashboardMemberStatus.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            CommunityLeaderDashboardMemberStatus r3 = r02[r2];
            if (p.g(r3.name(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return CommunityLeaderDashboardMemberStatus.MEMBER_STATUS_UNSPECIFIED;
        L8:
            r3 = null;
            goto L9
        }

        public final CommunityLeaderDashboardMemberStatus c(String r6) {
            CommunityLeaderDashboardMemberStatus[] r02 = CommunityLeaderDashboardMemberStatus.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            CommunityLeaderDashboardMemberStatus r3 = r02[r2];
            if (p.g(r3.getValue(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return CommunityLeaderDashboardMemberStatus.MEMBER_STATUS_UNSPECIFIED;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        MEMBER_STATUS_UNSPECIFIED = new CommunityLeaderDashboardMemberStatus("MEMBER_STATUS_UNSPECIFIED", 0, 0, "ALL");
        MEMBER_STATUS_ACTIVE = new CommunityLeaderDashboardMemberStatus("MEMBER_STATUS_ACTIVE", 1, 1, "ACTIVE");
        MEMBER_STATUS_INACTIVE = new CommunityLeaderDashboardMemberStatus("MEMBER_STATUS_INACTIVE", 2, 2, "INACTIVE");
        CommunityLeaderDashboardMemberStatus[] r02 = a();
        f163239a = r02;
        f163240b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    CommunityLeaderDashboardMemberStatus(String r1, int r2, int r3, String r4) {
        this.index = r3;
        this.value = r4;
    }

    public static final /* synthetic */ CommunityLeaderDashboardMemberStatus[] a() {
        return new CommunityLeaderDashboardMemberStatus[]{MEMBER_STATUS_UNSPECIFIED, MEMBER_STATUS_ACTIVE, MEMBER_STATUS_INACTIVE};
    }

    public static kotlin.enums.a getEntries() {
        return f163240b;
    }

    public static CommunityLeaderDashboardMemberStatus valueOf(String r1) {
        return (CommunityLeaderDashboardMemberStatus) Enum.valueOf(CommunityLeaderDashboardMemberStatus.class, r1);
    }

    public static CommunityLeaderDashboardMemberStatus[] values() {
        return (CommunityLeaderDashboardMemberStatus[]) f163239a.clone();
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getValue() {
        return this.value;
    }
}
