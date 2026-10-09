package com.stockbit.usecase.profile.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/profile/model/ListItemType;", "", "<init>", "(Ljava/lang/String;I)V", "MENU_ACTION_COPY", "MENU_ACTION_CHAT", "MENU_ACTION_WRITE_POST_WITH_MENTION", "MENU_REPORT_USER", "MENU_ACTION_BLOCK", "MENU_ACTION_UNBLOCK", "usecase-profile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ListItemType extends Enum<ListItemType> {
    public static final ListItemType MENU_ACTION_BLOCK = null;
    public static final ListItemType MENU_ACTION_CHAT = null;
    public static final ListItemType MENU_ACTION_COPY = null;
    public static final ListItemType MENU_ACTION_UNBLOCK = null;
    public static final ListItemType MENU_ACTION_WRITE_POST_WITH_MENTION = null;
    public static final ListItemType MENU_REPORT_USER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ListItemType[] f159397a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f159398b = null;

    static {
        MENU_ACTION_COPY = new ListItemType("MENU_ACTION_COPY", 0);
        MENU_ACTION_CHAT = new ListItemType("MENU_ACTION_CHAT", 1);
        MENU_ACTION_WRITE_POST_WITH_MENTION = new ListItemType("MENU_ACTION_WRITE_POST_WITH_MENTION", 2);
        MENU_REPORT_USER = new ListItemType("MENU_REPORT_USER", 3);
        MENU_ACTION_BLOCK = new ListItemType("MENU_ACTION_BLOCK", 4);
        MENU_ACTION_UNBLOCK = new ListItemType("MENU_ACTION_UNBLOCK", 5);
        ListItemType[] r02 = a();
        f159397a = r02;
        f159398b = kotlin.enums.b.a(r02);
    }

    ListItemType(String r1, int r2) {
    }

    public static final /* synthetic */ ListItemType[] a() {
        return new ListItemType[]{MENU_ACTION_COPY, MENU_ACTION_CHAT, MENU_ACTION_WRITE_POST_WITH_MENTION, MENU_REPORT_USER, MENU_ACTION_BLOCK, MENU_ACTION_UNBLOCK};
    }

    public static kotlin.enums.a getEntries() {
        return f159398b;
    }

    public static ListItemType valueOf(String r1) {
        return (ListItemType) Enum.valueOf(ListItemType.class, r1);
    }

    public static ListItemType[] values() {
        return (ListItemType[]) f159397a.clone();
    }
}
