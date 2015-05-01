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

package org.mxupdate.action.mxnames;

import java.util.SortedSet;

import matrix.util.MatrixException;

import org.mxupdate.mapping.TypeDef_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO;

/**
 * Interface definition used to fetch MX names.
 *
 * @author The MxUpdate Team
 */
public interface IFetchMxNames_mxJPO
{
    /**
     * Fetches for given type definition all existing names in MX.
     *
     * @param _paramCache   parameter cache with MX context
     * @param _typeDef      type definition
     * @return found set of names
     * @throws MatrixException
     */
    SortedSet<String> fetch(final ParameterCache_mxJPO _paramCache,
                            final TypeDef_mxJPO _typeDef)
        throws MatrixException;
}
