/** 
 * (C) Copyright 2014 Chiral Behaviors, LLC. All Rights Reserved
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */
package com.chiral.shackles;

import static org.junit.Assert.assertNotNull;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.junit.Test;

/**
 * @author hparry
 * 
 */
public class ShacklesTest {

	@Test
	public void testFormatPref() {

		IPath path;
		Workspace container;
		IProject ctx = new Project(path, container);
		ProjectScope scope = new ProjectScope(ctx);
		System.out.println(ctx.getName());
		IEclipsePreferences prefs = ProjectScope.INSTANCE
				.getNode("org.eclipse.jdt.ui");
		String pref = prefs.get("text.codetemplates.filecomment", null);
		assertNotNull("Preference must have a value.", pref);
		// IPreferencesService service = PlatformObject.getPreferencesService();
	}

	// private void loadPluginSettings() {
	// Preferences prefs =
	// ConfigurationScope.INSTANCE.getNode("org.eclipse.jdt.ui");
	// // you might want to call prefs.sync() if you're worried about others
	// changing your settings
	// this.someStr = prefs.get("text.codetemplates.filecomment");
	// this.someBool= prefs.getBoolean(KEY2);
	// }

}
