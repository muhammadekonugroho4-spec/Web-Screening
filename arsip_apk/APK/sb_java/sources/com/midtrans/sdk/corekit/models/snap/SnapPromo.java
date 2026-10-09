package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes6.dex */
public class SnapPromo {

    @SerializedName("allowed_promo_codes")
    private List<String> allowedPromoCodes;
    private boolean enabled;

    public SnapPromo() {
    }

    public List<String> getAllowedPromoCodes() {
        return this.allowedPromoCodes;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setAllowedPromoCodes(List<String> r1) {
        this.allowedPromoCodes = r1;
    }

    public void setEnabled(boolean r1) {
        this.enabled = r1;
    }
}
