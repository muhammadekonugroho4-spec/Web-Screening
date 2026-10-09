package com.stockbit.dto.user;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/dto/user/UserSupportDTO;", "", Constants.KEY_ID, "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UserSupportDTO {

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final String f88714id;

    /* JADX WARN: Multi-variable type inference failed */
    public UserSupportDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.f88714id;
    }

    public UserSupportDTO(String r1) {
        this.f88714id = r1;
    }

    public /* synthetic */ UserSupportDTO(String r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
