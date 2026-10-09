package com.stockbit.dto.follower;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0092\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00103J\u0014\u00104\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00106\u001a\u00020\rHÖ\u0081\u0004J\n\u00107\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u000e\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017¨\u00068"}, d2 = {"Lcom/stockbit/dto/follower/FollowedDTO;", "", Constants.KEY_ID, "", "username", "", "fullname", "avatar", "followed", "", "alert", "about", "official", "", "isVerified", "uiType", "verifiedStatus", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUsername", "()Ljava/lang/String;", "getFullname", "getAvatar", "getFollowed", "()Ljava/lang/Boolean;", "setFollowed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAlert", "setAlert", "getAbout", "getOfficial", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUiType", "getVerifiedStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/dto/follower/FollowedDTO;", "equals", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FollowedDTO {

    /* renamed from: a, reason: collision with root package name */
    public final String f88653a;

    @SerializedName("about")
    private final String about;

    @SerializedName("alert")
    private Boolean alert;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("is_followed")
    private Boolean followed;

    @SerializedName("fullname")
    private final String fullname;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final Long f88654id;

    @SerializedName("is_verified")
    private final Boolean isVerified;

    @SerializedName("official")
    private final Integer official;

    @SerializedName("username")
    private final String username;

    @SerializedName("verified")
    private final String verifiedStatus;

    public FollowedDTO() {
        Long r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        Boolean r5 = null;
        Boolean r6 = null;
        String r7 = null;
        Integer r8 = null;
        Boolean r9 = null;
        String r10 = null;
        String r11 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, 2047, null);
    }

    public final String a() {
        return this.about;
    }

    public final Boolean b() {
        return this.alert;
    }

    public final String c() {
        return this.avatar;
    }

    public final Boolean d() {
        return this.followed;
    }

    public final String e() {
        return this.fullname;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FollowedDTO) == true) goto L8;
        return false;
    L8:
        FollowedDTO r52 = (FollowedDTO) r5;
        if (p.g(this.f88654id, r52.f88654id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.username, r52.username) == true) goto L15;
        return false;
    L15:
        if (p.g(this.fullname, r52.fullname) == true) goto L18;
        return false;
    L18:
        if (p.g(this.avatar, r52.avatar) == true) goto L21;
        return false;
    L21:
        if (p.g(this.followed, r52.followed) == true) goto L24;
        return false;
    L24:
        if (p.g(this.alert, r52.alert) == true) goto L27;
        return false;
    L27:
        if (p.g(this.about, r52.about) == true) goto L30;
        return false;
    L30:
        if (p.g(this.official, r52.official) == true) goto L33;
        return false;
    L33:
        if (p.g(this.isVerified, r52.isVerified) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f88653a, r52.f88653a) == true) goto L39;
        return false;
    L39:
        if (p.g(this.verifiedStatus, r52.verifiedStatus) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final Long f() {
        return this.f88654id;
    }

    public final Integer g() {
        return this.official;
    }

    public final String h() {
        return this.f88653a;
    }

    public int hashCode() {
        Long r02 = this.f88654id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.username;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.fullname;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.avatar;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Boolean r27 = this.followed;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Boolean r29 = this.alert;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.about;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        Integer r213 = this.official;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        Boolean r215 = this.isVerified;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f88653a;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.verifiedStatus;
        if (r219 == null) goto L47;
        r1 = r219.hashCode();
    L47:
        return r013 + r1;
    L41:
        r218 = r217.hashCode();
        goto L42
    L37:
        r216 = r215.hashCode();
        goto L38
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

    public final String i() {
        return this.username;
    }

    public final String j() {
        return this.verifiedStatus;
    }

    public final Boolean k() {
        return this.isVerified;
    }

    public String toString() {
        return "FollowedDTO(id=" + this.f88654id + ", username=" + this.username + ", fullname=" + this.fullname + ", avatar=" + this.avatar + ", followed=" + this.followed + ", alert=" + this.alert + ", about=" + this.about + ", official=" + this.official + ", isVerified=" + this.isVerified + ", uiType=" + this.f88653a + ", verifiedStatus=" + this.verifiedStatus + ")";
    }

    public FollowedDTO(Long r1, String r2, String r3, String r4, Boolean r5, Boolean r6, String r7, Integer r8, Boolean r9, String r10, String r11) {
        this.f88654id = r1;
        this.username = r2;
        this.fullname = r3;
        this.avatar = r4;
        this.followed = r5;
        this.alert = r6;
        this.about = r7;
        this.official = r8;
        this.isVerified = r9;
        this.f88653a = r10;
        this.verifiedStatus = r11;
    }

    public /* synthetic */ FollowedDTO(Long r2, String r3, String r4, String r5, Boolean r6, Boolean r7, String r8, Integer r9, Boolean r10, String r11, String r12, int r13, i r14) {
        if ((r13 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r10 = null;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r11 = null;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        String r132 = null;
    L35:
        String r122 = r11;
        Boolean r112 = r10;
        Integer r102 = r9;
        String r92 = r8;
        Boolean r82 = r7;
        Boolean r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112, r122, r132);
        return;
    L36:
        r132 = r12;
        goto L35
    }
}
