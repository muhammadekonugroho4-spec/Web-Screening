package com.midtrans.sdk.corekit.models.snap.payment;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class CustomerDetailRequest {
    private String email;

    @SerializedName("full_name")
    private String fullName;
    private String phone;

    public CustomerDetailRequest() {
    }

    public String getEmail() {
        return this.email;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setEmail(String r2) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
        r2 = null;
    L5:
        this.email = r2;
    }

    public void setFullName(String r2) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
        r2 = null;
    L5:
        this.fullName = r2;
    }

    public void setPhone(String r2) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
        r2 = null;
    L5:
        this.phone = r2;
    }
}
