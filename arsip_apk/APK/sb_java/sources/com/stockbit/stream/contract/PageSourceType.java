package com.stockbit.stream.contract;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/stockbit/stream/contract/PageSourceType;", "", "pageContext", "", "pageSource", "entryType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPageContext", "()Ljava/lang/String;", "getPageSource", "getEntryType", "STREAM_HOME", "PROFILE", "COMPANY_VIEW", "LIKES_VIEW", "STREAM_DETAIL", "Companion", "stream-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum PageSourceType extends Enum<PageSourceType> {
    public static final PageSourceType COMPANY_VIEW = null;
    public static final a Companion = null;
    public static final PageSourceType LIKES_VIEW = null;
    public static final PageSourceType PROFILE = null;
    public static final PageSourceType STREAM_DETAIL = null;
    public static final PageSourceType STREAM_HOME = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PageSourceType[] f139563a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f139564b = null;
    private final String entryType;
    private final String pageContext;
    private final String pageSource;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        STREAM_HOME = new PageSourceType("STREAM_HOME", 0, "Stream", "Stream Home", "Stream Page");
        PROFILE = new PageSourceType("PROFILE", 1, "profile.Stream", "Profile", "User Profile");
        COMPANY_VIEW = new PageSourceType("COMPANY_VIEW", 2, "company.Stream", "Company View", "Company Stream");
        LIKES_VIEW = new PageSourceType("LIKES_VIEW", 3, "Likes", "Likes", "Likes Page");
        STREAM_DETAIL = new PageSourceType("STREAM_DETAIL", 4, "Stream", "Stream Post Detail", "Stream Post Detail");
        PageSourceType[] r02 = a();
        f139563a = r02;
        f139564b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    PageSourceType(String r1, int r2, String r3, String r4, String r5) {
        this.pageContext = r3;
        this.pageSource = r4;
        this.entryType = r5;
    }

    public static final /* synthetic */ PageSourceType[] a() {
        return new PageSourceType[]{STREAM_HOME, PROFILE, COMPANY_VIEW, LIKES_VIEW, STREAM_DETAIL};
    }

    public static kotlin.enums.a getEntries() {
        return f139564b;
    }

    public static PageSourceType valueOf(String r1) {
        return (PageSourceType) Enum.valueOf(PageSourceType.class, r1);
    }

    public static PageSourceType[] values() {
        return (PageSourceType[]) f139563a.clone();
    }

    public final String getEntryType() {
        return this.entryType;
    }

    public final String getPageContext() {
        return this.pageContext;
    }

    public final String getPageSource() {
        return this.pageSource;
    }
}
