package com.stockbit.domain.model.type.unboxing;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/stockbit/domain/model/type/unboxing/UnboxingSourceType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GENERAL", "SEARCH", "STREAM", "UNBOXING_LIST", "DETAIL_ARTICLE", "ARTICLE_PAGE", "DEEPLINK", "RESEARCH_TAB", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum UnboxingSourceType extends Enum<UnboxingSourceType> {
    public static final UnboxingSourceType ARTICLE_PAGE = null;
    public static final a Companion = null;
    public static final UnboxingSourceType DEEPLINK = null;
    public static final UnboxingSourceType DETAIL_ARTICLE = null;
    public static final UnboxingSourceType GENERAL = null;
    public static final UnboxingSourceType RESEARCH_TAB = null;
    public static final UnboxingSourceType SEARCH = null;
    public static final UnboxingSourceType STREAM = null;
    public static final UnboxingSourceType UNBOXING_LIST = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UnboxingSourceType[] f86530a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86531b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        GENERAL = new UnboxingSourceType("GENERAL", 0, "");
        SEARCH = new UnboxingSourceType("SEARCH", 1, "Search");
        STREAM = new UnboxingSourceType("STREAM", 2, "Stream");
        UNBOXING_LIST = new UnboxingSourceType("UNBOXING_LIST", 3, "Unboxing List");
        DETAIL_ARTICLE = new UnboxingSourceType("DETAIL_ARTICLE", 4, "Detail Article");
        ARTICLE_PAGE = new UnboxingSourceType("ARTICLE_PAGE", 5, "Article Page");
        DEEPLINK = new UnboxingSourceType("DEEPLINK", 6, "Deeplink");
        RESEARCH_TAB = new UnboxingSourceType("RESEARCH_TAB", 7, "Research Tab");
        UnboxingSourceType[] r02 = a();
        f86530a = r02;
        f86531b = b.a(r02);
        Companion = new a(null);
    }

    UnboxingSourceType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ UnboxingSourceType[] a() {
        return new UnboxingSourceType[]{GENERAL, SEARCH, STREAM, UNBOXING_LIST, DETAIL_ARTICLE, ARTICLE_PAGE, DEEPLINK, RESEARCH_TAB};
    }

    public static kotlin.enums.a getEntries() {
        return f86531b;
    }

    public static UnboxingSourceType valueOf(String r1) {
        return (UnboxingSourceType) Enum.valueOf(UnboxingSourceType.class, r1);
    }

    public static UnboxingSourceType[] values() {
        return (UnboxingSourceType[]) f86530a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
