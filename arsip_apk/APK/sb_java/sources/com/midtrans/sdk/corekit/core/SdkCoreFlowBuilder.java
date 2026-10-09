package com.midtrans.sdk.corekit.core;

import android.content.Context;

/* loaded from: classes6.dex */
public class SdkCoreFlowBuilder extends BaseSdkBuilder<SdkCoreFlowBuilder> {
    public SdkCoreFlowBuilder() {
        this.flow = BaseSdkBuilder.CORE_FLOW;
    }

    public static SdkCoreFlowBuilder init() {
        return new SdkCoreFlowBuilder();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.midtrans.sdk.corekit.core.BaseSdkBuilder
    public SdkCoreFlowBuilder enableLog(boolean r1) {
        this.enableLog = r1;
        return this;
    }

    public SdkCoreFlowBuilder setClientKey(String r1) {
        this.clientKey = r1;
        return this;
    }

    public SdkCoreFlowBuilder setContext(Context r1) {
        this.context = r1;
        return this;
    }

    public SdkCoreFlowBuilder setMerchantBaseUrl(String r1) {
        this.merchantServerUrl = r1;
        return this;
    }

    private SdkCoreFlowBuilder(Context r1, String r2, String r3) {
        this.context = r1.getApplicationContext();
        this.clientKey = r2;
        this.merchantServerUrl = r3;
        this.flow = BaseSdkBuilder.CORE_FLOW;
    }

    @Deprecated
    public static SdkCoreFlowBuilder init(Context r1, String r2, String r3) {
        return new SdkCoreFlowBuilder(r1, r2, r3);
    }

    @Override // com.midtrans.sdk.corekit.core.BaseSdkBuilder
    public /* bridge */ /* synthetic */ SdkCoreFlowBuilder enableLog(boolean r1) {
        return enableLog(r1);
    }
}
