/*
 *  This file is part of MxUpdate <http://www.mxupdate.org>.
 *
 *  MxUpdate is a deployment tool for a PLM platform to handle
 *  administration objects as single update files (configuration item).
 *
 *  Copyright (C) 2008-2016 The MxUpdate Team - All Rights Reserved
 *
 *  You may use, distribute and modify MxUpdate under the terms of the
 *  MxUpdate license. You should have received a copy of the MxUpdate
 *  license with this file. If not, please write to <info@mxupdate.org>,
 *  or visit <www.mxupdate.org>.
 *
 */

package org.mxupdate.test.data.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import matrix.util.MatrixException;

import org.mxupdate.test.AbstractTest;
import org.mxupdate.test.ExportParser;

/**
 * String-value list.
 *
 * @author The MxUpdate Team
 */
public class StringValueList
    extends AbstractList
{
    /** Values. */
    private final Map<String,String> values = new HashMap<String,String>();

    /**
     * Defines a value.
     *
     * @param _key      key
     * @param _value    value
     */
    public void put(final String _key,
                    final String _value)
    {
        this.values.put(_key, _value);
    }

    /**
     * Returns for given {@code _key} related valued.
     *
     * @param _key  key
     * @return found value; {@code null} if not found
     */
    public String getValue(final String _key)
    {
        return this.values.get(_key);
    }

    /**
     * Appends the defined flags to the TCL code {@code _cmd} of the
     * configuration item file.
     *
     * @param _prefix   prefix in front of the values
     * @param _cmd      string builder with the TCL commands of the
     *                  configuration item file
     */
    @Override()
    public void append4Update(final String _prefix,
                             final StringBuilder _cmd)
    {
        for (final Entry<String,String> entry : this.values.entrySet())  {
            _cmd.append(_prefix).append(entry.getKey()).append(" ")
                .append("\"").append(AbstractTest.convertUpdate(entry.getValue().toString())).append('\"')
                .append('\n');
        }
    }

    /**
     * Appends the MQL commands to define all values within a create.
     *
     * @param _cmd  string builder used to append MQL commands
     * @throws MatrixException if used object could not be created
     */
    public void append4Create(final StringBuilder _cmd)
    {
        for (final Map.Entry<String,String> entry : this.values.entrySet())  {
            _cmd.append(' ').append(entry.getKey()).append(" \"").append(AbstractTest.convertMql(entry.getValue().toString())).append('\"');
        }
    }

    /**
     * Checks for all defined values.
     *
     * @param _exportParser     parsed export
     * @param _path             sub path
     */
    @Override
    public void check4Export(final ExportParser _exportParser,
                            final String _path)
    {
        for (final Entry<String,String> entry : this.values.entrySet())  {
            _exportParser.checkValue((_path.isEmpty() ? "" : _path + "/") + entry.getKey(), "\"" + AbstractTest.convertUpdate(entry.getValue().toString()) + "\"");
        }
    }
}