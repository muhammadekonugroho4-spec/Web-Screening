package com.huawei.hms.common.internal.safeparcel;

import com.huawei.hms.support.api.client.Result;

/* loaded from: classes6.dex */
public abstract class AbstractSafeParcelable extends Result implements SafeParcelable {
    public AbstractSafeParcelable() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}
