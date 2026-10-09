package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC11777v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/stockbit/model/entity/SecuritiesFormResponseData;", "", "version", "", "mappings", "", "Lcom/stockbit/model/entity/MappingResponseData;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getVersion", "()Ljava/lang/String;", "setVersion", "(Ljava/lang/String;)V", "getMappings", "()Ljava/util/List;", "setMappings", "(Ljava/util/List;)V", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecuritiesFormResponseData {

    @SerializedName("mappings")
    private List<MappingResponseData> mappings;

    @SerializedName("version")
    private String version;

    /* JADX WARN: Multi-variable type inference failed */
    public SecuritiesFormResponseData() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final List a() {
        return this.mappings;
    }

    public final String b() {
        return this.version;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SecuritiesFormResponseData) == true) goto L8;
        return false;
    L8:
        SecuritiesFormResponseData r52 = (SecuritiesFormResponseData) r5;
        if (p.g(this.version, r52.version) == true) goto L12;
        return false;
    L12:
        if (p.g(this.mappings, r52.mappings) == true) goto L14;
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
        List<MappingResponseData> r2 = this.mappings;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "SecuritiesFormResponseData(version=" + this.version + ", mappings=" + this.mappings + ')';
    }

    public SecuritiesFormResponseData(String r1, List<MappingResponseData> r2) {
        this.version = r1;
        this.mappings = r2;
    }

    public /* synthetic */ SecuritiesFormResponseData(String r1, List r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = null;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = AbstractC11777v.o();
    L8:
        this(r1, r2);
    }
}
