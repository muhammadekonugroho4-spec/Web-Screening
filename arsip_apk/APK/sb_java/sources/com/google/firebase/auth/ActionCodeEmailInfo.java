package com.google.firebase.auth;

/* loaded from: classes6.dex */
public abstract class ActionCodeEmailInfo extends ActionCodeInfo {
    public ActionCodeEmailInfo() {
    }

    @Override // com.google.firebase.auth.ActionCodeInfo
    public String getEmail() {
        return super.getEmail();
    }

    public abstract String getPreviousEmail();
}
