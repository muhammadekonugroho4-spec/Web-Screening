package com.google.zxing.client.result;

/* loaded from: classes6.dex */
public final class ISBNParsedResult extends ParsedResult {
    private final String isbn;

    public ISBNParsedResult(String r2) {
        super(ParsedResultType.ISBN);
        this.isbn = r2;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        return this.isbn;
    }

    public String getISBN() {
        return this.isbn;
    }
}
