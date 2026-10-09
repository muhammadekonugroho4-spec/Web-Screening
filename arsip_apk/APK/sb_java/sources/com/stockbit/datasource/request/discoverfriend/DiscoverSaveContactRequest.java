package com.stockbit.datasource.request.discoverfriend;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/stockbit/datasource/request/discoverfriend/DiscoverSaveContactRequest;", "", "appCheckToken", "", "contacts", "", "Lcom/stockbit/datasource/request/discoverfriend/DiscoverContact;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getAppCheckToken", "()Ljava/lang/String;", "getContacts", "()Ljava/util/List;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DiscoverSaveContactRequest {

    @SerializedName("appcheck_token")
    private final String appCheckToken;

    @SerializedName("contacts")
    private final List<DiscoverContact> contacts;

    public DiscoverSaveContactRequest(String r2, List<DiscoverContact> r3) {
        p.l(r2, "appCheckToken");
        p.l(r3, "contacts");
        this.appCheckToken = r2;
        this.contacts = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DiscoverSaveContactRequest) == true) goto L8;
        return false;
    L8:
        DiscoverSaveContactRequest r52 = (DiscoverSaveContactRequest) r5;
        if (p.g(this.appCheckToken, r52.appCheckToken) == true) goto L12;
        return false;
    L12:
        if (p.g(this.contacts, r52.contacts) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.appCheckToken.hashCode() * 31) + this.contacts.hashCode();
    }

    public String toString() {
        return "DiscoverSaveContactRequest(appCheckToken=" + this.appCheckToken + ", contacts=" + this.contacts + ")";
    }
}
