package com.stockbit.domain.model.type.stream;

import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/stream/ResearchEntryMenuType;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "ACADEMY", "UNBOXING", "EVENTS", "SNIPS", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ResearchEntryMenuType extends Enum<ResearchEntryMenuType> {
    public static final ResearchEntryMenuType ACADEMY = null;
    public static final ResearchEntryMenuType EVENTS = null;
    public static final ResearchEntryMenuType SNIPS = null;
    public static final ResearchEntryMenuType UNBOXING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ResearchEntryMenuType[] f86469a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86470b = null;
    private final String label;

    static {
        ACADEMY = new ResearchEntryMenuType("ACADEMY", 0, "academy");
        UNBOXING = new ResearchEntryMenuType("UNBOXING", 1, "unboxing");
        EVENTS = new ResearchEntryMenuType("EVENTS", 2, NotificationCompat.CATEGORY_EVENT);
        SNIPS = new ResearchEntryMenuType("SNIPS", 3, "snip");
        ResearchEntryMenuType[] r02 = a();
        f86469a = r02;
        f86470b = b.a(r02);
    }

    ResearchEntryMenuType(String r1, int r2, String r3) {
        this.label = r3;
    }

    public static final /* synthetic */ ResearchEntryMenuType[] a() {
        return new ResearchEntryMenuType[]{ACADEMY, UNBOXING, EVENTS, SNIPS};
    }

    public static kotlin.enums.a getEntries() {
        return f86470b;
    }

    public static ResearchEntryMenuType valueOf(String r1) {
        return (ResearchEntryMenuType) Enum.valueOf(ResearchEntryMenuType.class, r1);
    }

    public static ResearchEntryMenuType[] values() {
        return (ResearchEntryMenuType[]) f86469a.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
