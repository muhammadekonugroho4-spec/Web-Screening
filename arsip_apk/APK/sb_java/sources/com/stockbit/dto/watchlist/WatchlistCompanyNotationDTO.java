package com.stockbit.dto.watchlist;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.company.CompanyEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/stockbit/dto/watchlist/WatchlistCompanyNotationDTO;", "", "notationCode", "", "notationDesc", "iconUrl", "Lcom/stockbit/dto/watchlist/WatchlistCompanyNotationDTO$IconUrlDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/watchlist/WatchlistCompanyNotationDTO$IconUrlDTO;)V", "getNotationCode", "()Ljava/lang/String;", "setNotationCode", "(Ljava/lang/String;)V", "getNotationDesc", "setNotationDesc", "getIconUrl", "()Lcom/stockbit/dto/watchlist/WatchlistCompanyNotationDTO$IconUrlDTO;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "IconUrlDTO", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WatchlistCompanyNotationDTO {

    @SerializedName("icon_url")
    private final IconUrlDTO iconUrl;

    @SerializedName(alternate = {"code"}, value = "notation_code")
    private String notationCode;

    @SerializedName(alternate = {CompanyEntryPoint.EXTRA_DESC}, value = "notation_desc")
    private String notationDesc;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/watchlist/WatchlistCompanyNotationDTO$IconUrlDTO;", "", "lightMode", "", "darkMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLightMode", "()Ljava/lang/String;", "getDarkMode", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class IconUrlDTO {

        @SerializedName("dark_mode")
        private final String darkMode;

        @SerializedName("light_mode")
        private final String lightMode;

        /* JADX WARN: Multi-variable type inference failed */
        public IconUrlDTO() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final String a() {
            return this.darkMode;
        }

        public final String b() {
            return this.lightMode;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof IconUrlDTO) == true) goto L8;
            return false;
        L8:
            IconUrlDTO r52 = (IconUrlDTO) r5;
            if (p.g(this.lightMode, r52.lightMode) == true) goto L12;
            return false;
        L12:
            if (p.g(this.darkMode, r52.darkMode) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.lightMode;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.darkMode;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "IconUrlDTO(lightMode=" + this.lightMode + ", darkMode=" + this.darkMode + ")";
        }

        public IconUrlDTO(String r1, String r2) {
            this.lightMode = r1;
            this.darkMode = r2;
        }

        public /* synthetic */ IconUrlDTO(String r2, String r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    public WatchlistCompanyNotationDTO() {
        String r1 = null;
        String r2 = null;
        IconUrlDTO r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final IconUrlDTO a() {
        return this.iconUrl;
    }

    public final String b() {
        return this.notationCode;
    }

    public final String c() {
        return this.notationDesc;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchlistCompanyNotationDTO) == true) goto L8;
        return false;
    L8:
        WatchlistCompanyNotationDTO r52 = (WatchlistCompanyNotationDTO) r5;
        if (p.g(this.notationCode, r52.notationCode) == true) goto L12;
        return false;
    L12:
        if (p.g(this.notationDesc, r52.notationDesc) == true) goto L15;
        return false;
    L15:
        if (p.g(this.iconUrl, r52.iconUrl) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.notationCode;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.notationDesc;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        IconUrlDTO r23 = this.iconUrl;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "WatchlistCompanyNotationDTO(notationCode=" + this.notationCode + ", notationDesc=" + this.notationDesc + ", iconUrl=" + this.iconUrl + ")";
    }

    public WatchlistCompanyNotationDTO(String r1, String r2, IconUrlDTO r3) {
        this.notationCode = r1;
        this.notationDesc = r2;
        this.iconUrl = r3;
    }

    public /* synthetic */ WatchlistCompanyNotationDTO(String r2, String r3, IconUrlDTO r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
