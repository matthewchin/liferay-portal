/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.dbupgrade.transfersampledatalatest.wiki.usecaselarcp;

import com.liferay.portalweb.portal.BaseTestSuite;
import com.liferay.portalweb.portal.dbupgrade.sampledatalatest.wiki.usecase.AddCustomSiteWikiUseCaseTest;
import com.liferay.portalweb.portal.dbupgrade.sampledatalatest.wiki.usecase.AddPageWikiTest;
import com.liferay.portalweb.portal.dbupgrade.sampledatalatest.wiki.usecase.AddPortletWikiSiteTest;
import com.liferay.portalweb.portal.dbupgrade.sampledatalatest.wiki.usecase.PermissionsPortletGuestViewOffTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Brian Wing Shun Chan
 */
public class UseCaseLARCPTests extends BaseTestSuite {
	public static Test suite() {
		TestSuite testSuite = new TestSuite();
		testSuite.addTestSuite(AddCustomSiteWikiUseCaseTest.class);
		testSuite.addTestSuite(AddPageWikiTest.class);
		testSuite.addTestSuite(AddPortletWikiSiteTest.class);
		testSuite.addTestSuite(PermissionsPortletGuestViewOffTest.class);
		testSuite.addTestSuite(ImportExportCPLARWikiUseCaseTest.class);

		return testSuite;
	}
}