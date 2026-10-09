package com.stockbit.dto.profile.v2;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0002\u0010\u0007R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/profile/v2/MyProfilePreferencesPrivacyDTO;", "", "isHideFacebook", "", "isHideEmail", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stockbit/dto/profile/v2/MyProfilePreferencesPrivacyDTO;", "equals", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MyProfilePreferencesPrivacyDTO {

    @SerializedName("is_hide_email")
    private final Boolean isHideEmail;

    @SerializedName("is_hide_facebook")
    private final Boolean isHideFacebook;

    /* JADX WARN: Multi-variable type inference failed */
    public MyProfilePreferencesPrivacyDTO() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final Boolean a() {
        return this.isHideEmail;
    }

    public final Boolean b() {
        return this.isHideFacebook;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MyProfilePreferencesPrivacyDTO) == true) goto L8;
        return false;
    L8:
        MyProfilePreferencesPrivacyDTO r52 = (MyProfilePreferencesPrivacyDTO) r5;
        if (p.g(this.isHideFacebook, r52.isHideFacebook) == true) goto L12;
        return false;
    L12:
        if (p.g(this.isHideEmail, r52.isHideEmail) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.isHideFacebook;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.isHideEmail;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "MyProfilePreferencesPrivacyDTO(isHideFacebook=" + this.isHideFacebook + ", isHideEmail=" + this.isHideEmail + ")";
    }

    public MyProfilePreferencesPrivacyDTO(Boolean r1, Boolean r2) {
        this.isHideFacebook = r1;
        this.isHideEmail = r2;
    }

    public /* synthetic */ MyProfilePreferencesPrivacyDTO(Boolean r1, Boolean r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Boolean.FALSE;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = Boolean.FALSE;
    L8:
        this(r1, r2);
    }
}
