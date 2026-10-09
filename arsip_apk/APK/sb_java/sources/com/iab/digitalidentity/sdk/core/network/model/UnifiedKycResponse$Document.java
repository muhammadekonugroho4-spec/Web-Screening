package com.iab.digitalidentity.sdk.core.network.model;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$Document", "", "", Constants.KEY_ID, "documentType", "url", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "c", "getStatus", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$Document {

    @SerializedName("documentType")
    private final String documentType;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final String f40156id;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("url")
    private final String url;

    public UnifiedKycResponse$Document() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final String a() {
        return this.documentType;
    }

    public final String b() {
        return this.f40156id;
    }

    public final String c() {
        return this.url;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$Document) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$Document r52 = (UnifiedKycResponse$Document) r5;
        if (p.g(this.f40156id, r52.f40156id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.documentType, r52.documentType) == true) goto L15;
        return false;
    L15:
        if (p.g(this.url, r52.url) == true) goto L18;
        return false;
    L18:
        if (p.g(this.status, r52.status) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        String r02 = this.f40156id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.documentType;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.url;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.status;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
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

    public final String toString() {
        return "Document(id=" + this.f40156id + ", documentType=" + this.documentType + ", url=" + this.url + ", status=" + this.status + ")";
    }

    public UnifiedKycResponse$Document(String r1, String r2, String r3, String r4) {
        this.f40156id = r1;
        this.documentType = r2;
        this.url = r3;
        this.status = r4;
    }

    public /* synthetic */ UnifiedKycResponse$Document(String r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
