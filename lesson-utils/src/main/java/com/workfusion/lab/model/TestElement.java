package com.workfusion.lab.model;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.workfusion.vds.sdk.api.nlp.model.Token;

public class TestElement {

    protected int begin;
    protected int end;
    protected String text;

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }

    public String getText() {
        return text;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(begin, end, text);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        TestElement other = (TestElement) obj;
        return Objects.equal(this.begin, other.begin)
                && Objects.equal(this.text, other.text)
                && Objects.equal(this.end, other.end);
    }

    @Override
    public String toString() {
        int maxPrintedTextSize = 100;
        return MoreObjects.toStringHelper(Token.class)
                .add("begin", begin)
                .add("end", end)
                .add("text (first " + maxPrintedTextSize + " symbols)", StringUtils.abbreviate(text, maxPrintedTextSize))
                .toString();
    }

}
