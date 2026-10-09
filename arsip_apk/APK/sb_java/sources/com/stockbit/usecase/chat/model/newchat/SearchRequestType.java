package com.stockbit.usecase.chat.model.newchat;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/usecase/chat/model/newchat/SearchRequestType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ALL", "INSIDER", "COMPANY", "PEOPLE", "EMITEN", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum SearchRequestType extends Enum<SearchRequestType> {
    public static final SearchRequestType ALL = null;
    public static final SearchRequestType COMPANY = null;
    public static final SearchRequestType EMITEN = null;
    public static final SearchRequestType INSIDER = null;
    public static final SearchRequestType PEOPLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SearchRequestType[] f155572a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155573b = null;
    private final String value;

    static {
        ALL = new SearchRequestType("ALL", 0, "all");
        INSIDER = new SearchRequestType("INSIDER", 1, "insider");
        COMPANY = new SearchRequestType("COMPANY", 2, "company");
        PEOPLE = new SearchRequestType("PEOPLE", 3, "users");
        EMITEN = new SearchRequestType("EMITEN", 4, "emiten");
        SearchRequestType[] r02 = a();
        f155572a = r02;
        f155573b = kotlin.enums.b.a(r02);
    }

    SearchRequestType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ SearchRequestType[] a() {
        return new SearchRequestType[]{ALL, INSIDER, COMPANY, PEOPLE, EMITEN};
    }

    public static kotlin.enums.a getEntries() {
        return f155573b;
    }

    public static SearchRequestType valueOf(String r1) {
        return (SearchRequestType) Enum.valueOf(SearchRequestType.class, r1);
    }

    public static SearchRequestType[] values() {
        return (SearchRequestType[]) f155572a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
