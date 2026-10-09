package com.stockbit.model.type.screener;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.search.SearchEntryPoint;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stockbit/model/type/screener/UniverseType;", "", "value", "", "alias", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getAlias", "()Ljava/lang/String;", "INDEX", "SECTOR", "WATCHLIST", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum UniverseType extends Enum<UniverseType> {
    public static final UniverseType INDEX = null;
    public static final UniverseType SECTOR = null;
    public static final UniverseType WATCHLIST = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UniverseType[] f122239a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f122240b = null;
    private final String alias;
    private final int value;

    static {
        INDEX = new UniverseType("INDEX", 0, 0, FirebaseAnalytics.Param.INDEX);
        SECTOR = new UniverseType("SECTOR", 1, 1, SearchEntryPoint.KEY_SECTOR);
        WATCHLIST = new UniverseType("WATCHLIST", 2, 2, "watchlist");
        UniverseType[] r02 = a();
        f122239a = r02;
        f122240b = b.a(r02);
    }

    UniverseType(String r1, int r2, int r3, String r4) {
        this.value = r3;
        this.alias = r4;
    }

    public static final /* synthetic */ UniverseType[] a() {
        return new UniverseType[]{INDEX, SECTOR, WATCHLIST};
    }

    public static a getEntries() {
        return f122240b;
    }

    public static UniverseType valueOf(String r1) {
        return (UniverseType) Enum.valueOf(UniverseType.class, r1);
    }

    public static UniverseType[] values() {
        return (UniverseType[]) f122239a.clone();
    }

    public final String getAlias() {
        return this.alias;
    }

    public final int getValue() {
        return this.value;
    }
}
