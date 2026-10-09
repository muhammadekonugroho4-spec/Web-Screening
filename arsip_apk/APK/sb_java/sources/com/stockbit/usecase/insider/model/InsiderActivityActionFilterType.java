package com.stockbit.usecase.insider.model;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/usecase/insider/model/InsiderActivityActionFilterType;", "", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "ACTION_TYPE_UNSPECIFIED", "ACTION_TYPE_BUY", "ACTION_TYPE_SELL", "ACTION_TYPE_CROSS", "ACTION_TYPE_TRANSFER", "ACTION_TYPE_CORPACTION", "usecase-insider"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum InsiderActivityActionFilterType extends Enum<InsiderActivityActionFilterType> {
    public static final InsiderActivityActionFilterType ACTION_TYPE_BUY = null;
    public static final InsiderActivityActionFilterType ACTION_TYPE_CORPACTION = null;
    public static final InsiderActivityActionFilterType ACTION_TYPE_CROSS = null;
    public static final InsiderActivityActionFilterType ACTION_TYPE_SELL = null;
    public static final InsiderActivityActionFilterType ACTION_TYPE_TRANSFER = null;
    public static final InsiderActivityActionFilterType ACTION_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ InsiderActivityActionFilterType[] f158047a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f158048b = null;
    private final String display;

    static {
        ACTION_TYPE_UNSPECIFIED = new InsiderActivityActionFilterType("ACTION_TYPE_UNSPECIFIED", 0, "All Action");
        ACTION_TYPE_BUY = new InsiderActivityActionFilterType("ACTION_TYPE_BUY", 1, "Buy");
        ACTION_TYPE_SELL = new InsiderActivityActionFilterType("ACTION_TYPE_SELL", 2, "Sell");
        ACTION_TYPE_CROSS = new InsiderActivityActionFilterType("ACTION_TYPE_CROSS", 3, "Cross");
        ACTION_TYPE_TRANSFER = new InsiderActivityActionFilterType("ACTION_TYPE_TRANSFER", 4, "Transfer");
        ACTION_TYPE_CORPACTION = new InsiderActivityActionFilterType("ACTION_TYPE_CORPACTION", 5, "Corp Action");
        InsiderActivityActionFilterType[] r02 = a();
        f158047a = r02;
        f158048b = kotlin.enums.b.a(r02);
    }

    InsiderActivityActionFilterType(String r1, int r2, String r3) {
        this.display = r3;
    }

    public static final /* synthetic */ InsiderActivityActionFilterType[] a() {
        return new InsiderActivityActionFilterType[]{ACTION_TYPE_UNSPECIFIED, ACTION_TYPE_BUY, ACTION_TYPE_SELL, ACTION_TYPE_CROSS, ACTION_TYPE_TRANSFER, ACTION_TYPE_CORPACTION};
    }

    public static kotlin.enums.a getEntries() {
        return f158048b;
    }

    public static InsiderActivityActionFilterType valueOf(String r1) {
        return (InsiderActivityActionFilterType) Enum.valueOf(InsiderActivityActionFilterType.class, r1);
    }

    public static InsiderActivityActionFilterType[] values() {
        return (InsiderActivityActionFilterType[]) f158047a.clone();
    }

    public final String getDisplay() {
        return this.display;
    }
}
