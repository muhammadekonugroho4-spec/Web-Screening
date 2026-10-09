package com.stockbit.dto.chat.group;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stockbit/dto/chat/group/PrivateGroupAttributeDTO;", "", Constants.KEY_ID, "", "<init>", "(Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", Constants.COPY_TYPE, "(Ljava/lang/Integer;)Lcom/stockbit/dto/chat/group/PrivateGroupAttributeDTO;", "equals", "", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PrivateGroupAttributeDTO {

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final Integer f88612id;

    /* JADX WARN: Multi-variable type inference failed */
    public PrivateGroupAttributeDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Integer a() {
        return this.f88612id;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof PrivateGroupAttributeDTO) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f88612id, ((PrivateGroupAttributeDTO) r4).f88612id) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f88612id;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "PrivateGroupAttributeDTO(id=" + this.f88612id + ")";
    }

    public PrivateGroupAttributeDTO(Integer r1) {
        this.f88612id = r1;
    }

    public /* synthetic */ PrivateGroupAttributeDTO(Integer r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
