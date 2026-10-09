package com.stockbit.domain.model.type.livestream;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/model/type/livestream/LiveStreamType;", "", "<init>", "(Ljava/lang/String;I)V", "GENERAL", "SHARE", "BANNER_VIDEO", "DETAIL", "REMINDER", "QUESTION_OVER_LIMIT", "QUESTION_SUCCESS", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum LiveStreamType extends Enum<LiveStreamType> {
    public static final LiveStreamType BANNER_VIDEO = null;
    public static final LiveStreamType DETAIL = null;
    public static final LiveStreamType GENERAL = null;
    public static final LiveStreamType QUESTION_OVER_LIMIT = null;
    public static final LiveStreamType QUESTION_SUCCESS = null;
    public static final LiveStreamType REMINDER = null;
    public static final LiveStreamType SHARE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LiveStreamType[] f86325a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86326b = null;

    static {
        GENERAL = new LiveStreamType("GENERAL", 0);
        SHARE = new LiveStreamType("SHARE", 1);
        BANNER_VIDEO = new LiveStreamType("BANNER_VIDEO", 2);
        DETAIL = new LiveStreamType("DETAIL", 3);
        REMINDER = new LiveStreamType("REMINDER", 4);
        QUESTION_OVER_LIMIT = new LiveStreamType("QUESTION_OVER_LIMIT", 5);
        QUESTION_SUCCESS = new LiveStreamType("QUESTION_SUCCESS", 6);
        LiveStreamType[] r02 = a();
        f86325a = r02;
        f86326b = b.a(r02);
    }

    LiveStreamType(String r1, int r2) {
    }

    public static final /* synthetic */ LiveStreamType[] a() {
        return new LiveStreamType[]{GENERAL, SHARE, BANNER_VIDEO, DETAIL, REMINDER, QUESTION_OVER_LIMIT, QUESTION_SUCCESS};
    }

    public static a getEntries() {
        return f86326b;
    }

    public static LiveStreamType valueOf(String r1) {
        return (LiveStreamType) Enum.valueOf(LiveStreamType.class, r1);
    }

    public static LiveStreamType[] values() {
        return (LiveStreamType[]) f86325a.clone();
    }
}
