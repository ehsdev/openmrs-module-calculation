/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.calculation.web.extension;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openmrs.module.Extension;
import org.openmrs.module.web.extension.AdministrationSectionExt;

/**
 * Links on the Administration page
 */
public class AdminList extends AdministrationSectionExt {
	
	private static String requiredPrivileges = "View Calculations";
	/**
	 * @see AdministrationSectionExt#getMediaType()
	 */
	public Extension.MEDIA_TYPE getMediaType() {
		return Extension.MEDIA_TYPE.html;
	}
	
	/**
	 * @see AdministrationSectionExt#getRequiredPrivilege()
	 */

	@Override
	public String getRequiredPrivilege() {
		if (requiredPrivileges == null) {
			StringBuilder builder = new StringBuilder();
			requiredPrivileges = builder.toString();
		}
		return requiredPrivileges;
	}	
	
	/**
	 * @see AdministrationSectionExt#getTitle()
	 */
	public String getTitle() {
		return "calculation.title";
	}
	
	/**
	 * @see AdministrationSectionExt#getLinks()
	 */
	public Map<String, String> getLinks() {
		Map<String, String> localHashMap = new LinkedHashMap<String, String>();
		localHashMap.put("/module/calculation/calculationRegistrations.list", "calculation.CalculationRegistration.manage.linkTitle");
		return localHashMap;
	}
}
