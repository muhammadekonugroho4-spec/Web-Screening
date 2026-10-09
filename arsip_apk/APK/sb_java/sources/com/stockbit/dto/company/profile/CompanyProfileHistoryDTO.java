package com.stockbit.dto.company.profile;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J{\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/stockbit/dto/company/profile/CompanyProfileHistoryDTO;", "", Constants.KEY_DATE, "", FirebaseAnalytics.Param.PRICE, "shares", "amount", "board", "registrar", "underwriters", "", "administrativeBureau", "freeFloat", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getPrice", "getShares", "getAmount", "getBoard", "getRegistrar", "getUnderwriters", "()Ljava/util/List;", "getAdministrativeBureau", "getFreeFloat", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompanyProfileHistoryDTO {

    @SerializedName("administrative_bureau")
    private final String administrativeBureau;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("board")
    private final String board;

    @SerializedName(Constants.KEY_DATE)
    private final String date;

    @SerializedName("free_float")
    private final String freeFloat;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName("registrar")
    private final String registrar;

    @SerializedName("shares")
    private final String shares;

    @SerializedName("underwriters")
    private final List<String> underwriters;

    public CompanyProfileHistoryDTO(String r1, String r2, String r3, String r4, String r5, String r6, List<String> r7, String r8, String r9) {
        this.date = r1;
        this.price = r2;
        this.shares = r3;
        this.amount = r4;
        this.board = r5;
        this.registrar = r6;
        this.underwriters = r7;
        this.administrativeBureau = r8;
        this.freeFloat = r9;
    }

    public final String a() {
        return this.administrativeBureau;
    }

    public final String b() {
        return this.amount;
    }

    public final String c() {
        return this.board;
    }

    public final String d() {
        return this.date;
    }

    public final String e() {
        return this.freeFloat;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyProfileHistoryDTO) == true) goto L8;
        return false;
    L8:
        CompanyProfileHistoryDTO r52 = (CompanyProfileHistoryDTO) r5;
        if (p.g(this.date, r52.date) == true) goto L12;
        return false;
    L12:
        if (p.g(this.price, r52.price) == true) goto L15;
        return false;
    L15:
        if (p.g(this.shares, r52.shares) == true) goto L18;
        return false;
    L18:
        if (p.g(this.amount, r52.amount) == true) goto L21;
        return false;
    L21:
        if (p.g(this.board, r52.board) == true) goto L24;
        return false;
    L24:
        if (p.g(this.registrar, r52.registrar) == true) goto L27;
        return false;
    L27:
        if (p.g(this.underwriters, r52.underwriters) == true) goto L30;
        return false;
    L30:
        if (p.g(this.administrativeBureau, r52.administrativeBureau) == true) goto L33;
        return false;
    L33:
        if (p.g(this.freeFloat, r52.freeFloat) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.price;
    }

    public final String g() {
        return this.shares;
    }

    public final List h() {
        return this.underwriters;
    }

    public int hashCode() {
        String r02 = this.date;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.price;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.shares;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.amount;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.board;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.registrar;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        List<String> r211 = this.underwriters;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.administrativeBureau;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.freeFloat;
        if (r215 == null) goto L39;
        r1 = r215.hashCode();
    L39:
        return r011 + r1;
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
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
        return "CompanyProfileHistoryDTO(date=" + this.date + ", price=" + this.price + ", shares=" + this.shares + ", amount=" + this.amount + ", board=" + this.board + ", registrar=" + this.registrar + ", underwriters=" + this.underwriters + ", administrativeBureau=" + this.administrativeBureau + ", freeFloat=" + this.freeFloat + ")";
    }

    public /* synthetic */ CompanyProfileHistoryDTO(String r2, String r3, String r4, String r5, String r6, String r7, List r8, String r9, String r10, int r11, i r12) {
        if ((r11 & 64) == 0) goto L6;
        r8 = null;
    L6:
        if ((r11 & 128) == 0) goto L9;
        r9 = null;
    L9:
        if ((r11 & 256) == 0) goto L12;
        String r112 = null;
    L13:
        this(r2, r3, r4, r5, r6, r7, r8, r9, r112);
        return;
    L12:
        r112 = r10;
        goto L13
    }
}
