package com.google.zxing.client.result;

/* loaded from: classes6.dex */
public final class EmailAddressParsedResult extends ParsedResult {
    private final String[] bccs;
    private final String body;
    private final String[] ccs;
    private final String subject;
    private final String[] tos;

    public EmailAddressParsedResult(String r7) {
        this(new String[]{r7}, null, null, null, null);
    }

    public String[] getBCCs() {
        return this.bccs;
    }

    public String getBody() {
        return this.body;
    }

    public String[] getCCs() {
        return this.ccs;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder r02 = new StringBuilder(30);
        ParsedResult.maybeAppend(this.tos, r02);
        ParsedResult.maybeAppend(this.ccs, r02);
        ParsedResult.maybeAppend(this.bccs, r02);
        ParsedResult.maybeAppend(this.subject, r02);
        ParsedResult.maybeAppend(this.body, r02);
        return r02.toString();
    }

    @Deprecated
    public String getEmailAddress() {
        String[] r02 = this.tos;
        if (r02 != null) goto L5;
        return null;
    L5:
        if (r02.length != 0) goto L8;
        return null;
    L8:
        return r02[0];
    }

    @Deprecated
    public String getMailtoURI() {
        return "mailto:";
    }

    public String getSubject() {
        return this.subject;
    }

    public String[] getTos() {
        return this.tos;
    }

    public EmailAddressParsedResult(String[] r2, String[] r3, String[] r4, String r5, String r6) {
        super(ParsedResultType.EMAIL_ADDRESS);
        this.tos = r2;
        this.ccs = r3;
        this.bccs = r4;
        this.subject = r5;
        this.body = r6;
    }
}
