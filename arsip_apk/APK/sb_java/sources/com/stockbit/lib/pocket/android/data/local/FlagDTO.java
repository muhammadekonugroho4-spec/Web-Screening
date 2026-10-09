package com.stockbit.lib.pocket.android.data.local;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/stockbit/lib/pocket/android/data/local/FlagDTO;", "", "identifier", "", "flag", FirebaseAnalytics.Param.LEVEL, "", "flagType", "dataType", "lastAccess", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;J)V", "getIdentifier", "()Ljava/lang/String;", "getFlag", "getLevel", "()I", "getFlagType", "getDataType", "getLastAccess", "()J", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "pocket_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlagDTO {

    @SerializedName("data_type")
    private final String dataType;

    @SerializedName("flag")
    private final String flag;

    @SerializedName("flag_type")
    private final int flagType;

    @SerializedName("identifier")
    private final String identifier;

    @SerializedName("last_access")
    private final long lastAccess;

    @SerializedName(FirebaseAnalytics.Param.LEVEL)
    private final int level;

    public FlagDTO(String r2, String r3, int r4, int r5, String r6, long r7) {
        p.l(r2, "identifier");
        p.l(r6, "dataType");
        this.identifier = r2;
        this.flag = r3;
        this.level = r4;
        this.flagType = r5;
        this.dataType = r6;
        this.lastAccess = r7;
    }

    public final String a() {
        return this.dataType;
    }

    public final String b() {
        return this.flag;
    }

    public final int c() {
        return this.flagType;
    }

    public final String d() {
        return this.identifier;
    }

    public final long e() {
        return this.lastAccess;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof FlagDTO) == true) goto L8;
        return false;
    L8:
        FlagDTO r82 = (FlagDTO) r8;
        if (p.g(this.identifier, r82.identifier) == true) goto L12;
        return false;
    L12:
        if (p.g(this.flag, r82.flag) == true) goto L15;
        return false;
    L15:
        if (this.level == r82.level) goto L18;
        return false;
    L18:
        if (this.flagType == r82.flagType) goto L21;
        return false;
    L21:
        if (p.g(this.dataType, r82.dataType) == true) goto L24;
        return false;
    L24:
        if (this.lastAccess == r82.lastAccess) goto L26;
        return false;
    L26:
        return true;
    }

    public final int f() {
        return this.level;
    }

    public int hashCode() {
        int r02 = this.identifier.hashCode() * 31;
        String r1 = this.flag;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((((r02 + r12) * 31) + Integer.hashCode(this.level)) * 31) + Integer.hashCode(this.flagType)) * 31) + this.dataType.hashCode()) * 31) + Long.hashCode(this.lastAccess);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "FlagDTO(identifier=" + this.identifier + ", flag=" + this.flag + ", level=" + this.level + ", flagType=" + this.flagType + ", dataType=" + this.dataType + ", lastAccess=" + this.lastAccess + ')';
    }
}
