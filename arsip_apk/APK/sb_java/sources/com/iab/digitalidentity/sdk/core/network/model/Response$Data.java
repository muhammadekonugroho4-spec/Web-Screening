package com.iab.digitalidentity.sdk.core.network.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/Response$Data", "", "", "files", "", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "getFiles", "()Ljava/util/List;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Response$Data {

    @SerializedName("files")
    private final List<Object> files;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    /* JADX WARN: Multi-variable type inference failed */
    public Response$Data() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.status;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Response$Data) == true) goto L8;
        return false;
    L8:
        Response$Data r52 = (Response$Data) r5;
        if (p.g(this.files, r52.files) == true) goto L12;
        return false;
    L12:
        if (p.g(this.status, r52.status) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        List<Object> r02 = this.files;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.status;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String toString() {
        return "Data(files=" + this.files + ", status=" + this.status + ")";
    }

    public Response$Data(List<Object> r1, String r2) {
        this.files = r1;
        this.status = r2;
    }

    public /* synthetic */ Response$Data(List r2, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
