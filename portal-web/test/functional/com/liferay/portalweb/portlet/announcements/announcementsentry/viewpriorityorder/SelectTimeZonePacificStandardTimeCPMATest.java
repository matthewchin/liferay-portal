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

package com.liferay.portalweb.portlet.announcements.announcementsentry.viewpriorityorder;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class SelectTimeZonePacificStandardTimeCPMATest extends BaseTestCase {
	public void testSelectTimeZonePacificStandardTimeCPMA()
		throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.waitForVisible("link=Joe Bloggs");
		selenium.clickAt("link=Joe Bloggs",
			RuntimeVariables.replace("Joe Bloggs"));
		selenium.waitForElementPresent(
			"//body[contains(@class,'page-maximized')]/div[contains(@class,'aui-helper-hidden')]");
		selenium.waitForVisible("//a[@id='_2_displaySettingsLink']");
		selenium.clickAt("//a[@id='_2_displaySettingsLink']",
			RuntimeVariables.replace("Display Settings"));
		selenium.waitForElementPresent(
			"//div[@id='_2_displaySettings' and contains(@class,'selected')]");
		selenium.waitForVisible("//select[@name='_2_timeZoneId']");
		selenium.select("//select[@name='_2_timeZoneId']",
			RuntimeVariables.replace("(UTC -08:00) Pacific Standard Time"));
		assertEquals("(UTC -08:00) Pacific Standard Time",
			selenium.getSelectedLabel("//select[@name='_2_timeZoneId']"));
		selenium.clickAt("//input[@value='Save']",
			RuntimeVariables.replace("Save"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace(
				"Your request completed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
		assertEquals("(UTC -08:00) Pacific Standard Time",
			selenium.getSelectedLabel("//select[@name='_2_timeZoneId']"));
	}
}