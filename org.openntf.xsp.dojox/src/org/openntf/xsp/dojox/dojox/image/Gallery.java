/*
 * © Copyright Mariusz Jakubowski 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */

package org.openntf.xsp.dojox.dojox.image;

import org.openntf.xsp.annotations.XspComponent;
import org.openntf.xsp.annotations.XspDojoRenderer;

import com.ibm.xsp.extlib.component.dojo.UIDojoWidget;


@XspComponent(
		displayName = "Dojo Gallery", 
		description = "Widget that displays a series of thumbnail sized images, for quick browsing and selection, and a single large image", 
		tagName = "dxGallery",
		paletteCategory = "Extlib DojoX", 
		baseComponentType = "com.ibm.xsp.extlib.dojo.Widget", 
		componentFamily = "javax.faces.Panel" 
)
@XspDojoRenderer(
		baseClass = "com.ibm.xsp.extlib.renderkit.dojo.layout.DojoLayoutRenderer",
		dojoModule = "dojox.image.Gallery",
		defaultDojoType = "dojox.image.Gallery",
		css = { "/.ibmxspres/dojoroot/dojox/image/resources/image.css" }
)
public abstract class Gallery extends UIDojoWidget {

}
