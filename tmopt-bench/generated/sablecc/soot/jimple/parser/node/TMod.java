/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

public final class TMod extends Token
{
    public TMod()
    {
        super.setText("%");
    }

    public TMod(int line, int pos)
    {
        super.setText("%");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TMod(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMod(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TMod text.");
    }
}