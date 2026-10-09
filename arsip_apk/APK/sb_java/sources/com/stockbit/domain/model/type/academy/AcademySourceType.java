package com.stockbit.domain.model.type.academy;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/academy/AcademySourceType;", "", "source", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSource", "()Ljava/lang/String;", "SEARCH", "SIDE_MENU", "BANNER", "RESEARCH_TAB", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum AcademySourceType extends Enum<AcademySourceType> {
    public static final AcademySourceType BANNER = null;
    public static final AcademySourceType RESEARCH_TAB = null;
    public static final AcademySourceType SEARCH = null;
    public static final AcademySourceType SIDE_MENU = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AcademySourceType[] f86280a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86281b = null;
    private final String source;

    static {
        SEARCH = new AcademySourceType("SEARCH", 0, FirebaseAnalytics.Event.SEARCH);
        SIDE_MENU = new AcademySourceType("SIDE_MENU", 1, "sidemenu");
        BANNER = new AcademySourceType("BANNER", 2, "banner");
        RESEARCH_TAB = new AcademySourceType("RESEARCH_TAB", 3, "research");
        AcademySourceType[] r02 = a();
        f86280a = r02;
        f86281b = b.a(r02);
    }

    AcademySourceType(String r1, int r2, String r3) {
        this.source = r3;
    }

    public static final /* synthetic */ AcademySourceType[] a() {
        return new AcademySourceType[]{SEARCH, SIDE_MENU, BANNER, RESEARCH_TAB};
    }

    public static a getEntries() {
        return f86281b;
    }

    public static AcademySourceType valueOf(String r1) {
        return (AcademySourceType) Enum.valueOf(AcademySourceType.class, r1);
    }

    public static AcademySourceType[] values() {
        return (AcademySourceType[]) f86280a.clone();
    }

    public final String getSource() {
        return this.source;
    }
}
