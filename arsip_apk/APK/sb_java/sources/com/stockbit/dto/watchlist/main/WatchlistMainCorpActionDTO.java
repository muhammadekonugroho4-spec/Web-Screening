package com.stockbit.dto.watchlist.main;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stockbit/dto/watchlist/main/WatchlistMainCorpActionDTO;", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "<init>", "(Ljava/lang/Boolean;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", Constants.COPY_TYPE, "(Ljava/lang/Boolean;)Lcom/stockbit/dto/watchlist/main/WatchlistMainCorpActionDTO;", "equals", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WatchlistMainCorpActionDTO {

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    private final Boolean active;

    /* JADX WARN: Multi-variable type inference failed */
    public WatchlistMainCorpActionDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean a() {
        return this.active;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof WatchlistMainCorpActionDTO) == true) goto L9;
        return false;
    L9:
        if (p.g(this.active, ((WatchlistMainCorpActionDTO) r4).active) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.active;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "WatchlistMainCorpActionDTO(active=" + this.active + ")";
    }

    public WatchlistMainCorpActionDTO(Boolean r1) {
        this.active = r1;
    }

    public /* synthetic */ WatchlistMainCorpActionDTO(Boolean r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
