package com.google.zxing.client.result;

/* loaded from: classes6.dex */
public final class TelParsedResult extends ParsedResult {
    private final String number;
    private final String telURI;
    private final String title;

    public TelParsedResult(String r2, String r3, String r4) {
        super(ParsedResultType.TEL);
        this.number = r2;
        this.telURI = r3;
        this.title = r4;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder r02 = new StringBuilder(20);
        ParsedResult.maybeAppend(this.number, r02);
        ParsedResult.maybeAppend(this.title, r02);
        return r02.toString();
    }

    public String getNumber() {
        return this.number;
    }

    public String getTelURI() {
        return this.telURI;
    }

    public String getTitle() {
        return this.title;
    }
}
