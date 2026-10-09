package com.stockbit.usecase.verification.model.otp;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/stockbit/usecase/verification/model/otp/OTPChannelsJson;", "", "showForgotPhoneButton", "", "defaultChannel", "", "channels", "", "Lcom/stockbit/usecase/verification/model/otp/OTPChannelJson;", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "getShowForgotPhoneButton", "()Z", "getDefaultChannel", "()Ljava/lang/String;", "getChannels", "()Ljava/util/List;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "usecase-verification_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OTPChannelsJson {

    @SerializedName("channels")
    private final List<OTPChannelJson> channels;

    @SerializedName("default_channel")
    private final String defaultChannel;

    @SerializedName("show_forgot_phone_button")
    private final boolean showForgotPhoneButton;

    public OTPChannelsJson(boolean r2, String r3, List<OTPChannelJson> r4) {
        p.l(r3, "defaultChannel");
        p.l(r4, "channels");
        this.showForgotPhoneButton = r2;
        this.defaultChannel = r3;
        this.channels = r4;
    }

    public final List a() {
        return this.channels;
    }

    public final String b() {
        return this.defaultChannel;
    }

    public final boolean c() {
        return this.showForgotPhoneButton;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OTPChannelsJson) == true) goto L8;
        return false;
    L8:
        OTPChannelsJson r52 = (OTPChannelsJson) r5;
        if (this.showForgotPhoneButton == r52.showForgotPhoneButton) goto L12;
        return false;
    L12:
        if (p.g(this.defaultChannel, r52.defaultChannel) == true) goto L15;
        return false;
    L15:
        if (p.g(this.channels, r52.channels) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.showForgotPhoneButton) * 31) + this.defaultChannel.hashCode()) * 31) + this.channels.hashCode();
    }

    public String toString() {
        return "OTPChannelsJson(showForgotPhoneButton=" + this.showForgotPhoneButton + ", defaultChannel=" + this.defaultChannel + ", channels=" + this.channels + ')';
    }

    public /* synthetic */ OTPChannelsJson(boolean r1, String r2, List r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L5;
        r1 = false;
    L5:
        this(r1, r2, r3);
    }
}
