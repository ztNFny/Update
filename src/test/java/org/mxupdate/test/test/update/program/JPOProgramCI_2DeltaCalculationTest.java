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

package org.mxupdate.test.test.update.program;

import org.mxupdate.test.data.program.JPOProgramData;
import org.mxupdate.update.program.ProgramCI_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO;
import org.testng.annotations.Test;

/**
 * Tests the {@link ProgramCI_mxJPO program CI} delta calculation for JPO
 * programs.
 *
 * @author The MxUpdate Team
 */
@Test
public class JPOProgramCI_2DeltaCalculationTest
    extends Abstract_2DeltaCalculationTest<JPOProgramData>
{
    @Override
    protected ProgramCI_mxJPO createNewData(final ParameterCache_mxJPO _paramCache,
                                            final String _name)
    {
        return new ProgramCI_mxJPO(_name);
    }

    @Override
    protected JPOProgramData createNewTestData(final String _name)
    {
        return new JPOProgramData(this, _name);
    }

    @Override
    protected String getKind()
    {
        return "java";
    }
}
