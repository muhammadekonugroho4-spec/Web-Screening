package com.stockbit.dto.profile.v2;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/profile/v2/MyProfileStreamPreferencesDTO;", "", "version", "", "hasVersion2Explained", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getVersion", "()Ljava/lang/String;", "getHasVersion2Explained", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stockbit/dto/profile/v2/MyProfileStreamPreferencesDTO;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MyProfileStreamPreferencesDTO {

    @SerializedName("has_version_2_explained")
    private final Boolean hasVersion2Explained;

    @SerializedName("version")
    private final String version;

    /* JADX WARN: Multi-variable type inference failed */
    public MyProfileStreamPreferencesDTO() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final Boolean a() {
        return this.hasVersion2Explained;
    }

    public final String b() {
        return this.version;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MyProfileStreamPreferencesDTO) == true) goto L8;
        return false;
    L8:
        MyProfileStreamPreferencesDTO r52 = (MyProfileStreamPreferencesDTO) r5;
        if (p.g(this.version, r52.version) == true) goto L12;
        return false;
    L12:
        if (p.g(this.hasVersion2Explained, r52.hasVersion2Explained) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.version;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.hasVersion2Explained;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "MyProfileStreamPreferencesDTO(version=" + this.version + ", hasVersion2Explained=" + this.hasVersion2Explained + ")";
    }

    public MyProfileStreamPreferencesDTO(String r1, Boolean r2) {
        this.version = r1;
        this.hasVersion2Explained = r2;
    }

    public /* synthetic */ MyProfileStreamPreferencesDTO(String r1, Boolean r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = null;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = Boolean.FALSE;
    L8:
        this(r1, r2);
    }
}
