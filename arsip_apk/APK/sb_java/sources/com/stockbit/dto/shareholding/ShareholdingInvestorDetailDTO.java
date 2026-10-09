package com.stockbit.dto.shareholding;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006%"}, d2 = {"Lcom/stockbit/dto/shareholding/ShareholdingInvestorDetailDTO;", "", Constants.KEY_ID, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "investorClassification", "Lcom/stockbit/dto/shareholding/ShareholdingFormattedValueDTO;", FirebaseAnalytics.Param.LOCATION, "nationality", "domicile", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lcom/stockbit/dto/shareholding/ShareholdingFormattedValueDTO;Lcom/stockbit/dto/shareholding/ShareholdingFormattedValueDTO;Lcom/stockbit/dto/shareholding/ShareholdingFormattedValueDTO;Lcom/stockbit/dto/shareholding/ShareholdingFormattedValueDTO;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "getInvestorClassification", "()Lcom/stockbit/dto/shareholding/ShareholdingFormattedValueDTO;", "getLocation", "getNationality", "getDomicile", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/Long;Ljava/lang/String;Lcom/stockbit/dto/shareholding/ShareholdingFormattedValueDTO;Lcom/stockbit/dto/shareholding/ShareholdingFormattedValueDTO;Lcom/stockbit/dto/shareholding/ShareholdingFormattedValueDTO;Lcom/stockbit/dto/shareholding/ShareholdingFormattedValueDTO;)Lcom/stockbit/dto/shareholding/ShareholdingInvestorDetailDTO;", "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ShareholdingInvestorDetailDTO {

    @SerializedName("domicile")
    private final ShareholdingFormattedValueDTO domicile;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final Long f88704id;

    @SerializedName("investor_classification")
    private final ShareholdingFormattedValueDTO investorClassification;

    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final ShareholdingFormattedValueDTO location;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("nationality")
    private final ShareholdingFormattedValueDTO nationality;

    public ShareholdingInvestorDetailDTO(Long r1, String r2, ShareholdingFormattedValueDTO r3, ShareholdingFormattedValueDTO r4, ShareholdingFormattedValueDTO r5, ShareholdingFormattedValueDTO r6) {
        this.f88704id = r1;
        this.name = r2;
        this.investorClassification = r3;
        this.location = r4;
        this.nationality = r5;
        this.domicile = r6;
    }

    public final ShareholdingFormattedValueDTO a() {
        return this.domicile;
    }

    public final Long b() {
        return this.f88704id;
    }

    public final ShareholdingFormattedValueDTO c() {
        return this.investorClassification;
    }

    public final ShareholdingFormattedValueDTO d() {
        return this.location;
    }

    public final String e() {
        return this.name;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ShareholdingInvestorDetailDTO) == true) goto L8;
        return false;
    L8:
        ShareholdingInvestorDetailDTO r52 = (ShareholdingInvestorDetailDTO) r5;
        if (p.g(this.f88704id, r52.f88704id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.name, r52.name) == true) goto L15;
        return false;
    L15:
        if (p.g(this.investorClassification, r52.investorClassification) == true) goto L18;
        return false;
    L18:
        if (p.g(this.location, r52.location) == true) goto L21;
        return false;
    L21:
        if (p.g(this.nationality, r52.nationality) == true) goto L24;
        return false;
    L24:
        if (p.g(this.domicile, r52.domicile) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final ShareholdingFormattedValueDTO f() {
        return this.nationality;
    }

    public int hashCode() {
        Long r02 = this.f88704id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.name;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        ShareholdingFormattedValueDTO r23 = this.investorClassification;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        ShareholdingFormattedValueDTO r25 = this.location;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        ShareholdingFormattedValueDTO r27 = this.nationality;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        ShareholdingFormattedValueDTO r29 = this.domicile;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "ShareholdingInvestorDetailDTO(id=" + this.f88704id + ", name=" + this.name + ", investorClassification=" + this.investorClassification + ", location=" + this.location + ", nationality=" + this.nationality + ", domicile=" + this.domicile + ")";
    }
}
