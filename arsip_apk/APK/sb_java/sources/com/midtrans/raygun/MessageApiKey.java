package com.midtrans.raygun;

import java.io.Serializable;

/* loaded from: classes6.dex */
public class MessageApiKey implements Serializable {
    public String apiKey;
    public String message;

    public MessageApiKey(String r1, String r2) {
        this.apiKey = r1;
        this.message = r2;
    }
}
